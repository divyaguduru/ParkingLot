package main.org.parkingsystem.command.impl;

import main.org.parkingsystem.command.ICommand;
import main.org.parkingsystem.impl.ParkingLotManager;

public class CreateParkingLotCommand implements ICommand{
	ParkingLotManager parkingLotBuilder;
	@Override
	public boolean execute(String commandInput) {
		// TODO Auto-generated method stub
		char[] inputToCharArray=commandInput.toCharArray();
		int readSlotsNumber=Integer.parseInt(String.valueOf(inputToCharArray[1]));
		parkingLotBuilder.initializeParkingLot(readSlotsNumber);
		return true;
	}

}
