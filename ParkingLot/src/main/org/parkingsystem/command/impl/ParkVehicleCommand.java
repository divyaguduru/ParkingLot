package main.org.parkingsystem.command.impl;

import main.org.parkingsystem.command.ICommand;
import main.org.parkingsystem.impl.ParkingLotManager;
import main.org.parkingsystem.impl.TicketManager;
import main.org.parkingsystem.model.impl.Slot;

public class ParkVehicleCommand{
	ParkingLotManager parkingLotBuilder;
	TicketManager ticketManager;
	String vehicleNumber;
	String vehicleColor;
	Slot slot;
	public void execute(String commandInput) {
		// TODO Auto-generated method stub
		char[] inputToCharArray=commandInput.toCharArray();
		if(inputToCharArray[1]!= ' ' && inputToCharArray[2]!=' '){
			vehicleNumber=String.valueOf(inputToCharArray[1]);
			vehicleColor= String.valueOf(inputToCharArray[2]);
			slot=parkingLotBuilder.parkCar(vehicleNumber,vehicleColor);
			System.out.println("Allocated slot number:"+slot);
			ticketManager.printTicket(slot,vehicleNumber,vehicleColor);
		}
		
	}

}
