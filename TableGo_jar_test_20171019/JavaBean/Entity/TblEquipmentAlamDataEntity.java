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
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TBL_EQUIPMENT_ALAM_DATA
 * 
 * @author bianj
 * @version 1.0.0 2019-02-22
 */
@Entity
@Table(name = "TBL_EQUIPMENT_ALAM_DATA")
public class TblEquipmentAlamDataEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 3435225424591537412L;

    @Id
    @Column(name = "ALARM_ID", unique = true, nullable = false, length = 10)
    private String alarmId;

    @Column(name = "ALARM_DATE", nullable = true)
    private Date alarmDate;

    @Column(name = "INDICATOR_VALUE", nullable = true, length = 10)
    private String indicatorValue;

    @Column(name = "INDICATOR_ID", nullable = true, length = 10)
    private String indicatorId;

    @Column(name = "CATEGRORY_ID", nullable = true, length = 10)
    private Integer categroryId;

    @Column(name = "EQUIP_ID", nullable = true, length = 10)
    private Integer equipId;

    public String getAlarmId() {
        return this.alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public Date getAlarmDate() {
        return this.alarmDate;
    }

    public void setAlarmDate(Date alarmDate) {
        this.alarmDate = alarmDate;
    }

    public String getIndicatorValue() {
        return this.indicatorValue;
    }

    public void setIndicatorValue(String indicatorValue) {
        this.indicatorValue = indicatorValue;
    }

    public String getIndicatorId() {
        return this.indicatorId;
    }

    public void setIndicatorId(String indicatorId) {
        this.indicatorId = indicatorId;
    }

    public Integer getCategroryId() {
        return this.categroryId;
    }

    public void setCategroryId(Integer categroryId) {
        this.categroryId = categroryId;
    }

    public Integer getEquipId() {
        return this.equipId;
    }

    public void setEquipId(Integer equipId) {
        this.equipId = equipId;
    }
}