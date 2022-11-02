package case_study.models.facility;

import java.io.Serializable;

public class Villa extends Facility implements Serializable {
    private String roomStandard;
    private double poolArea;
    private int floor;

    public Villa(String roomStandard, double poolArea, int floor) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public Villa(int id, String serviceName, double usingArea, int rentCost, int personCap,
                 String rentType, String roomStandard, double poolArea, int floor) {
        super(id, serviceName, usingArea, rentCost, personCap, rentType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return this.getId() + "," + this.getServiceName() + "," + this.getUsingArea() + "," +
                this.getRentCost() + "," + this.getPersonCap() + "," + this.getRentType() + "," +
                this.getRoomStandard() + "," + this.getPoolArea() + "," + this.getFloor();
    }
}
