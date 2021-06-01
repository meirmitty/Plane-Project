package planes.aircrafts.drones;

import planes.aircrafts.Aircraft;
import planes.sideStuff.Coordinates;
import planes.sideStuff.Status;

public abstract class Drone extends Aircraft {
    public Drone() {
    }

    public Drone(int hoursSinceLastRepair, Status status, int maxHoursWithoutRepair, Coordinates base) {
        super(hoursSinceLastRepair, status, maxHoursWithoutRepair, base);
    }

    public void hoverOverLocation(Coordinates coordinates){
    this.setStatus(Status.IN_THE_AIR);
    System.out.println("Hovering over"+ coordinates.toString());
}
}
