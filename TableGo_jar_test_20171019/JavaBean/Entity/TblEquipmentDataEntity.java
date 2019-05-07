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
 * TBL_EQUIPMENT_DATA
 * 
 * @author bianj
 * @version 1.0.0 2019-02-22
 */
@Entity
@Table(name = "TBL_EQUIPMENT_DATA")
public class TblEquipmentDataEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -4643488938427217625L;

    @Id
    @Column(name = "EQUIPMENT_DATA_ID", unique = true, nullable = false, length = 10)
    private String equipmentDataId;

    @Column(name = "CATEGRORY_ID", nullable = true, length = 10)
    private Integer categroryId;

    @Column(name = "INDICATOR_ID", nullable = true, length = 10)
    private String indicatorId;

    @Column(name = "VALUE", nullable = true, length = 60)
    private String value;

    @Column(name = "RECORD_TIME", nullable = true)
    private Date recordTime;

    @Column(name = "EQUIP_ID", nullable = true, length = 10)
    private Integer equipId;

    public String getEquipmentDataId() {
        return this.equipmentDataId;
    }

    public void setEquipmentDataId(String equipmentDataId) {
        this.equipmentDataId = equipmentDataId;
    }

    public Integer getCategroryId() {
        return this.categroryId;
    }

    public void setCategroryId(Integer categroryId) {
        this.categroryId = categroryId;
    }

    public String getIndicatorId() {
        return this.indicatorId;
    }

    public void setIndicatorId(String indicatorId) {
        this.indicatorId = indicatorId;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getRecordTime() {
        return this.recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public Integer getEquipId() {
        return this.equipId;
    }

    public void setEquipId(Integer equipId) {
        this.equipId = equipId;
    }
}