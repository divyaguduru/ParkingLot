package main.org.parkingsystem.criteria.impl;

import java.util.HashMap;
import java.util.Map;

import main.org.parkingsystem.criteria.ICriteria;
import main.org.parkingsystem.impl.ParkingLotManager;
import main.org.parkingsystem.model.impl.Car;

public class ParkingLotStateFilter implements ICriteria{
	ParkingLotManager parkingLotManager;
	Map<Integer,Car> currentParkingLotStatus=new HashMap<Integer,Car>();
	public void applyCriteria(String commandInput) {
		// TODO Auto-generated method stub
		if(commandInput.equals("status")){
			System.out.println("Slot Number"+"    "+"RegistrationNumber"+"    "+"Color");
			currentParkingLotStatus=parkingLotManager.getStatus();
			for (Map.Entry<Integer, Car> entry : currentParkingLotStatus.entrySet()) {
			    System.out.println(entry.getKey() + "    " + entry.getValue().getCarno()+"   "+entry.getValue().getColor());
			}
		}
		
	}

}
