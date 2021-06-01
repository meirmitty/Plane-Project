package planes.aircrafts.drones.hermon;

import planes.aircrafts.attackTypes.Intelligence;
import planes.aircrafts.attackTypes.Validation;
import planes.aircrafts.drones.hermon.Hermon;
import planes.sideStuff.Cameras;
import planes.sideStuff.Coordinates;
import planes.sideStuff.Sensors;
import planes.sideStuff.Status;

public class Zik extends Hermon implements Intelligence, Validation {
    private Sensors sensors;
    private Cameras cameras;

    @Override
    public void setSensor(Sensors sensor) {
        this.sensors = sensor;
    }

    public Zik(int hoursSinceLastRepair, Status status, Coordinates base, Sensors sensors, Cameras cameras) {
        super(hoursSinceLastRepair, status, base);
        this.sensors = sensors;
        this.cameras = cameras;
    }

    @Override
    public void setCamera(Cameras camera) {
        this.cameras = camera;
    }
}
