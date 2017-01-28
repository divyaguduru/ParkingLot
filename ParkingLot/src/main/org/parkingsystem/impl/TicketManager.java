package main.org.parkingsystem.impl;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import main.org.parkingsystem.model.impl.Car;
import main.org.parkingsystem.model.impl.Slot;
import main.org.parkingsystem.model.impl.Ticket;

public class TicketManager {
	
	public void printTicket(Slot slot,String vehicleNumber, String color){
		try{
			String ticketNumber=Integer.toString(slot.getSlotNumber()).concat(vehicleNumber);
			String path="C://ParkingLot/"+ticketNumber+".txt";
			File file = new File(path); 
		    PrintWriter writer = new PrintWriter(file);
		    writer.println("Slot no:"+ slot);
		    writer.println("Car no:"+ vehicleNumber);
		    writer.println("Car color:"+ color);
		    writer.close();
		    
		} catch (IOException e) {
		}
	}
}
