package com.klcanteen.dto;

public class DeliveryLocationDto {

    private String orderId;
    private double latitude;
    private double longitude;
    private String status;
    private long lastUpdated;

    public DeliveryLocationDto() {}

    public DeliveryLocationDto(String orderId, double latitude, double longitude, String status, long lastUpdated) {
        this.orderId = orderId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.status = status;
        this.lastUpdated = lastUpdated;
    }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }

    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public long getLastUpdated() { return lastUpdated; }
    public void setLastUpdated(long lastUpdated) { this.lastUpdated = lastUpdated; }
}
