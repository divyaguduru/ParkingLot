package main.org.parkingsystem.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import main.org.parkingsystem.command.impl.CreateParkingLotCommand;
import main.org.parkingsystem.command.impl.ParkVehicleCommand;
import main.org.parkingsystem.command.impl.UnparkVehicleCommand;
import main.org.parkingsystem.criteria.impl.ParkingLotStateFilter;
import main.org.parkingsystem.criteria.impl.RegistrationNumbersWithColorFilter;
import main.org.parkingsystem.criteria.impl.SlotNumberWithRegistrationNumberFilter;
import main.org.parkingsystem.criteria.impl.SlotNumbersWithColorFilter;

public class FileProcessor {
     
	CreateParkingLotCommand parkinglotcommand;
    ParkVehicleCommand parkvehiclecommand;
    UnparkVehicleCommand unparkvehiclecommand;
    ParkingLotStateFilter parkinglotstate;
    SlotNumbersWithColorFilter slotsNumbersWithColor;
    SlotNumberWithRegistrationNumberFilter slotNumberWithRegNo;
    RegistrationNumbersWithColorFilter regNoWithColor;
	 public void processFile(String path,String input,String output){
			
		  try
		  {
		    BufferedReader reader = new BufferedReader(new FileReader(input));
		    String line;
		    while ((line = reader.readLine()) != null)
		    {
		    	String commandInput=line;
		    	processCommandInput(commandInput);
		    }
		   
		  }
		  catch (Exception e)
		  {
		    System.err.format("Exception occurred trying to read '%s'."+ e.getMessage());
		    e.printStackTrace();
		  }
		}
	 
	 public void processCommandInput(String commandInput){
		 if(commandInput.contains("create_parking_lot")){
	    		parkinglotcommand.execute(commandInput);
	    	}
         else if(commandInput.contains("park")){
	    		parkvehiclecommand.execute(commandInput);
	    	}
	    	else if(commandInput.contains("leave")){
	    		unparkvehiclecommand.execute(commandInput);
	    	}
	    	else if(commandInput.contains("status")){
	    		parkinglotstate.applyCriteria(commandInput);
	    	}	
	    	else if(commandInput.contains("registration_numbers_for_cars_with_colour")){
	    		List aa=regNoWithColor.applyCriteria(commandInput);
	    	}
	    	else if(commandInput.contains("slot_numbers_for_cars_with_colour")){
	    		slotsNumbersWithColor.applyCriteria(commandInput);
	    	}
	    	else if(commandInput.contains("slot_number_for_registration_number")){
	    		slotNumberWithRegNo.applyCriteria(commandInput);
	    	}
	    	else{
	    		
	    	}
	 }
}
