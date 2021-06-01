package planes.aircrafts;

import planes.sideStuff.Coordinates;
import planes.sideStuff.Status;

public abstract class Aircraft {
    private int hoursSinceLastRepair;
    private Status status;
    private int maxHoursWithoutRepair;

    public int getHoursSinceLastRepair() {
        return hoursSinceLastRepair;
    }

    public void setHoursSinceLastRepair(int hoursSinceLastRepair) {
        this.hoursSinceLastRepair = hoursSinceLastRepair;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Coordinates getBase() {
        return base;
    }

    public void setBase(Coordinates base) {
        this.base = base;
    }

    private Coordinates base;

    protected Aircraft() {
    }

    public void flyTo(Coordinates coordinates) {
        if (this.status == Status.READY) {
            System.out.println("flying to " + coordinates.toString());
            this.status = Status.IN_THE_AIR;
        } else {
            System.out.println("Aircraft not ready to fly");
        }
    }

    public void land(Coordinates coordinates) {
        System.out.println("Landing in " + coordinates.toString());
        this.check();
    }

    public void check() {
        if (this.hoursSinceLastRepair > this.maxHoursWithoutRepair) {
            this.status = Status.NOT_READY;
            this.repair();
        } else {
            this.status = Status.READY;
        }
    }

    public Aircraft(int hoursSinceLastRepair, Status status, int maxHoursWithoutRepair, Coordinates base) {
        this.hoursSinceLastRepair = hoursSinceLastRepair;
        this.status = status;
        this.maxHoursWithoutRepair = maxHoursWithoutRepair;
        this.base = base;
    }

    public void repair() {
        System.out.println("Repairing plane");
        this.hoursSinceLastRepair = 0;
        this.status = Status.READY;
    }

    public int getMaxHoursWithoutRepair() {
        return maxHoursWithoutRepair;
    }

    public void setMaxHoursWithoutRepair(int maxHoursWithoutRepair) {
        this.maxHoursWithoutRepair = maxHoursWithoutRepair;
    }
}
