package main.org.parkingsystem.command.impl;

import main.org.parkingsystem.command.ICommand;
import main.org.parkingsystem.impl.ParkingLotManager;

public class UnparkVehicleCommand implements ICommand{
	ParkingLotManager parkingLotBuilder;
	int slotNumber;
	@Override
	public boolean execute(String commandInput) {
		// TODO Auto-generated method stub
		char[] inputToCharArray=commandInput.toCharArray();
		slotNumber=Integer.parseInt(String.valueOf(inputToCharArray[1]));
		parkingLotBuilder.unPark(slotNumber);
		return true;
	}

}
