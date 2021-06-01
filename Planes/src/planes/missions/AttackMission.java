package planes.missions;

import planes.aircrafts.Aircraft;
import planes.aircrafts.attackTypes.Attacking;
import planes.sideStuff.Coordinates;

public class AttackMission extends Mission {

    private String target;

    public AttackMission(String target, Coordinates coords, String pilot, Aircraft aircraft) {
        super(coords, pilot, (Aircraft) aircraft);
        this.target = target;
    }

    @Override
    public String executeMission() {
        return "execute mission";
    }
}
