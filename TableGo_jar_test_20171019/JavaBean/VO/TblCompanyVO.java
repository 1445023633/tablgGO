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
 * TBL_COMPANY
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class TblCompanyVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 6402131779650279604L;

    /** companyId */
    private Integer companyId;

    /** name */
    private String name;

    /** groupName */
    private String groupName;

    /** groupId */
    private Integer groupId;

    /** parent */
    private Integer parent;

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
     * 获取groupName
     * 
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * 设置groupName
     * 
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

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