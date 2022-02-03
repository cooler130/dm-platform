package com.cooler.ai.platform.facade.model;

/**
 * @Author zhangsheng
 * @Description
 * @Date 2018/12/30
 **/

public class LocationInfo implements java.io.Serializable{
    private Integer latitude;
    private Integer longitude;
    private String cityName;

    public LocationInfo() {
    }

    public LocationInfo(Integer latitude, Integer longitude, String cityName) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.cityName = cityName;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
