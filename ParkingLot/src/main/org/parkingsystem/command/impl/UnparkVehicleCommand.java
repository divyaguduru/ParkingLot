package main.org.parkingsystem.command.impl;

import main.org.parkingsystem.command.ICommand;
import main.org.parkingsystem.impl.ParkingLotManager;

public class UnparkVehicleCommand implements ICommand{
	ParkingLotManager parkingLotBuilder;
	int slotNumber;
	public void execute(String commandInput) {
		// TODO Auto-generated method stub
		
		char[] inputToCharArray=commandInput.toCharArray();
		
		if(inputToCharArray[1]!= ' '){
		
			slotNumber=Integer.parseInt(String.valueOf(inputToCharArray[1]));
		
			boolean result=parkingLotBuilder.unPark(slotNumber);
		
			if(result==true){
					System.out.println("Slot number"+slotNumber+"is Free");
				}
		}
	}

}
