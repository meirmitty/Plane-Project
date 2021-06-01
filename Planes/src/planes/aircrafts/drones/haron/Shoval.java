package planes.aircrafts.drones.haron;

import planes.aircrafts.attackTypes.Attacking;
import planes.aircrafts.attackTypes.Intelligence;
import planes.aircrafts.attackTypes.Validation;
import planes.sideStuff.*;


public class Shoval extends Haron implements Intelligence, Attacking, Validation {
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

    public Shoval(int hoursSinceLastRepair, Status status, Coordinates base, int amountOfMissles, TypeOfMissle typeOfMissle, Sensors sensors, Cameras camera) {
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
