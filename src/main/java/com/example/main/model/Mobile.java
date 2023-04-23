package com.example.main.model;

public class Mobile {

    private Long deviceId;
    private String model;
    private String manu;

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
    }

    public Mobile(Long deviceId, String model, String manu) {
        this.deviceId = deviceId;
        this.model = model;
        this.manu = manu;
    }

    public Mobile() {
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "deviceId=" + deviceId +
                ", model='" + model + '\'' +
                ", manu='" + manu + '\'' +
                '}';
    }
}
