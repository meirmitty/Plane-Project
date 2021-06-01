package planes.missions;

import planes.aircrafts.Aircraft;
import planes.aircrafts.attackTypes.Validation;
import planes.sideStuff.Coordinates;

public class ValidationMission extends Mission {

    String objective;

    public ValidationMission(String objective, Coordinates coordinates, String pilot, Validation aircraft) {
        super(coordinates, pilot, (Aircraft) aircraft);
        this.objective = objective;
    }

    @Override
    public String executeMission() {
        return "validation mission";
    }
}
