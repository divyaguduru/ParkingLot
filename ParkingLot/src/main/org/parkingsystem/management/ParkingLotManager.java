
package main.org.parkingsystem.management;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import main.org.parkingsystem.enums.State;
import main.org.parkingsystem.model.impl.Car;
import main.org.parkingsystem.model.impl.Slot;

public class ParkingLotManager {
   
	Car car;
	Slot slot;
	List slots=new ArrayList(600);
	Map<Integer,Car> parkedcars=new HashMap<Integer,Car>();
	public int initializeParkingLot(int totalslots){
		if (slots.size()==0){
        for(int i=1;i<=totalslots;i++){
			slots.add( new Slot(i));
		}
        return slots.size();
		}
		return totalslots;
	}
	
	public Slot parkCar(String vehicleNumber,String color){
		car=new Car(vehicleNumber,color);
		if((slot=getFirstEmptySlot())!= null){
			park(slot,car);
			return slot;
		}
		return null;
	}
	
	public Slot getFirstEmptySlot(){
		Iterator<Slot> slotIterator = slots.iterator();
        boolean isSlotFound = false;
        Slot emptySlot = null;
 
        while (slotIterator.hasNext() && !isSlotFound) {
            emptySlot = slotIterator.next();
            if (emptySlot.getStatus()==State.UNPARKED) {
                isSlotFound = true;
                break;
            }
        }
        return emptySlot;
	}
	
	public void park(Slot currentSlot,Car car){
		currentSlot.park();
		parkedcars.put(currentSlot.getSlotNumber(),car);
	}
	
	public boolean unPark(int unparkSlot) {
		 Iterator<Slot> slotIterator = slots.iterator();
	     Slot currentUnparkSlot = null;
	     	while (slotIterator.hasNext()) {
	        	currentUnparkSlot = slotIterator.next();
	            if (currentUnparkSlot.getSlotNumber()==unparkSlot && currentUnparkSlot.getStatus()==State.PARKED) {
	                currentUnparkSlot.unPark();
	                parkedcars.remove(unparkSlot);
	                return true;
	            }
	            else if(currentUnparkSlot.getSlotNumber()==unparkSlot && currentUnparkSlot.getStatus()==State.UNPARKED){
	            	return false;
	            }
	        }
	     	
			return false;
    }

	public Map<Integer, Car> getStatus() {
		return parkedcars;
	}
}
