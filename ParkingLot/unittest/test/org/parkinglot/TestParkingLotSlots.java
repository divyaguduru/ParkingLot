package test.org.parkinglot;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.org.parkingsystem.impl.ParkingLotManager;
import main.org.parkingsystem.model.impl.Car;
import main.org.parkingsystem.model.impl.Slot;

public class TestParkingLotSlots {

ParkingLotManager parkingLot= new ParkingLotManager();

	@Test
	public void testSlots() {
		int slotsAssigned=600;
		int totalSlots=parkingLot.initializeParkingLot(slotsAssigned);
		assertEquals(slotsAssigned,totalSlots);
	}
	
	@Test
	public void testParkCar(){
		String regNo="KA-XYZ-123";
		String color="black";
		Slot slot=parkingLot.parkCar(regNo, color);
		assertNotNull(slot);
	}
	
	@Test
	public void testUnParkCar(){
		boolean result=parkingLot.unPark(1);
		assertEquals(true,result);
	}

}
