package case_study.models.booking;

public class Booking {
    private int bookingId;
    private String dayBegin;
    private String dayEnd;
    private int customerId;
    private String serviceName;
    private String serviceType;

    public Booking(int bookingId, String dayBegin, String dayEnd, int customerId, String serviceName, String serviceType) {
        this.bookingId = bookingId;
        this.dayBegin = dayBegin;
        this.dayEnd = dayEnd;
        this.customerId = customerId;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getDayBegin() {
        return dayBegin;
    }

    public void setDayBegin(String dayBegin) {
        this.dayBegin = dayBegin;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
