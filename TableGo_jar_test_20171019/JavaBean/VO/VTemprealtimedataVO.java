/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:5.8.0
 */

import java.util.Date;

/**
 * V_TEMPREALTIMEDATA
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class VTemprealtimedataVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 544153307826033312L;

    /** deviceId */
    private Integer deviceId;

    /** channelNumber */
    private Integer channelNumber;

    /** location */
    private String location;

    /** locationDetails */
    private String locationDetails;

    /** value */
    private Float value;

    /** alarm */
    private Integer alarm;

    /** updatetime */
    private Date updatetime;

    /** times */
    private Integer times;

    /**
     * 获取deviceId
     * 
     * @return deviceId
     */
    public Integer getDeviceId() {
        return this.deviceId;
    }

    /**
     * 设置deviceId
     * 
     * @param deviceId
     */
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 获取channelNumber
     * 
     * @return channelNumber
     */
    public Integer getChannelNumber() {
        return this.channelNumber;
    }

    /**
     * 设置channelNumber
     * 
     * @param channelNumber
     */
    public void setChannelNumber(Integer channelNumber) {
        this.channelNumber = channelNumber;
    }

    /**
     * 获取location
     * 
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * 设置location
     * 
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 获取locationDetails
     * 
     * @return locationDetails
     */
    public String getLocationDetails() {
        return this.locationDetails;
    }

    /**
     * 设置locationDetails
     * 
     * @param locationDetails
     */
    public void setLocationDetails(String locationDetails) {
        this.locationDetails = locationDetails;
    }

    /**
     * 获取value
     * 
     * @return value
     */
    public Float getValue() {
        return this.value;
    }

    /**
     * 设置value
     * 
     * @param value
     */
    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * 获取alarm
     * 
     * @return alarm
     */
    public Integer getAlarm() {
        return this.alarm;
    }

    /**
     * 设置alarm
     * 
     * @param alarm
     */
    public void setAlarm(Integer alarm) {
        this.alarm = alarm;
    }

    /**
     * 获取updatetime
     * 
     * @return updatetime
     */
    public Date getUpdatetime() {
        return this.updatetime;
    }

    /**
     * 设置updatetime
     * 
     * @param updatetime
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 获取times
     * 
     * @return times
     */
    public Integer getTimes() {
        return this.times;
    }

    /**
     * 设置times
     * 
     * @param times
     */
    public void setTimes(Integer times) {
        this.times = times;
    }
}