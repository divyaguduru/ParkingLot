package main.org.parkingsystem.criteria.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.org.parkingsystem.impl.ParkingLotManager;
import main.org.parkingsystem.model.impl.Car;

public class SlotNumberWithRegistrationNumberFilter {
	ParkingLotManager parkingLotManager;
	Map<Integer,Car> currentParkingLotStatus=new HashMap<Integer,Car>();
	List<Integer> slotsNoList=new ArrayList<Integer>();
	
	public void applyCriteria(String input) {
		// TODO Auto-generated method stub
		char[] inputToCharArray=input.toCharArray();
		String regno=String.valueOf(inputToCharArray[1]);
		currentParkingLotStatus=parkingLotManager.getStatus();
		for (Integer carslotno : currentParkingLotStatus.keySet()) {
			Car car=currentParkingLotStatus.get(carslotno);
		    if(car.getCarno().equals(regno)){
		    	System.out.print(carslotno+",");
		    }
		}
		System.out.println("");
	}

}
