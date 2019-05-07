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
 * DEVICESETTINGS
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class DevicesettingsVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 7853362186819167998L;

    /** id */
    private Integer id;

    /** deviceId */
    private Integer deviceId;

    /** mValue */
    private Integer mValue;

    /** intervalT */
    private Integer intervalT;

    /** channelNumber */
    private Integer channelNumber;

    /** ch1Base */
    private Integer ch1Base;

    /** ch1Db */
    private Integer ch1Db;

    /** ch1Threshold */
    private Integer ch1Threshold;

    /** ch1Delay */
    private Integer ch1Delay;

    /** ch1Sensor */
    private Float ch1Sensor;

    /** ch2Base */
    private Integer ch2Base;

    /** ch2Db */
    private Integer ch2Db;

    /** ch2Threshold */
    private Integer ch2Threshold;

    /** ch2Delay */
    private Integer ch2Delay;

    /** ch2Sensor */
    private Float ch2Sensor;

    /** ch1AlarmAmplitude */
    private Integer ch1AlarmAmplitude;

    /** ch1AlarmFrequency */
    private Integer ch1AlarmFrequency;

    /** ch2AlarmFrequency */
    private Integer ch2AlarmFrequency;

    /** ch2AlarmAmplitude */
    private Integer ch2AlarmAmplitude;

    /** ch1Difference */
    private Integer ch1Difference;

    /** ch2Difference */
    private Integer ch2Difference;

    /** noiseLevel */
    private Integer noiseLevel;

    /** initiativeStatus */
    private Integer initiativeStatus;

    /** amplitudeDebug */
    private Integer amplitudeDebug;

    /** ch1DischargeDifference */
    private Integer ch1DischargeDifference;

    /** ch2DischargeDifference */
    private Integer ch2DischargeDifference;

    /** ch3DischargeDifference */
    private Integer ch3DischargeDifference;

    /** ch4DischargeDifference */
    private Integer ch4DischargeDifference;

    /** ch5DischargeDifference */
    private Integer ch5DischargeDifference;

    /** ch6DischargeDifference */
    private Integer ch6DischargeDifference;

    /** ch7DischargeDifference */
    private Integer ch7DischargeDifference;

    /** ch8DischargeDifference */
    private Integer ch8DischargeDifference;

    /** deviceSerialNumber */
    private Integer deviceSerialNumber;

    /** version */
    private String version;

    /** createtime */
    private Date createtime;

    /** ch1Addbase */
    private Integer ch1Addbase;

    /** ch2Addbase */
    private Integer ch2Addbase;

    /** baudrate */
    private Integer baudrate;

    /** noiseSwitch */
    private Integer noiseSwitch;

    /** temwarnvalue */
    private Integer temwarnvalue;

    /** temcriticalvalue */
    private Integer temcriticalvalue;

    /** ch1DischargeDifferenceB */
    private Integer ch1DischargeDifferenceB;

    /** ch2DischargeDifferenceB */
    private Integer ch2DischargeDifferenceB;

    /** ch3DischargeDifferenceB */
    private Integer ch3DischargeDifferenceB;

    /** ch4DischargeDifferenceB */
    private Integer ch4DischargeDifferenceB;

    /** ch5DischargeDifferenceB */
    private Integer ch5DischargeDifferenceB;

    /** ch6DischargeDifferenceB */
    private Integer ch6DischargeDifferenceB;

    /** ch7DischargeDifferenceB */
    private Integer ch7DischargeDifferenceB;

    /** ch8DischargeDifferenceB */
    private Integer ch8DischargeDifferenceB;

    /** oppositeRange */
    private Integer oppositeRange;

    /** ch3Base */
    private Integer ch3Base;

    /** ch3Db */
    private Integer ch3Db;

    /** ch3Threshold */
    private Integer ch3Threshold;

    /** ch3Delay */
    private Integer ch3Delay;

    /** ch3Sensor */
    private Float ch3Sensor;

    /** ch3Difference */
    private Integer ch3Difference;

    /** ch3Addbase */
    private Integer ch3Addbase;

    /** ch1UhfDischargeDifference */
    private Integer ch1UhfDischargeDifference;

    /** ch2UhfDischargeDifference */
    private Integer ch2UhfDischargeDifference;

    /** ch3UhfDischargeDifference */
    private Integer ch3UhfDischargeDifference;

    /** ch4UhfDischargeDifference */
    private Integer ch4UhfDischargeDifference;

    /** ch5UhfDischargeDifference */
    private Integer ch5UhfDischargeDifference;

    /** ch6UhfDischargeDifference */
    private Integer ch6UhfDischargeDifference;

    /** ch7UhfDischargeDifference */
    private Integer ch7UhfDischargeDifference;

    /** ch8UhfDischargeDifference */
    private Integer ch8UhfDischargeDifference;

    /** ch1UhfDischargeDifferenceB */
    private Integer ch1UhfDischargeDifferenceB;

    /** ch2UhfDischargeDifferenceB */
    private Integer ch2UhfDischargeDifferenceB;

    /** ch3UhfDischargeDifferenceB */
    private Integer ch3UhfDischargeDifferenceB;

    /** ch4UhfDischargeDifferenceB */
    private Integer ch4UhfDischargeDifferenceB;

    /** ch5UhfDischargeDifferenceB */
    private Integer ch5UhfDischargeDifferenceB;

    /** ch6UhfDischargeDifferenceB */
    private Integer ch6UhfDischargeDifferenceB;

    /** ch7UhfDischargeDifferenceB */
    private Integer ch7UhfDischargeDifferenceB;

    /** ch8UhfDischargeDifferenceB */
    private Integer ch8UhfDischargeDifferenceB;

    /** uhfRangeSet */
    private Integer uhfRangeSet;

    /** noiseUhfSwitch */
    private Integer noiseUhfSwitch;

    /** pointId */
    private Integer pointId;

    /**
     * 获取id
     * 
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置id
     * 
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

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
     * 获取mValue
     * 
     * @return mValue
     */
    public Integer getMValue() {
        return this.mValue;
    }

    /**
     * 设置mValue
     * 
     * @param mValue
     */
    public void setMValue(Integer mValue) {
        this.mValue = mValue;
    }

    /**
     * 获取intervalT
     * 
     * @return intervalT
     */
    public Integer getIntervalT() {
        return this.intervalT;
    }

    /**
     * 设置intervalT
     * 
     * @param intervalT
     */
    public void setIntervalT(Integer intervalT) {
        this.intervalT = intervalT;
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
     * 获取ch1Base
     * 
     * @return ch1Base
     */
    public Integer getCh1Base() {
        return this.ch1Base;
    }

    /**
     * 设置ch1Base
     * 
     * @param ch1Base
     */
    public void setCh1Base(Integer ch1Base) {
        this.ch1Base = ch1Base;
    }

    /**
     * 获取ch1Db
     * 
     * @return ch1Db
     */
    public Integer getCh1Db() {
        return this.ch1Db;
    }

    /**
     * 设置ch1Db
     * 
     * @param ch1Db
     */
    public void setCh1Db(Integer ch1Db) {
        this.ch1Db = ch1Db;
    }

    /**
     * 获取ch1Threshold
     * 
     * @return ch1Threshold
     */
    public Integer getCh1Threshold() {
        return this.ch1Threshold;
    }

    /**
     * 设置ch1Threshold
     * 
     * @param ch1Threshold
     */
    public void setCh1Threshold(Integer ch1Threshold) {
        this.ch1Threshold = ch1Threshold;
    }

    /**
     * 获取ch1Delay
     * 
     * @return ch1Delay
     */
    public Integer getCh1Delay() {
        return this.ch1Delay;
    }

    /**
     * 设置ch1Delay
     * 
     * @param ch1Delay
     */
    public void setCh1Delay(Integer ch1Delay) {
        this.ch1Delay = ch1Delay;
    }

    /**
     * 获取ch1Sensor
     * 
     * @return ch1Sensor
     */
    public Float getCh1Sensor() {
        return this.ch1Sensor;
    }

    /**
     * 设置ch1Sensor
     * 
     * @param ch1Sensor
     */
    public void setCh1Sensor(Float ch1Sensor) {
        this.ch1Sensor = ch1Sensor;
    }

    /**
     * 获取ch2Base
     * 
     * @return ch2Base
     */
    public Integer getCh2Base() {
        return this.ch2Base;
    }

    /**
     * 设置ch2Base
     * 
     * @param ch2Base
     */
    public void setCh2Base(Integer ch2Base) {
        this.ch2Base = ch2Base;
    }

    /**
     * 获取ch2Db
     * 
     * @return ch2Db
     */
    public Integer getCh2Db() {
        return this.ch2Db;
    }

    /**
     * 设置ch2Db
     * 
     * @param ch2Db
     */
    public void setCh2Db(Integer ch2Db) {
        this.ch2Db = ch2Db;
    }

    /**
     * 获取ch2Threshold
     * 
     * @return ch2Threshold
     */
    public Integer getCh2Threshold() {
        return this.ch2Threshold;
    }

    /**
     * 设置ch2Threshold
     * 
     * @param ch2Threshold
     */
    public void setCh2Threshold(Integer ch2Threshold) {
        this.ch2Threshold = ch2Threshold;
    }

    /**
     * 获取ch2Delay
     * 
     * @return ch2Delay
     */
    public Integer getCh2Delay() {
        return this.ch2Delay;
    }

    /**
     * 设置ch2Delay
     * 
     * @param ch2Delay
     */
    public void setCh2Delay(Integer ch2Delay) {
        this.ch2Delay = ch2Delay;
    }

    /**
     * 获取ch2Sensor
     * 
     * @return ch2Sensor
     */
    public Float getCh2Sensor() {
        return this.ch2Sensor;
    }

    /**
     * 设置ch2Sensor
     * 
     * @param ch2Sensor
     */
    public void setCh2Sensor(Float ch2Sensor) {
        this.ch2Sensor = ch2Sensor;
    }

    /**
     * 获取ch1AlarmAmplitude
     * 
     * @return ch1AlarmAmplitude
     */
    public Integer getCh1AlarmAmplitude() {
        return this.ch1AlarmAmplitude;
    }

    /**
     * 设置ch1AlarmAmplitude
     * 
     * @param ch1AlarmAmplitude
     */
    public void setCh1AlarmAmplitude(Integer ch1AlarmAmplitude) {
        this.ch1AlarmAmplitude = ch1AlarmAmplitude;
    }

    /**
     * 获取ch1AlarmFrequency
     * 
     * @return ch1AlarmFrequency
     */
    public Integer getCh1AlarmFrequency() {
        return this.ch1AlarmFrequency;
    }

    /**
     * 设置ch1AlarmFrequency
     * 
     * @param ch1AlarmFrequency
     */
    public void setCh1AlarmFrequency(Integer ch1AlarmFrequency) {
        this.ch1AlarmFrequency = ch1AlarmFrequency;
    }

    /**
     * 获取ch2AlarmFrequency
     * 
     * @return ch2AlarmFrequency
     */
    public Integer getCh2AlarmFrequency() {
        return this.ch2AlarmFrequency;
    }

    /**
     * 设置ch2AlarmFrequency
     * 
     * @param ch2AlarmFrequency
     */
    public void setCh2AlarmFrequency(Integer ch2AlarmFrequency) {
        this.ch2AlarmFrequency = ch2AlarmFrequency;
    }

    /**
     * 获取ch2AlarmAmplitude
     * 
     * @return ch2AlarmAmplitude
     */
    public Integer getCh2AlarmAmplitude() {
        return this.ch2AlarmAmplitude;
    }

    /**
     * 设置ch2AlarmAmplitude
     * 
     * @param ch2AlarmAmplitude
     */
    public void setCh2AlarmAmplitude(Integer ch2AlarmAmplitude) {
        this.ch2AlarmAmplitude = ch2AlarmAmplitude;
    }

    /**
     * 获取ch1Difference
     * 
     * @return ch1Difference
     */
    public Integer getCh1Difference() {
        return this.ch1Difference;
    }

    /**
     * 设置ch1Difference
     * 
     * @param ch1Difference
     */
    public void setCh1Difference(Integer ch1Difference) {
        this.ch1Difference = ch1Difference;
    }

    /**
     * 获取ch2Difference
     * 
     * @return ch2Difference
     */
    public Integer getCh2Difference() {
        return this.ch2Difference;
    }

    /**
     * 设置ch2Difference
     * 
     * @param ch2Difference
     */
    public void setCh2Difference(Integer ch2Difference) {
        this.ch2Difference = ch2Difference;
    }

    /**
     * 获取noiseLevel
     * 
     * @return noiseLevel
     */
    public Integer getNoiseLevel() {
        return this.noiseLevel;
    }

    /**
     * 设置noiseLevel
     * 
     * @param noiseLevel
     */
    public void setNoiseLevel(Integer noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    /**
     * 获取initiativeStatus
     * 
     * @return initiativeStatus
     */
    public Integer getInitiativeStatus() {
        return this.initiativeStatus;
    }

    /**
     * 设置initiativeStatus
     * 
     * @param initiativeStatus
     */
    public void setInitiativeStatus(Integer initiativeStatus) {
        this.initiativeStatus = initiativeStatus;
    }

    /**
     * 获取amplitudeDebug
     * 
     * @return amplitudeDebug
     */
    public Integer getAmplitudeDebug() {
        return this.amplitudeDebug;
    }

    /**
     * 设置amplitudeDebug
     * 
     * @param amplitudeDebug
     */
    public void setAmplitudeDebug(Integer amplitudeDebug) {
        this.amplitudeDebug = amplitudeDebug;
    }

    /**
     * 获取ch1DischargeDifference
     * 
     * @return ch1DischargeDifference
     */
    public Integer getCh1DischargeDifference() {
        return this.ch1DischargeDifference;
    }

    /**
     * 设置ch1DischargeDifference
     * 
     * @param ch1DischargeDifference
     */
    public void setCh1DischargeDifference(Integer ch1DischargeDifference) {
        this.ch1DischargeDifference = ch1DischargeDifference;
    }

    /**
     * 获取ch2DischargeDifference
     * 
     * @return ch2DischargeDifference
     */
    public Integer getCh2DischargeDifference() {
        return this.ch2DischargeDifference;
    }

    /**
     * 设置ch2DischargeDifference
     * 
     * @param ch2DischargeDifference
     */
    public void setCh2DischargeDifference(Integer ch2DischargeDifference) {
        this.ch2DischargeDifference = ch2DischargeDifference;
    }

    /**
     * 获取ch3DischargeDifference
     * 
     * @return ch3DischargeDifference
     */
    public Integer getCh3DischargeDifference() {
        return this.ch3DischargeDifference;
    }

    /**
     * 设置ch3DischargeDifference
     * 
     * @param ch3DischargeDifference
     */
    public void setCh3DischargeDifference(Integer ch3DischargeDifference) {
        this.ch3DischargeDifference = ch3DischargeDifference;
    }

    /**
     * 获取ch4DischargeDifference
     * 
     * @return ch4DischargeDifference
     */
    public Integer getCh4DischargeDifference() {
        return this.ch4DischargeDifference;
    }

    /**
     * 设置ch4DischargeDifference
     * 
     * @param ch4DischargeDifference
     */
    public void setCh4DischargeDifference(Integer ch4DischargeDifference) {
        this.ch4DischargeDifference = ch4DischargeDifference;
    }

    /**
     * 获取ch5DischargeDifference
     * 
     * @return ch5DischargeDifference
     */
    public Integer getCh5DischargeDifference() {
        return this.ch5DischargeDifference;
    }

    /**
     * 设置ch5DischargeDifference
     * 
     * @param ch5DischargeDifference
     */
    public void setCh5DischargeDifference(Integer ch5DischargeDifference) {
        this.ch5DischargeDifference = ch5DischargeDifference;
    }

    /**
     * 获取ch6DischargeDifference
     * 
     * @return ch6DischargeDifference
     */
    public Integer getCh6DischargeDifference() {
        return this.ch6DischargeDifference;
    }

    /**
     * 设置ch6DischargeDifference
     * 
     * @param ch6DischargeDifference
     */
    public void setCh6DischargeDifference(Integer ch6DischargeDifference) {
        this.ch6DischargeDifference = ch6DischargeDifference;
    }

    /**
     * 获取ch7DischargeDifference
     * 
     * @return ch7DischargeDifference
     */
    public Integer getCh7DischargeDifference() {
        return this.ch7DischargeDifference;
    }

    /**
     * 设置ch7DischargeDifference
     * 
     * @param ch7DischargeDifference
     */
    public void setCh7DischargeDifference(Integer ch7DischargeDifference) {
        this.ch7DischargeDifference = ch7DischargeDifference;
    }

    /**
     * 获取ch8DischargeDifference
     * 
     * @return ch8DischargeDifference
     */
    public Integer getCh8DischargeDifference() {
        return this.ch8DischargeDifference;
    }

    /**
     * 设置ch8DischargeDifference
     * 
     * @param ch8DischargeDifference
     */
    public void setCh8DischargeDifference(Integer ch8DischargeDifference) {
        this.ch8DischargeDifference = ch8DischargeDifference;
    }

    /**
     * 获取deviceSerialNumber
     * 
     * @return deviceSerialNumber
     */
    public Integer getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    /**
     * 设置deviceSerialNumber
     * 
     * @param deviceSerialNumber
     */
    public void setDeviceSerialNumber(Integer deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }

    /**
     * 获取version
     * 
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * 设置version
     * 
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
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

    /**
     * 获取ch1Addbase
     * 
     * @return ch1Addbase
     */
    public Integer getCh1Addbase() {
        return this.ch1Addbase;
    }

    /**
     * 设置ch1Addbase
     * 
     * @param ch1Addbase
     */
    public void setCh1Addbase(Integer ch1Addbase) {
        this.ch1Addbase = ch1Addbase;
    }

    /**
     * 获取ch2Addbase
     * 
     * @return ch2Addbase
     */
    public Integer getCh2Addbase() {
        return this.ch2Addbase;
    }

    /**
     * 设置ch2Addbase
     * 
     * @param ch2Addbase
     */
    public void setCh2Addbase(Integer ch2Addbase) {
        this.ch2Addbase = ch2Addbase;
    }

    /**
     * 获取baudrate
     * 
     * @return baudrate
     */
    public Integer getBaudrate() {
        return this.baudrate;
    }

    /**
     * 设置baudrate
     * 
     * @param baudrate
     */
    public void setBaudrate(Integer baudrate) {
        this.baudrate = baudrate;
    }

    /**
     * 获取noiseSwitch
     * 
     * @return noiseSwitch
     */
    public Integer getNoiseSwitch() {
        return this.noiseSwitch;
    }

    /**
     * 设置noiseSwitch
     * 
     * @param noiseSwitch
     */
    public void setNoiseSwitch(Integer noiseSwitch) {
        this.noiseSwitch = noiseSwitch;
    }

    /**
     * 获取temwarnvalue
     * 
     * @return temwarnvalue
     */
    public Integer getTemwarnvalue() {
        return this.temwarnvalue;
    }

    /**
     * 设置temwarnvalue
     * 
     * @param temwarnvalue
     */
    public void setTemwarnvalue(Integer temwarnvalue) {
        this.temwarnvalue = temwarnvalue;
    }

    /**
     * 获取temcriticalvalue
     * 
     * @return temcriticalvalue
     */
    public Integer getTemcriticalvalue() {
        return this.temcriticalvalue;
    }

    /**
     * 设置temcriticalvalue
     * 
     * @param temcriticalvalue
     */
    public void setTemcriticalvalue(Integer temcriticalvalue) {
        this.temcriticalvalue = temcriticalvalue;
    }

    /**
     * 获取ch1DischargeDifferenceB
     * 
     * @return ch1DischargeDifferenceB
     */
    public Integer getCh1DischargeDifferenceB() {
        return this.ch1DischargeDifferenceB;
    }

    /**
     * 设置ch1DischargeDifferenceB
     * 
     * @param ch1DischargeDifferenceB
     */
    public void setCh1DischargeDifferenceB(Integer ch1DischargeDifferenceB) {
        this.ch1DischargeDifferenceB = ch1DischargeDifferenceB;
    }

    /**
     * 获取ch2DischargeDifferenceB
     * 
     * @return ch2DischargeDifferenceB
     */
    public Integer getCh2DischargeDifferenceB() {
        return this.ch2DischargeDifferenceB;
    }

    /**
     * 设置ch2DischargeDifferenceB
     * 
     * @param ch2DischargeDifferenceB
     */
    public void setCh2DischargeDifferenceB(Integer ch2DischargeDifferenceB) {
        this.ch2DischargeDifferenceB = ch2DischargeDifferenceB;
    }

    /**
     * 获取ch3DischargeDifferenceB
     * 
     * @return ch3DischargeDifferenceB
     */
    public Integer getCh3DischargeDifferenceB() {
        return this.ch3DischargeDifferenceB;
    }

    /**
     * 设置ch3DischargeDifferenceB
     * 
     * @param ch3DischargeDifferenceB
     */
    public void setCh3DischargeDifferenceB(Integer ch3DischargeDifferenceB) {
        this.ch3DischargeDifferenceB = ch3DischargeDifferenceB;
    }

    /**
     * 获取ch4DischargeDifferenceB
     * 
     * @return ch4DischargeDifferenceB
     */
    public Integer getCh4DischargeDifferenceB() {
        return this.ch4DischargeDifferenceB;
    }

    /**
     * 设置ch4DischargeDifferenceB
     * 
     * @param ch4DischargeDifferenceB
     */
    public void setCh4DischargeDifferenceB(Integer ch4DischargeDifferenceB) {
        this.ch4DischargeDifferenceB = ch4DischargeDifferenceB;
    }

    /**
     * 获取ch5DischargeDifferenceB
     * 
     * @return ch5DischargeDifferenceB
     */
    public Integer getCh5DischargeDifferenceB() {
        return this.ch5DischargeDifferenceB;
    }

    /**
     * 设置ch5DischargeDifferenceB
     * 
     * @param ch5DischargeDifferenceB
     */
    public void setCh5DischargeDifferenceB(Integer ch5DischargeDifferenceB) {
        this.ch5DischargeDifferenceB = ch5DischargeDifferenceB;
    }

    /**
     * 获取ch6DischargeDifferenceB
     * 
     * @return ch6DischargeDifferenceB
     */
    public Integer getCh6DischargeDifferenceB() {
        return this.ch6DischargeDifferenceB;
    }

    /**
     * 设置ch6DischargeDifferenceB
     * 
     * @param ch6DischargeDifferenceB
     */
    public void setCh6DischargeDifferenceB(Integer ch6DischargeDifferenceB) {
        this.ch6DischargeDifferenceB = ch6DischargeDifferenceB;
    }

    /**
     * 获取ch7DischargeDifferenceB
     * 
     * @return ch7DischargeDifferenceB
     */
    public Integer getCh7DischargeDifferenceB() {
        return this.ch7DischargeDifferenceB;
    }

    /**
     * 设置ch7DischargeDifferenceB
     * 
     * @param ch7DischargeDifferenceB
     */
    public void setCh7DischargeDifferenceB(Integer ch7DischargeDifferenceB) {
        this.ch7DischargeDifferenceB = ch7DischargeDifferenceB;
    }

    /**
     * 获取ch8DischargeDifferenceB
     * 
     * @return ch8DischargeDifferenceB
     */
    public Integer getCh8DischargeDifferenceB() {
        return this.ch8DischargeDifferenceB;
    }

    /**
     * 设置ch8DischargeDifferenceB
     * 
     * @param ch8DischargeDifferenceB
     */
    public void setCh8DischargeDifferenceB(Integer ch8DischargeDifferenceB) {
        this.ch8DischargeDifferenceB = ch8DischargeDifferenceB;
    }

    /**
     * 获取oppositeRange
     * 
     * @return oppositeRange
     */
    public Integer getOppositeRange() {
        return this.oppositeRange;
    }

    /**
     * 设置oppositeRange
     * 
     * @param oppositeRange
     */
    public void setOppositeRange(Integer oppositeRange) {
        this.oppositeRange = oppositeRange;
    }

    /**
     * 获取ch3Base
     * 
     * @return ch3Base
     */
    public Integer getCh3Base() {
        return this.ch3Base;
    }

    /**
     * 设置ch3Base
     * 
     * @param ch3Base
     */
    public void setCh3Base(Integer ch3Base) {
        this.ch3Base = ch3Base;
    }

    /**
     * 获取ch3Db
     * 
     * @return ch3Db
     */
    public Integer getCh3Db() {
        return this.ch3Db;
    }

    /**
     * 设置ch3Db
     * 
     * @param ch3Db
     */
    public void setCh3Db(Integer ch3Db) {
        this.ch3Db = ch3Db;
    }

    /**
     * 获取ch3Threshold
     * 
     * @return ch3Threshold
     */
    public Integer getCh3Threshold() {
        return this.ch3Threshold;
    }

    /**
     * 设置ch3Threshold
     * 
     * @param ch3Threshold
     */
    public void setCh3Threshold(Integer ch3Threshold) {
        this.ch3Threshold = ch3Threshold;
    }

    /**
     * 获取ch3Delay
     * 
     * @return ch3Delay
     */
    public Integer getCh3Delay() {
        return this.ch3Delay;
    }

    /**
     * 设置ch3Delay
     * 
     * @param ch3Delay
     */
    public void setCh3Delay(Integer ch3Delay) {
        this.ch3Delay = ch3Delay;
    }

    /**
     * 获取ch3Sensor
     * 
     * @return ch3Sensor
     */
    public Float getCh3Sensor() {
        return this.ch3Sensor;
    }

    /**
     * 设置ch3Sensor
     * 
     * @param ch3Sensor
     */
    public void setCh3Sensor(Float ch3Sensor) {
        this.ch3Sensor = ch3Sensor;
    }

    /**
     * 获取ch3Difference
     * 
     * @return ch3Difference
     */
    public Integer getCh3Difference() {
        return this.ch3Difference;
    }

    /**
     * 设置ch3Difference
     * 
     * @param ch3Difference
     */
    public void setCh3Difference(Integer ch3Difference) {
        this.ch3Difference = ch3Difference;
    }

    /**
     * 获取ch3Addbase
     * 
     * @return ch3Addbase
     */
    public Integer getCh3Addbase() {
        return this.ch3Addbase;
    }

    /**
     * 设置ch3Addbase
     * 
     * @param ch3Addbase
     */
    public void setCh3Addbase(Integer ch3Addbase) {
        this.ch3Addbase = ch3Addbase;
    }

    /**
     * 获取ch1UhfDischargeDifference
     * 
     * @return ch1UhfDischargeDifference
     */
    public Integer getCh1UhfDischargeDifference() {
        return this.ch1UhfDischargeDifference;
    }

    /**
     * 设置ch1UhfDischargeDifference
     * 
     * @param ch1UhfDischargeDifference
     */
    public void setCh1UhfDischargeDifference(Integer ch1UhfDischargeDifference) {
        this.ch1UhfDischargeDifference = ch1UhfDischargeDifference;
    }

    /**
     * 获取ch2UhfDischargeDifference
     * 
     * @return ch2UhfDischargeDifference
     */
    public Integer getCh2UhfDischargeDifference() {
        return this.ch2UhfDischargeDifference;
    }

    /**
     * 设置ch2UhfDischargeDifference
     * 
     * @param ch2UhfDischargeDifference
     */
    public void setCh2UhfDischargeDifference(Integer ch2UhfDischargeDifference) {
        this.ch2UhfDischargeDifference = ch2UhfDischargeDifference;
    }

    /**
     * 获取ch3UhfDischargeDifference
     * 
     * @return ch3UhfDischargeDifference
     */
    public Integer getCh3UhfDischargeDifference() {
        return this.ch3UhfDischargeDifference;
    }

    /**
     * 设置ch3UhfDischargeDifference
     * 
     * @param ch3UhfDischargeDifference
     */
    public void setCh3UhfDischargeDifference(Integer ch3UhfDischargeDifference) {
        this.ch3UhfDischargeDifference = ch3UhfDischargeDifference;
    }

    /**
     * 获取ch4UhfDischargeDifference
     * 
     * @return ch4UhfDischargeDifference
     */
    public Integer getCh4UhfDischargeDifference() {
        return this.ch4UhfDischargeDifference;
    }

    /**
     * 设置ch4UhfDischargeDifference
     * 
     * @param ch4UhfDischargeDifference
     */
    public void setCh4UhfDischargeDifference(Integer ch4UhfDischargeDifference) {
        this.ch4UhfDischargeDifference = ch4UhfDischargeDifference;
    }

    /**
     * 获取ch5UhfDischargeDifference
     * 
     * @return ch5UhfDischargeDifference
     */
    public Integer getCh5UhfDischargeDifference() {
        return this.ch5UhfDischargeDifference;
    }

    /**
     * 设置ch5UhfDischargeDifference
     * 
     * @param ch5UhfDischargeDifference
     */
    public void setCh5UhfDischargeDifference(Integer ch5UhfDischargeDifference) {
        this.ch5UhfDischargeDifference = ch5UhfDischargeDifference;
    }

    /**
     * 获取ch6UhfDischargeDifference
     * 
     * @return ch6UhfDischargeDifference
     */
    public Integer getCh6UhfDischargeDifference() {
        return this.ch6UhfDischargeDifference;
    }

    /**
     * 设置ch6UhfDischargeDifference
     * 
     * @param ch6UhfDischargeDifference
     */
    public void setCh6UhfDischargeDifference(Integer ch6UhfDischargeDifference) {
        this.ch6UhfDischargeDifference = ch6UhfDischargeDifference;
    }

    /**
     * 获取ch7UhfDischargeDifference
     * 
     * @return ch7UhfDischargeDifference
     */
    public Integer getCh7UhfDischargeDifference() {
        return this.ch7UhfDischargeDifference;
    }

    /**
     * 设置ch7UhfDischargeDifference
     * 
     * @param ch7UhfDischargeDifference
     */
    public void setCh7UhfDischargeDifference(Integer ch7UhfDischargeDifference) {
        this.ch7UhfDischargeDifference = ch7UhfDischargeDifference;
    }

    /**
     * 获取ch8UhfDischargeDifference
     * 
     * @return ch8UhfDischargeDifference
     */
    public Integer getCh8UhfDischargeDifference() {
        return this.ch8UhfDischargeDifference;
    }

    /**
     * 设置ch8UhfDischargeDifference
     * 
     * @param ch8UhfDischargeDifference
     */
    public void setCh8UhfDischargeDifference(Integer ch8UhfDischargeDifference) {
        this.ch8UhfDischargeDifference = ch8UhfDischargeDifference;
    }

    /**
     * 获取ch1UhfDischargeDifferenceB
     * 
     * @return ch1UhfDischargeDifferenceB
     */
    public Integer getCh1UhfDischargeDifferenceB() {
        return this.ch1UhfDischargeDifferenceB;
    }

    /**
     * 设置ch1UhfDischargeDifferenceB
     * 
     * @param ch1UhfDischargeDifferenceB
     */
    public void setCh1UhfDischargeDifferenceB(Integer ch1UhfDischargeDifferenceB) {
        this.ch1UhfDischargeDifferenceB = ch1UhfDischargeDifferenceB;
    }

    /**
     * 获取ch2UhfDischargeDifferenceB
     * 
     * @return ch2UhfDischargeDifferenceB
     */
    public Integer getCh2UhfDischargeDifferenceB() {
        return this.ch2UhfDischargeDifferenceB;
    }

    /**
     * 设置ch2UhfDischargeDifferenceB
     * 
     * @param ch2UhfDischargeDifferenceB
     */
    public void setCh2UhfDischargeDifferenceB(Integer ch2UhfDischargeDifferenceB) {
        this.ch2UhfDischargeDifferenceB = ch2UhfDischargeDifferenceB;
    }

    /**
     * 获取ch3UhfDischargeDifferenceB
     * 
     * @return ch3UhfDischargeDifferenceB
     */
    public Integer getCh3UhfDischargeDifferenceB() {
        return this.ch3UhfDischargeDifferenceB;
    }

    /**
     * 设置ch3UhfDischargeDifferenceB
     * 
     * @param ch3UhfDischargeDifferenceB
     */
    public void setCh3UhfDischargeDifferenceB(Integer ch3UhfDischargeDifferenceB) {
        this.ch3UhfDischargeDifferenceB = ch3UhfDischargeDifferenceB;
    }

    /**
     * 获取ch4UhfDischargeDifferenceB
     * 
     * @return ch4UhfDischargeDifferenceB
     */
    public Integer getCh4UhfDischargeDifferenceB() {
        return this.ch4UhfDischargeDifferenceB;
    }

    /**
     * 设置ch4UhfDischargeDifferenceB
     * 
     * @param ch4UhfDischargeDifferenceB
     */
    public void setCh4UhfDischargeDifferenceB(Integer ch4UhfDischargeDifferenceB) {
        this.ch4UhfDischargeDifferenceB = ch4UhfDischargeDifferenceB;
    }

    /**
     * 获取ch5UhfDischargeDifferenceB
     * 
     * @return ch5UhfDischargeDifferenceB
     */
    public Integer getCh5UhfDischargeDifferenceB() {
        return this.ch5UhfDischargeDifferenceB;
    }

    /**
     * 设置ch5UhfDischargeDifferenceB
     * 
     * @param ch5UhfDischargeDifferenceB
     */
    public void setCh5UhfDischargeDifferenceB(Integer ch5UhfDischargeDifferenceB) {
        this.ch5UhfDischargeDifferenceB = ch5UhfDischargeDifferenceB;
    }

    /**
     * 获取ch6UhfDischargeDifferenceB
     * 
     * @return ch6UhfDischargeDifferenceB
     */
    public Integer getCh6UhfDischargeDifferenceB() {
        return this.ch6UhfDischargeDifferenceB;
    }

    /**
     * 设置ch6UhfDischargeDifferenceB
     * 
     * @param ch6UhfDischargeDifferenceB
     */
    public void setCh6UhfDischargeDifferenceB(Integer ch6UhfDischargeDifferenceB) {
        this.ch6UhfDischargeDifferenceB = ch6UhfDischargeDifferenceB;
    }

    /**
     * 获取ch7UhfDischargeDifferenceB
     * 
     * @return ch7UhfDischargeDifferenceB
     */
    public Integer getCh7UhfDischargeDifferenceB() {
        return this.ch7UhfDischargeDifferenceB;
    }

    /**
     * 设置ch7UhfDischargeDifferenceB
     * 
     * @param ch7UhfDischargeDifferenceB
     */
    public void setCh7UhfDischargeDifferenceB(Integer ch7UhfDischargeDifferenceB) {
        this.ch7UhfDischargeDifferenceB = ch7UhfDischargeDifferenceB;
    }

    /**
     * 获取ch8UhfDischargeDifferenceB
     * 
     * @return ch8UhfDischargeDifferenceB
     */
    public Integer getCh8UhfDischargeDifferenceB() {
        return this.ch8UhfDischargeDifferenceB;
    }

    /**
     * 设置ch8UhfDischargeDifferenceB
     * 
     * @param ch8UhfDischargeDifferenceB
     */
    public void setCh8UhfDischargeDifferenceB(Integer ch8UhfDischargeDifferenceB) {
        this.ch8UhfDischargeDifferenceB = ch8UhfDischargeDifferenceB;
    }

    /**
     * 获取uhfRangeSet
     * 
     * @return uhfRangeSet
     */
    public Integer getUhfRangeSet() {
        return this.uhfRangeSet;
    }

    /**
     * 设置uhfRangeSet
     * 
     * @param uhfRangeSet
     */
    public void setUhfRangeSet(Integer uhfRangeSet) {
        this.uhfRangeSet = uhfRangeSet;
    }

    /**
     * 获取noiseUhfSwitch
     * 
     * @return noiseUhfSwitch
     */
    public Integer getNoiseUhfSwitch() {
        return this.noiseUhfSwitch;
    }

    /**
     * 设置noiseUhfSwitch
     * 
     * @param noiseUhfSwitch
     */
    public void setNoiseUhfSwitch(Integer noiseUhfSwitch) {
        this.noiseUhfSwitch = noiseUhfSwitch;
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