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
 * TBL_POIN_DATA
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class TblPoinDataVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -315794164343228328L;

    /** pointDataId */
    private Integer pointDataId;

    /** categroryId */
    private Integer categroryId;

    /** indicatorId */
    private Integer indicatorId;

    /** value */
    private String value;

    /** recordTime */
    private Date recordTime;

    /** isEarlyWarning */
    private Integer isEarlyWarning;

    /** isAlarm */
    private Integer isAlarm;

    /** pointId */
    private Integer pointId;

    /** pointName */
    private String pointName;

    /** pointCatagoryId */
    private Integer pointCatagoryId;

    /** protocolId */
    private Integer protocolId;

    /** alarmDataId */
    private String alarmDataId;

    /** elarlyAlamDataId */
    private String elarlyAlamDataId;

    /** alarmDownRecord */
    private Integer alarmDownRecord;

    /** alarmDown */
    private String alarmDown;

    /**
     * 获取pointDataId
     * 
     * @return pointDataId
     */
    public Integer getPointDataId() {
        return this.pointDataId;
    }

    /**
     * 设置pointDataId
     * 
     * @param pointDataId
     */
    public void setPointDataId(Integer pointDataId) {
        this.pointDataId = pointDataId;
    }

    /**
     * 获取categroryId
     * 
     * @return categroryId
     */
    public Integer getCategroryId() {
        return this.categroryId;
    }

    /**
     * 设置categroryId
     * 
     * @param categroryId
     */
    public void setCategroryId(Integer categroryId) {
        this.categroryId = categroryId;
    }

    /**
     * 获取indicatorId
     * 
     * @return indicatorId
     */
    public Integer getIndicatorId() {
        return this.indicatorId;
    }

    /**
     * 设置indicatorId
     * 
     * @param indicatorId
     */
    public void setIndicatorId(Integer indicatorId) {
        this.indicatorId = indicatorId;
    }

    /**
     * 获取value
     * 
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * 设置value
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取recordTime
     * 
     * @return recordTime
     */
    public Date getRecordTime() {
        return this.recordTime;
    }

    /**
     * 设置recordTime
     * 
     * @param recordTime
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    /**
     * 获取isEarlyWarning
     * 
     * @return isEarlyWarning
     */
    public Integer getIsEarlyWarning() {
        return this.isEarlyWarning;
    }

    /**
     * 设置isEarlyWarning
     * 
     * @param isEarlyWarning
     */
    public void setIsEarlyWarning(Integer isEarlyWarning) {
        this.isEarlyWarning = isEarlyWarning;
    }

    /**
     * 获取isAlarm
     * 
     * @return isAlarm
     */
    public Integer getIsAlarm() {
        return this.isAlarm;
    }

    /**
     * 设置isAlarm
     * 
     * @param isAlarm
     */
    public void setIsAlarm(Integer isAlarm) {
        this.isAlarm = isAlarm;
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

    /**
     * 获取pointName
     * 
     * @return pointName
     */
    public String getPointName() {
        return this.pointName;
    }

    /**
     * 设置pointName
     * 
     * @param pointName
     */
    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    /**
     * 获取pointCatagoryId
     * 
     * @return pointCatagoryId
     */
    public Integer getPointCatagoryId() {
        return this.pointCatagoryId;
    }

    /**
     * 设置pointCatagoryId
     * 
     * @param pointCatagoryId
     */
    public void setPointCatagoryId(Integer pointCatagoryId) {
        this.pointCatagoryId = pointCatagoryId;
    }

    /**
     * 获取protocolId
     * 
     * @return protocolId
     */
    public Integer getProtocolId() {
        return this.protocolId;
    }

    /**
     * 设置protocolId
     * 
     * @param protocolId
     */
    public void setProtocolId(Integer protocolId) {
        this.protocolId = protocolId;
    }

    /**
     * 获取alarmDataId
     * 
     * @return alarmDataId
     */
    public String getAlarmDataId() {
        return this.alarmDataId;
    }

    /**
     * 设置alarmDataId
     * 
     * @param alarmDataId
     */
    public void setAlarmDataId(String alarmDataId) {
        this.alarmDataId = alarmDataId;
    }

    /**
     * 获取elarlyAlamDataId
     * 
     * @return elarlyAlamDataId
     */
    public String getElarlyAlamDataId() {
        return this.elarlyAlamDataId;
    }

    /**
     * 设置elarlyAlamDataId
     * 
     * @param elarlyAlamDataId
     */
    public void setElarlyAlamDataId(String elarlyAlamDataId) {
        this.elarlyAlamDataId = elarlyAlamDataId;
    }

    /**
     * 获取alarmDownRecord
     * 
     * @return alarmDownRecord
     */
    public Integer getAlarmDownRecord() {
        return this.alarmDownRecord;
    }

    /**
     * 设置alarmDownRecord
     * 
     * @param alarmDownRecord
     */
    public void setAlarmDownRecord(Integer alarmDownRecord) {
        this.alarmDownRecord = alarmDownRecord;
    }

    /**
     * 获取alarmDown
     * 
     * @return alarmDown
     */
    public String getAlarmDown() {
        return this.alarmDown;
    }

    /**
     * 设置alarmDown
     * 
     * @param alarmDown
     */
    public void setAlarmDown(String alarmDown) {
        this.alarmDown = alarmDown;
    }
}