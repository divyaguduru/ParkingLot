package main.org.parkingsystem.model.impl;

public class Slot {

private State status;    
private int slotNumber;
 
 
public Slot(int slotNumber) {
    status = State.UNPARKED;
    this.slotNumber = slotNumber;    
}
 
public State getStatus() {
    return status;
}
 
public int getSlotNumber() {
    return slotNumber;
}
 
public void park() {
    status = State.PARKED;
} 
 
public void unPark() {
   status = State.UNPARKED;
}
 
@Override
public boolean equals(Object o) {
    return (((Slot) o).slotNumber == this.slotNumber);
}

@Override
public int hashCode() {
    int hash = 5;
    hash = 53 * hash + this.slotNumber;
    return hash;
}  
}
