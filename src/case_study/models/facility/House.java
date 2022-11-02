package case_study.models.facility;

import java.io.Serializable;

public class House extends Facility implements Serializable {
    private String roomStandard;
    private double poolArea;

    public House(){

    }

    public House(String roomStandard, double poolArea) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
    }

    public House(int id, String serviceName, double usingArea, int rentCost, int personCap,
                 String rentType, String roomStandard, double poolArea) {
        super(id, serviceName, usingArea, rentCost, personCap, rentType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
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

    public String toString() {
        return this.getId() + "," + this.getServiceName() + "," + this.getUsingArea() + "," +
                this.getRentCost() + "," + this.getPersonCap() + "," + this.getRentType() + "," +
                this.getRoomStandard() + "," + this.getPoolArea();
    }
}
