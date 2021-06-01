package planes.aircrafts.drones.haron;

import planes.Main;
import planes.aircrafts.drones.Drone;
import planes.sideStuff.Coordinates;
import planes.sideStuff.Status;

public abstract class Haron extends Drone {
    public Haron() {
    }

    public Haron(int hoursSinceLastRepair, Status status, Coordinates base) {
        super(hoursSinceLastRepair, status, Main.MAX_HOURS_FOR_HARON, base);
    }
}
