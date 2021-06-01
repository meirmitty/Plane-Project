package planes.aircrafts.jets;

import planes.aircrafts.attackTypes.Attacking;
import planes.aircrafts.attackTypes.Validation;
import planes.sideStuff.Cameras;
import planes.sideStuff.Coordinates;
import planes.sideStuff.Status;
import planes.sideStuff.TypeOfMissle;


public class F16 extends FighterJet implements Attacking, Validation {
    public F16() {
    }

    private Cameras camera;
    private int amountOfMissles;
    private TypeOfMissle typeOfMissle;


    public F16(int hoursSinceLastRepair, Status status, Coordinates base, int missles, TypeOfMissle typeOfMissle, Cameras camera) {
        super(hoursSinceLastRepair, status, base);
        setAmountOfMissles(missles);
        setTypeOfMissles(typeOfMissle);
        setCamera(camera);
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
    public void setCamera(Cameras camera) {
        this.camera = camera;
    }
}
