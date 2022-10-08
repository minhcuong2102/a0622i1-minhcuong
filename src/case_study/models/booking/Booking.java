package case_study.models.booking;

import java.util.Date;

public class Booking {
    private int bookingId;
    private Date dayBegin;
    private Date dayEnd;
    private int customerId;
    private String serviceName;
    private String serviceType;

    public Booking(int bookingId, Date dayBegin, Date dayEnd, int customerId, String serviceName, String serviceType) {
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

    public Date getDayBegin() {
        return dayBegin;
    }

    public void setDayBegin(Date dayBegin) {
        this.dayBegin = dayBegin;
    }

    public Date getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(Date dayEnd) {
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
