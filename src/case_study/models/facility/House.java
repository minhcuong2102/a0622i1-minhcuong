package case_study.models.facility;

import java.util.Date;

public class House extends Facility{
    private String roomStandard;
    private double poolArea;

    public House(){

    }

    public House(String roomStandard, double poolArea) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
    }

    public House(String serviceName, double usingArea, int rentCost, int personCap, Date rentType, String roomStandard, double poolArea) {
        super(serviceName, usingArea, rentCost, personCap, rentType);
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
}
