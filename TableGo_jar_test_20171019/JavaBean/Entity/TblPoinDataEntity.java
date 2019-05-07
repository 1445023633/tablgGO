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
 * TBL_POIN_DATA
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "TBL_POIN_DATA")
public class TblPoinDataEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -315794164343228328L;

    /** pointDataId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "POINT_DATA_ID", unique = true, nullable = false, length = 10)
    private Integer pointDataId;

    /** categroryId */
    @Column(name = "CATEGRORY_ID", nullable = true, length = 10)
    private Integer categroryId;

    /** indicatorId */
    @Column(name = "INDICATOR_ID", nullable = true, length = 10)
    private Integer indicatorId;

    /** value */
    @Column(name = "VALUE", nullable = true, length = 60)
    private String value;

    /** recordTime */
    @Column(name = "RECORD_TIME", nullable = true)
    private Date recordTime;

    /** isEarlyWarning */
    @Column(name = "IS_EARLY_WARNING", nullable = true, length = 10)
    private Integer isEarlyWarning;

    /** isAlarm */
    @Column(name = "IS_ALARM", nullable = true, length = 10)
    private Integer isAlarm;

    /** pointId */
    @Column(name = "POINT_ID", nullable = true, length = 10)
    private Integer pointId;

    /** pointName */
    @Column(name = "POINT_NAME", nullable = true, length = 200)
    private String pointName;

    /** pointCatagoryId */
    @Column(name = "POINT_CATAGORY_ID", nullable = true, length = 10)
    private Integer pointCatagoryId;

    /** protocolId */
    @Column(name = "PROTOCOL_ID", nullable = true, length = 10)
    private Integer protocolId;

    /** alarmDataId */
    @Column(name = "ALARM_DATA_ID", nullable = true, length = 200)
    private String alarmDataId;

    /** elarlyAlamDataId */
    @Column(name = "ELARLY_ALAM_DATA_ID", nullable = true, length = 200)
    private String elarlyAlamDataId;

    /** alarmDownRecord */
    @Column(name = "ALARM_DOWN_RECORD", nullable = true, length = 10)
    private Integer alarmDownRecord;

    /** alarmDown */
    @Column(name = "ALARM_DOWN", nullable = true, length = 255)
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