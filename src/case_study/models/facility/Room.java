package case_study.models.facility;

import java.io.Serializable;

public class Room extends Facility implements Serializable {
    private String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(int id, String serviceName, double usingArea, int rentCost, int personCap, String rentType, String freeService) {
        super(id, serviceName, usingArea, rentCost, personCap, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public String toString() {
        return this.getId() + "," + this.getServiceName() + "," + this.getUsingArea() + "," +
                this.getRentCost() + "," + this.getPersonCap() + "," + this.getRentType() + "," +
                this.getFreeService();
    }
}
