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
 * TBL_LINES
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "TBL_LINES")
public class TblLinesEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7563890485284345644L;

    /** lineId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "LINE_ID", unique = true, nullable = false, length = 10)
    private Integer lineId;

    /** companyId */
    @Column(name = "COMPANY_ID", nullable = false, length = 10)
    private Integer companyId;

    /** lineName */
    @Column(name = "LINE_NAME", nullable = false, length = 60)
    private String lineName;

    /** lineAddress */
    @Column(name = "LINE_ADDRESS", nullable = true, length = 60)
    private String lineAddress;

    /** centerAddress */
    @Column(name = "CENTER_ADDRESS", nullable = true, length = 60)
    private String centerAddress;

    /** parentId */
    @Column(name = "PARENT_ID", nullable = true, length = 10)
    private Integer parentId;

    /** parentName */
    @Column(name = "PARENT_NAME", nullable = true, length = 60)
    private String parentName;

    /** status */
    @Column(name = "STATUS", nullable = true, length = 200)
    private String status;

    /** color */
    @Column(name = "COLOR", nullable = true, length = 20)
    private String color;

    /** pointCatagoryIds */
    @Column(name = "POINT_CATAGORY_IDS", nullable = false, length = 60)
    private String pointCatagoryIds;

    /**
     * 获取lineId
     * 
     * @return lineId
     */
    public Integer getLineId() {
        return this.lineId;
    }

    /**
     * 设置lineId
     * 
     * @param lineId
     */
    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    /**
     * 获取companyId
     * 
     * @return companyId
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * 设置companyId
     * 
     * @param companyId
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取lineName
     * 
     * @return lineName
     */
    public String getLineName() {
        return this.lineName;
    }

    /**
     * 设置lineName
     * 
     * @param lineName
     */
    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    /**
     * 获取lineAddress
     * 
     * @return lineAddress
     */
    public String getLineAddress() {
        return this.lineAddress;
    }

    /**
     * 设置lineAddress
     * 
     * @param lineAddress
     */
    public void setLineAddress(String lineAddress) {
        this.lineAddress = lineAddress;
    }

    /**
     * 获取centerAddress
     * 
     * @return centerAddress
     */
    public String getCenterAddress() {
        return this.centerAddress;
    }

    /**
     * 设置centerAddress
     * 
     * @param centerAddress
     */
    public void setCenterAddress(String centerAddress) {
        this.centerAddress = centerAddress;
    }

    /**
     * 获取parentId
     * 
     * @return parentId
     */
    public Integer getParentId() {
        return this.parentId;
    }

    /**
     * 设置parentId
     * 
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取parentName
     * 
     * @return parentName
     */
    public String getParentName() {
        return this.parentName;
    }

    /**
     * 设置parentName
     * 
     * @param parentName
     */
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    /**
     * 获取status
     * 
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * 设置status
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取color
     * 
     * @return color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * 设置color
     * 
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取pointCatagoryIds
     * 
     * @return pointCatagoryIds
     */
    public String getPointCatagoryIds() {
        return this.pointCatagoryIds;
    }

    /**
     * 设置pointCatagoryIds
     * 
     * @param pointCatagoryIds
     */
    public void setPointCatagoryIds(String pointCatagoryIds) {
        this.pointCatagoryIds = pointCatagoryIds;
    }
}