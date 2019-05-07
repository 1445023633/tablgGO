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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * V_TEMPREALTIMEDATA
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "V_TEMPREALTIMEDATA")
public class VTemprealtimedataEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 544153307826033312L;

    /** deviceId */
    @Column(name = "deviceId", nullable = true, length = 10)
    private Integer deviceId;

    /** channelNumber */
    @Column(name = "CHANNEL_NUMBER", nullable = true, length = 10)
    private Integer channelNumber;

    /** location */
    @Column(name = "LOCATION", nullable = true, length = 50)
    private String location;

    /** locationDetails */
    @Column(name = "LOCATION_DETAILS", nullable = true, length = 50)
    private String locationDetails;

    /** value */
    @Column(name = "VALUE", nullable = true)
    private Float value;

    /** alarm */
    @Column(name = "ALARM", nullable = true, length = 10)
    private Integer alarm;

    /** updatetime */
    @Column(name = "UPDATETIME", nullable = true)
    private Date updatetime;

    /** times */
    @Column(name = "TIMES", nullable = true, length = 10)
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