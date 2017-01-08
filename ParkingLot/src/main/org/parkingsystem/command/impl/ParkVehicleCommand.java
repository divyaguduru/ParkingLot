package main.org.parkingsystem.command.impl;

import main.org.parkingsystem.command.ICommand;
import main.org.parkingsystem.impl.ParkingLotManager;
import main.org.parkingsystem.impl.TicketManager;
import main.org.parkingsystem.model.impl.Slot;

public class ParkVehicleCommand implements ICommand{
	ParkingLotManager parkingLotBuilder;
	TicketManager ticketManager;
	String vehicleNumber;
	String vehicleColor;
	Slot slot;
	@Override
	public boolean execute(String commandInput) {
		// TODO Auto-generated method stub
		char[] inputToCharArray=commandInput.toCharArray();
		vehicleNumber=String.valueOf(inputToCharArray[1]);
		vehicleColor= String.valueOf(inputToCharArray[2]);
		slot=parkingLotBuilder.parkCar(vehicleNumber,vehicleColor);
		ticketManager.printTicket(slot,vehicleNumber,vehicleColor);
		return false;
	}

}
