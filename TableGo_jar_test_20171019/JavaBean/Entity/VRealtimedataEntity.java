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
 * V_REALTIMEDATA
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "V_REALTIMEDATA")
public class VRealtimedataEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 6017443757445575602L;

    /** deviceId */
    @Column(name = "deviceId", nullable = true, length = 10)
    private Integer deviceId;

    /** channelNumber */
    @Column(name = "CHANNEL_NUMBER", nullable = true, length = 10)
    private Integer channelNumber;

    /** location */
    @Column(name = "LOCATION", nullable = true, length = 50)
    private String location;

    /** amplitude */
    @Column(name = "AMPLITUDE", nullable = true)
    private Float amplitude;

    /** frequency */
    @Column(name = "FREQUENCY", nullable = true, length = 10)
    private Integer frequency;

    /** energy */
    @Column(name = "ENERGY", nullable = true, length = 10)
    private Integer energy;

    /** updatetime */
    @Column(name = "UPDATETIME", nullable = true)
    private Date updatetime;

    /** alarmAmplitudeFrequency */
    @Column(name = "ALARM_AMPLITUDE_FREQUENCY", nullable = true, length = 10)
    private Integer alarmAmplitudeFrequency;

    /** locationDetail */
    @Column(name = "LOCATION_DETAIL", nullable = true, length = 50)
    private String locationDetail;

    /** pointId */
    @Column(name = "POINT_ID", nullable = true, length = 10)
    private Integer pointId;

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
     * 获取amplitude
     * 
     * @return amplitude
     */
    public Float getAmplitude() {
        return this.amplitude;
    }

    /**
     * 设置amplitude
     * 
     * @param amplitude
     */
    public void setAmplitude(Float amplitude) {
        this.amplitude = amplitude;
    }

    /**
     * 获取frequency
     * 
     * @return frequency
     */
    public Integer getFrequency() {
        return this.frequency;
    }

    /**
     * 设置frequency
     * 
     * @param frequency
     */
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    /**
     * 获取energy
     * 
     * @return energy
     */
    public Integer getEnergy() {
        return this.energy;
    }

    /**
     * 设置energy
     * 
     * @param energy
     */
    public void setEnergy(Integer energy) {
        this.energy = energy;
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
     * 获取alarmAmplitudeFrequency
     * 
     * @return alarmAmplitudeFrequency
     */
    public Integer getAlarmAmplitudeFrequency() {
        return this.alarmAmplitudeFrequency;
    }

    /**
     * 设置alarmAmplitudeFrequency
     * 
     * @param alarmAmplitudeFrequency
     */
    public void setAlarmAmplitudeFrequency(Integer alarmAmplitudeFrequency) {
        this.alarmAmplitudeFrequency = alarmAmplitudeFrequency;
    }

    /**
     * 获取locationDetail
     * 
     * @return locationDetail
     */
    public String getLocationDetail() {
        return this.locationDetail;
    }

    /**
     * 设置locationDetail
     * 
     * @param locationDetail
     */
    public void setLocationDetail(String locationDetail) {
        this.locationDetail = locationDetail;
    }

    /**
     * 获取pointId
     * 
     * @return pointId
     */
    public Integer getPointId() {
        return this.pointId;
    }

    /**
     * 设置pointId
     * 
     * @param pointId
     */
    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }
}