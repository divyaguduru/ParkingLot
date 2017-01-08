package test.org.parkinglot;

import static org.junit.Assert.*;

import org.junit.Test;

import main.org.parkingsystem.impl.ParkingLotManager;
import main.org.parkingsystem.model.impl.Car;

public class TestParkingLotSlots {
int slot;
ParkingLotManager ps= new ParkingLotManager();
//Car car=new Car(slot, null);
	@Test
	public void testSlots() {
		int slots=600;
		//slot=ps.parkCar(Car car);
		assertEquals(600,slot);
		//fail("Not yet implemented");
	}

}
