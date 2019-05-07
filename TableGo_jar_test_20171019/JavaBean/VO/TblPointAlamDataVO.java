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
 * TBL_POINT_ALAM_DATA
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class TblPointAlamDataVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7038832888448281198L;

    /** alarmId */
    private Integer alarmId;

    /** alarmDate */
    private Date alarmDate;

    /** value */
    private String value;

    /** indicatorId */
    private Integer indicatorId;

    /** categroryId */
    private Integer categroryId;

    /** isNotice */
    private Integer isNotice;

    /** alarmRuleId */
    private Integer alarmRuleId;

    /** pointId */
    private Integer pointId;

    /** contrastDataId */
    private Integer contrastDataId;

    /** currentDataId */
    private Integer currentDataId;

    /** dataFrom */
    private String dataFrom;

    /**
     * 获取alarmId
     * 
     * @return alarmId
     */
    public Integer getAlarmId() {
        return this.alarmId;
    }

    /**
     * 设置alarmId
     * 
     * @param alarmId
     */
    public void setAlarmId(Integer alarmId) {
        this.alarmId = alarmId;
    }

    /**
     * 获取alarmDate
     * 
     * @return alarmDate
     */
    public Date getAlarmDate() {
        return this.alarmDate;
    }

    /**
     * 设置alarmDate
     * 
     * @param alarmDate
     */
    public void setAlarmDate(Date alarmDate) {
        this.alarmDate = alarmDate;
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
     * 获取isNotice
     * 
     * @return isNotice
     */
    public Integer getIsNotice() {
        return this.isNotice;
    }

    /**
     * 设置isNotice
     * 
     * @param isNotice
     */
    public void setIsNotice(Integer isNotice) {
        this.isNotice = isNotice;
    }

    /**
     * 获取alarmRuleId
     * 
     * @return alarmRuleId
     */
    public Integer getAlarmRuleId() {
        return this.alarmRuleId;
    }

    /**
     * 设置alarmRuleId
     * 
     * @param alarmRuleId
     */
    public void setAlarmRuleId(Integer alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
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
     * 获取contrastDataId
     * 
     * @return contrastDataId
     */
    public Integer getContrastDataId() {
        return this.contrastDataId;
    }

    /**
     * 设置contrastDataId
     * 
     * @param contrastDataId
     */
    public void setContrastDataId(Integer contrastDataId) {
        this.contrastDataId = contrastDataId;
    }

    /**
     * 获取currentDataId
     * 
     * @return currentDataId
     */
    public Integer getCurrentDataId() {
        return this.currentDataId;
    }

    /**
     * 设置currentDataId
     * 
     * @param currentDataId
     */
    public void setCurrentDataId(Integer currentDataId) {
        this.currentDataId = currentDataId;
    }

    /**
     * 获取dataFrom
     * 
     * @return dataFrom
     */
    public String getDataFrom() {
        return this.dataFrom;
    }

    /**
     * 设置dataFrom
     * 
     * @param dataFrom
     */
    public void setDataFrom(String dataFrom) {
        this.dataFrom = dataFrom;
    }
}