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
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TBL_EQUIPMENT
 * 
 * @author bianj
 * @version 1.0.0 2019-02-22
 */
@Entity
@Table(name = "TBL_EQUIPMENT")
public class TblEquipmentEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -5503914669855789255L;

    @Id
    @Column(name = "EQUIP_ID", unique = true, nullable = false, length = 10)
    private Integer equipId;

    @Column(name = "NAME", nullable = true, length = 60)
    private String name;

    @Column(name = "ADDRESS", nullable = true, length = 30)
    private String address;

    @Column(name = "LONG_LATI", nullable = true, length = 60)
    private String longLati;

    @Column(name = "STATUS", nullable = true, length = 10)
    private Integer status;

    @Column(name = "LINE_ID", nullable = true, length = 10)
    private Integer lineId;

    @Column(name = "COMPANY_ID", nullable = true, length = 10)
    private Integer companyId;

    @Column(name = "IMAGE", nullable = true, length = 200)
    private String image;

    @Column(name = "INDICATOR_ID", nullable = true, length = 10)
    private String indicatorId;

    @Column(name = "CATEGORY_ID", nullable = true, length = 10)
    private String categoryId;

    public Integer getEquipId() {
        return this.equipId;
    }

    public void setEquipId(Integer equipId) {
        this.equipId = equipId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLongLati() {
        return this.longLati;
    }

    public void setLongLati(String longLati) {
        this.longLati = longLati;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLineId() {
        return this.lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIndicatorId() {
        return this.indicatorId;
    }

    public void setIndicatorId(String indicatorId) {
        this.indicatorId = indicatorId;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}