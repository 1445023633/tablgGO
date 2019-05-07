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
 * V_TEMPCHANNELSETTINGS
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "V_TEMPCHANNELSETTINGS")
public class VTempchannelsettingsEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 3325016184813549120L;

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

    /** alarmValue */
    @Column(name = "ALARM_VALUE", nullable = true)
    private Float alarmValue;

    /** createtime */
    @Column(name = "CREATETIME", nullable = true)
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