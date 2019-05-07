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
 * TBL_ADMIN_USER
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class TblAdminUserVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 2386868733905556903L;

    /** adminUserId */
    private String adminUserId;

    /** name */
    private String name;

    /** pass */
    private String pass;

    /** userGroupId */
    private Integer userGroupId;

    /** image */
    private String image;

    /** idCard */
    private String idCard;

    /** phone */
    private String phone;

    /** status */
    private String status;

    /** isTemp */
    private Integer isTemp;

    /** addTime */
    private Date addTime;

    /** lastLoginIn */
    private Date lastLoginIn;

    /** companyId */
    private String companyId;

    /** lineId */
    private String lineId;

    /** removeFlage */
    private Integer removeFlage;

    /**
     * 获取adminUserId
     * 
     * @return adminUserId
     */
    public String getAdminUserId() {
        return this.adminUserId;
    }

    /**
     * 设置adminUserId
     * 
     * @param adminUserId
     */
    public void setAdminUserId(String adminUserId) {
        this.adminUserId = adminUserId;
    }

    /**
     * 获取name
     * 
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置name
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取pass
     * 
     * @return pass
     */
    public String getPass() {
        return this.pass;
    }

    /**
     * 设置pass
     * 
     * @param pass
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * 获取userGroupId
     * 
     * @return userGroupId
     */
    public Integer getUserGroupId() {
        return this.userGroupId;
    }

    /**
     * 设置userGroupId
     * 
     * @param userGroupId
     */
    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    /**
     * 获取image
     * 
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * 设置image
     * 
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取idCard
     * 
     * @return idCard
     */
    public String getIdCard() {
        return this.idCard;
    }

    /**
     * 设置idCard
     * 
     * @param idCard
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取phone
     * 
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * 设置phone
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
     * 获取isTemp
     * 
     * @return isTemp
     */
    public Integer getIsTemp() {
        return this.isTemp;
    }

    /**
     * 设置isTemp
     * 
     * @param isTemp
     */
    public void setIsTemp(Integer isTemp) {
        this.isTemp = isTemp;
    }

    /**
     * 获取addTime
     * 
     * @return addTime
     */
    public Date getAddTime() {
        return this.addTime;
    }

    /**
     * 设置addTime
     * 
     * @param addTime
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取lastLoginIn
     * 
     * @return lastLoginIn
     */
    public Date getLastLoginIn() {
        return this.lastLoginIn;
    }

    /**
     * 设置lastLoginIn
     * 
     * @param lastLoginIn
     */
    public void setLastLoginIn(Date lastLoginIn) {
        this.lastLoginIn = lastLoginIn;
    }

    /**
     * 获取companyId
     * 
     * @return companyId
     */
    public String getCompanyId() {
        return this.companyId;
    }

    /**
     * 设置companyId
     * 
     * @param companyId
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取lineId
     * 
     * @return lineId
     */
    public String getLineId() {
        return this.lineId;
    }

    /**
     * 设置lineId
     * 
     * @param lineId
     */
    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    /**
     * 获取removeFlage
     * 
     * @return removeFlage
     */
    public Integer getRemoveFlage() {
        return this.removeFlage;
    }

    /**
     * 设置removeFlage
     * 
     * @param removeFlage
     */
    public void setRemoveFlage(Integer removeFlage) {
        this.removeFlage = removeFlage;
    }
}