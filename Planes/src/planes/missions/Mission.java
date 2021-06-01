package planes.missions;

import planes.aircrafts.Aircraft;
import planes.sideStuff.Coordinates;

public abstract class Mission {
    private Coordinates coordinates;
    private String pilot;
    private Aircraft aircraft;

    public Mission(Coordinates coordinates, String pilot, Aircraft aircraft) {
        this.coordinates = coordinates;
        this.pilot = pilot;
        this.aircraft = aircraft;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public void begin() {
        System.out.println("Beginning Mission!");
        this.aircraft.flyTo(this.coordinates);
    }

    public void cancel() {
        System.out.println("Abort Mission!");
        this.aircraft.land(this.aircraft.getBase());
    }

    public void finish() {
        this.executeMission();
        this.aircraft.land(this.aircraft.getBase());
        System.out.println("Finish Mission!");
    }

    public abstract String executeMission();
}
