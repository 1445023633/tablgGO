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
 * TBL_COMPANY
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "TBL_COMPANY")
public class TblCompanyEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 6402131779650279604L;

    /** companyId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "COMPANY_ID", unique = true, nullable = false, length = 10)
    private Integer companyId;

    /** name */
    @Column(name = "NAME", nullable = true, length = 60)
    private String name;

    /** groupName */
    @Column(name = "GROUP_NAME", nullable = true, length = 60)
    private String groupName;

    /** groupId */
    @Column(name = "GROUP_ID", nullable = true, length = 10)
    private Integer groupId;

    /** parent */
    @Column(name = "PARENT", nullable = true, length = 10)
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