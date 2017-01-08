package main.org.parkingsystem.criteria.impl;

import java.util.HashMap;
import java.util.Map;

import main.org.parkingsystem.impl.ParkingLotManager;
import main.org.parkingsystem.model.impl.Car;

public class ParkingLotStateFilter{
	ParkingLotManager parkingLotManager;
	Map<Integer,Car> currentParkingLotStatus=new HashMap<Integer,Car>();
	public Map<Integer,Car> applyCriteria(String commandInput) {
		// TODO Auto-generated method stub
		if(commandInput.equals("status")){
			currentParkingLotStatus=parkingLotManager.getStatus();
		}
		return null;
	}

}
