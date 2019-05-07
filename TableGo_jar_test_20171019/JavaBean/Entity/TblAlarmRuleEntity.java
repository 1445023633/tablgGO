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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * TBL_ALARM_RULE
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "TBL_ALARM_RULE")
public class TblAlarmRuleEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -11607024450883336L;

    /** alarmRuleId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "ALARM_RULE_ID", unique = true, nullable = false, length = 10)
    private Integer alarmRuleId;

    /** ruleName */
    @Column(name = "RULE_NAME", nullable = true, length = 200)
    private String ruleName;

    /** alarmCategoryId */
    @Column(name = "ALARM_CATEGORY_ID", nullable = true, length = 10)
    private Integer alarmCategoryId;

    /** topLimit */
    @Column(name = "TOP_LIMIT", nullable = true, length = 10)
    private Integer topLimit;

    /** lowerLimit */
    @Column(name = "LOWER_LIMIT", nullable = true, length = 10)
    private Integer lowerLimit;

    /** topAlarm */
    @Column(name = "TOP_ALARM", nullable = true, length = 10)
    private Integer topAlarm;

    /** lowerAlarm */
    @Column(name = "LOWER_ALARM", nullable = true, length = 10)
    private Integer lowerAlarm;

    /** normal */
    @Column(name = "NORMAL", nullable = true, length = 10)
    private Integer normal;

    /** abnomal */
    @Column(name = "ABNOMAL", nullable = true, length = 10)
    private Integer abnomal;

    /** indicatorCategoryId */
    @Column(name = "INDICATOR_CATEGORY_ID", nullable = true, length = 10)
    private Integer indicatorCategoryId;

    /** indicatorValueId */
    @Column(name = "INDICATOR_VALUE_ID", nullable = true, length = 10)
    private Integer indicatorValueId;

    /** pointId */
    @Column(name = "POINT_ID", nullable = true, length = 10)
    private Integer pointId;

    /** comparison */
    @Column(name = "COMPARISON", nullable = true, length = 10)
    private Integer comparison;

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
     * 获取ruleName
     * 
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * 设置ruleName
     * 
     * @param ruleName
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * 获取alarmCategoryId
     * 
     * @return alarmCategoryId
     */
    public Integer getAlarmCategoryId() {
        return this.alarmCategoryId;
    }

    /**
     * 设置alarmCategoryId
     * 
     * @param alarmCategoryId
     */
    public void setAlarmCategoryId(Integer alarmCategoryId) {
        this.alarmCategoryId = alarmCategoryId;
    }

    /**
     * 获取topLimit
     * 
     * @return topLimit
     */
    public Integer getTopLimit() {
        return this.topLimit;
    }

    /**
     * 设置topLimit
     * 
     * @param topLimit
     */
    public void setTopLimit(Integer topLimit) {
        this.topLimit = topLimit;
    }

    /**
     * 获取lowerLimit
     * 
     * @return lowerLimit
     */
    public Integer getLowerLimit() {
        return this.lowerLimit;
    }

    /**
     * 设置lowerLimit
     * 
     * @param lowerLimit
     */
    public void setLowerLimit(Integer lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    /**
     * 获取topAlarm
     * 
     * @return topAlarm
     */
    public Integer getTopAlarm() {
        return this.topAlarm;
    }

    /**
     * 设置topAlarm
     * 
     * @param topAlarm
     */
    public void setTopAlarm(Integer topAlarm) {
        this.topAlarm = topAlarm;
    }

    /**
     * 获取lowerAlarm
     * 
     * @return lowerAlarm
     */
    public Integer getLowerAlarm() {
        return this.lowerAlarm;
    }

    /**
     * 设置lowerAlarm
     * 
     * @param lowerAlarm
     */
    public void setLowerAlarm(Integer lowerAlarm) {
        this.lowerAlarm = lowerAlarm;
    }

    /**
     * 获取normal
     * 
     * @return normal
     */
    public Integer getNormal() {
        return this.normal;
    }

    /**
     * 设置normal
     * 
     * @param normal
     */
    public void setNormal(Integer normal) {
        this.normal = normal;
    }

    /**
     * 获取abnomal
     * 
     * @return abnomal
     */
    public Integer getAbnomal() {
        return this.abnomal;
    }

    /**
     * 设置abnomal
     * 
     * @param abnomal
     */
    public void setAbnomal(Integer abnomal) {
        this.abnomal = abnomal;
    }

    /**
     * 获取indicatorCategoryId
     * 
     * @return indicatorCategoryId
     */
    public Integer getIndicatorCategoryId() {
        return this.indicatorCategoryId;
    }

    /**
     * 设置indicatorCategoryId
     * 
     * @param indicatorCategoryId
     */
    public void setIndicatorCategoryId(Integer indicatorCategoryId) {
        this.indicatorCategoryId = indicatorCategoryId;
    }

    /**
     * 获取indicatorValueId
     * 
     * @return indicatorValueId
     */
    public Integer getIndicatorValueId() {
        return this.indicatorValueId;
    }

    /**
     * 设置indicatorValueId
     * 
     * @param indicatorValueId
     */
    public void setIndicatorValueId(Integer indicatorValueId) {
        this.indicatorValueId = indicatorValueId;
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
     * 获取comparison
     * 
     * @return comparison
     */
    public Integer getComparison() {
        return this.comparison;
    }

    /**
     * 设置comparison
     * 
     * @param comparison
     */
    public void setComparison(Integer comparison) {
        this.comparison = comparison;
    }
}