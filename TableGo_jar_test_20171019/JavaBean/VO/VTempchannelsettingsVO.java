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
 * V_TEMPCHANNELSETTINGS
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class VTempchannelsettingsVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 3325016184813549120L;

    /** deviceId */
    private Integer deviceId;

    /** channelNumber */
    private Integer channelNumber;

    /** location */
    private String location;

    /** locationDetails */
    private String locationDetails;

    /** alarmValue */
    private Float alarmValue;

    /** createtime */
    private Date createtime;

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
     * 获取alarmValue
     * 
     * @return alarmValue
     */
    public Float getAlarmValue() {
        return this.alarmValue;
    }

    /**
     * 设置alarmValue
     * 
     * @param alarmValue
     */
    public void setAlarmValue(Float alarmValue) {
        this.alarmValue = alarmValue;
    }

    /**
     * 获取createtime
     * 
     * @return createtime
     */
    public Date getCreatetime() {
        return this.createtime;
    }

    /**
     * 设置createtime
     * 
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}