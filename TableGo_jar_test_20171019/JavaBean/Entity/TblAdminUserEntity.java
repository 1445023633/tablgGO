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
 * TBL_ADMIN_USER
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "TBL_ADMIN_USER")
public class TblAdminUserEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 2386868733905556903L;

    /** adminUserId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "ADMIN_USER_ID", unique = true, nullable = false, length = 200)
    private String adminUserId;

    /** name */
    @Column(name = "NAME", nullable = false, length = 500)
    private String name;

    /** pass */
    @Column(name = "PASS", nullable = false, length = 500)
    private String pass;

    /** userGroupId */
    @Column(name = "USER_GROUP_ID", nullable = true, length = 10)
    private Integer userGroupId;

    /** image */
    @Column(name = "IMAGE", nullable = true, length = 200)
    private String image;

    /** idCard */
    @Column(name = "ID_CARD", nullable = true, length = 255)
    private String idCard;

    /** phone */
    @Column(name = "PHONE", nullable = true, length = 255)
    private String phone;

    /** status */
    @Column(name = "STATUS", nullable = true, length = 255)
    private String status;

    /** isTemp */
    @Column(name = "IS_TEMP", nullable = true, length = 10)
    private Integer isTemp;

    /** addTime */
    @Column(name = "ADD_TIME", nullable = true)
    private Date addTime;

    /** lastLoginIn */
    @Column(name = "LAST_LOGIN_IN", nullable = true)
    private Date lastLoginIn;

    /** companyId */
    @Column(name = "COMPANY_ID", nullable = true, length = 255)
    private String companyId;

    /** lineId */
    @Column(name = "LINE_ID", nullable = true, length = 255)
    private String lineId;

    /** removeFlage */
    @Column(name = "REMOVE_FLAGE", nullable = true, length = 10)
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