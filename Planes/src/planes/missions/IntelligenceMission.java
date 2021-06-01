package planes.missions;

import planes.aircrafts.Aircraft;
import planes.aircrafts.attackTypes.Intelligence;
import planes.sideStuff.Coordinates;

public class IntelligenceMission extends Mission {

    String region;

    public IntelligenceMission(String region,Coordinates coordinates, String pilot, Intelligence aircraft) {
        super(coordinates, pilot, (Aircraft) aircraft);
        this.region= region;
    }


    @Override
    public String executeMission() {
        return "intel mission";
    }
}
