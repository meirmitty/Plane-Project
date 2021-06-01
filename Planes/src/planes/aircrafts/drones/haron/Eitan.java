package planes.aircrafts.drones.haron;

import planes.aircrafts.attackTypes.Attacking;
import planes.aircrafts.attackTypes.Intelligence;
import planes.sideStuff.Coordinates;
import planes.sideStuff.Sensors;
import planes.sideStuff.Status;
import planes.sideStuff.TypeOfMissle;


public class Eitan extends Haron implements Attacking, Intelligence {
    private int amountOfMissles;
    private TypeOfMissle typeOfMissle;
    private Sensors sensors;

    public Eitan(int hoursSinceLastRepair, Status status, Coordinates base, int amountOfMissles, TypeOfMissle typeOfMissle, Sensors sensors) {
        super(hoursSinceLastRepair, status, base);
        this.amountOfMissles = amountOfMissles;
        this.typeOfMissle = typeOfMissle;
        this.sensors = sensors;
    }

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
}
