package planes.aircrafts.jets;

import planes.Main;
import planes.aircrafts.Aircraft;
import planes.sideStuff.Coordinates;
import planes.sideStuff.Status;

public abstract class FighterJet extends Aircraft {

    public FighterJet() {
    }

    public FighterJet(int hoursSinceLastRepair, Status status, Coordinates base) {
        super(hoursSinceLastRepair, status, Main.MAX_HOURS_FOR_JET, base);
    }
}
