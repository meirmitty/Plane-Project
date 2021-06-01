package planes.aircrafts.drones.hermon;

import planes.aircrafts.attackTypes.Attacking;
import planes.aircrafts.attackTypes.Intelligence;
import planes.aircrafts.attackTypes.Validation;
import planes.aircrafts.drones.hermon.Hermon;
import planes.sideStuff.*;

public class Kochav extends Hermon implements Attacking, Intelligence, Validation {
    private int amountOfMissles;
    private TypeOfMissle typeOfMissle;
    private Sensors sensors;
    private Cameras camera;

    @Override
    public void setAmountOfMissles(int amount) {
        this.amountOfMissles = amount;
    }

    @Override
    public void setTypeOfMissles(TypeOfMissle typeOfMissle) {
        this.typeOfMissle = typeOfMissle;
    }

    @Override
    public void setSensor(Sensors sensor) {
        this.sensors = sensor;
    }

    public Kochav(int hoursSinceLastRepair, Status status, Coordinates base, int amountOfMissles, TypeOfMissle typeOfMissle, Sensors sensors, Cameras camera) {
        super(hoursSinceLastRepair, status, base);
        this.amountOfMissles = amountOfMissles;
        this.typeOfMissle = typeOfMissle;
        this.sensors = sensors;
        this.camera = camera;
    }

    @Override
    public void setCamera(Cameras camera) {
        this.camera = camera;
    }
}
