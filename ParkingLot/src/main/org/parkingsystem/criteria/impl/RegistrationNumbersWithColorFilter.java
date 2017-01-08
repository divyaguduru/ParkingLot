package main.org.parkingsystem.criteria.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.org.parkingsystem.impl.ParkingLotManager;
import main.org.parkingsystem.model.impl.Car;

public class RegistrationNumbersWithColorFilter{
	ParkingLotManager parkingLotManager;
	Map<Integer,Car> currentParkingLotStatus=new HashMap<Integer,Car>();
	List<String> regNoList=new ArrayList<String>();
	public List<String> applyCriteria(String input) {
		// TODO Auto-generated method stub
		char[] inputToCharArray=input.toCharArray();
		String color=String.valueOf(inputToCharArray[1]);
		currentParkingLotStatus=parkingLotManager.getStatus();
		for (Car car : currentParkingLotStatus.values()) {
		    if(car.getColor()==color){
		    	regNoList.add(car.getCarno());
		    }
		}
		return regNoList;
	}

}
