package case_study.models.facility;

public abstract class Facility {
    private String serviceName;
    private double usingArea;
    private int rentCost;
    private int personCap;
    private String rentType;

    public Facility(){

    }

    public Facility(String serviceName, double usingArea, int rentCost, int personCap, String rentType) {
        this.serviceName = serviceName;
        this.usingArea = usingArea;
        this.rentCost = rentCost;
        this.personCap = personCap;
        this.rentType = rentType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsingArea() {
        return usingArea;
    }

    public void setUsingArea(double usingArea) {
        this.usingArea = usingArea;
    }

    public int getRentCost() {
        return rentCost;
    }

    public void setRentCost(int rentCost) {
        this.rentCost = rentCost;
    }

    public int getPersonCap() {
        return personCap;
    }

    public void setPersonCap(int personCap) {
        this.personCap = personCap;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }
}
