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

/**
 * TBL_COMPANY_GROUP
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class TblCompanyGroupVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -8780807326386133951L;

    /** groupId */
    private Integer groupId;

    /** phone */
    private String phone;

    /** isCompany */
    private Integer isCompany;

    /** name */
    private String name;

    /** parent */
    private Integer parent;

    /**
     * 获取groupId
     * 
     * @return groupId
     */
    public Integer getGroupId() {
        return this.groupId;
    }

    /**
     * 设置groupId
     * 
     * @param groupId
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
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
     * 获取isCompany
     * 
     * @return isCompany
     */
    public Integer getIsCompany() {
        return this.isCompany;
    }

    /**
     * 设置isCompany
     * 
     * @param isCompany
     */
    public void setIsCompany(Integer isCompany) {
        this.isCompany = isCompany;
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
     * 获取parent
     * 
     * @return parent
     */
    public Integer getParent() {
        return this.parent;
    }

    /**
     * 设置parent
     * 
     * @param parent
     */
    public void setParent(Integer parent) {
        this.parent = parent;
    }
}