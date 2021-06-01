package planes.aircrafts.drones.hermon;

import planes.Main;
import planes.aircrafts.drones.Drone;
import planes.sideStuff.Coordinates;
import planes.sideStuff.Status;

public abstract class Hermon extends Drone {
    public Hermon() {
    }

    public Hermon(int hoursSinceLastRepair, Status status,  Coordinates base) {
        super(hoursSinceLastRepair, status, Main.MAX_HOURS_FOR_HERMON, base);
    }
}
