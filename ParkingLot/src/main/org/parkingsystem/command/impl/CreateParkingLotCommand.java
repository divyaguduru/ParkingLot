package main.org.parkingsystem.command.impl;

import main.org.parkingsystem.command.ICommand;
import main.org.parkingsystem.impl.ParkingLotManager;

public class CreateParkingLotCommand implements ICommand{
	ParkingLotManager parkingLotBuilder;
	@Override
	public void execute(String commandInput) {
		// TODO Auto-generated method stub
		char[] inputToCharArray=commandInput.toCharArray();
		if(inputToCharArray[1]!=' ' && Character.isDigit(inputToCharArray[1])){
			int readSlotsNumber=Integer.parseInt(String.valueOf(inputToCharArray[1]));
			if(readSlotsNumber!=0){
				int size=parkingLotBuilder.initializeParkingLot(readSlotsNumber);
				if(size==readSlotsNumber){
				System.out.println("Created a parking lot with"+readSlotsNumber+"slots");
				}
			}
		}
	}

}
