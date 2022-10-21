package case_study.models.facility;

public class Room extends Facility{
    private String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceName, double usingArea, int rentCost, int personCap, String rentType, String freeService) {
        super(serviceName, usingArea, rentCost, personCap, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
