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
 * TBL_GROUP
 * 
 * @author bianj
 * @version 1.0.0 2019-02-22
 */
@Entity
@Table(name = "TBL_GROUP")
public class TblGroupEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3684684913042983365L;

    @Id
    @Column(name = "GROUP_ID", unique = true, nullable = false, length = 10)
    private Integer groupId;

    @Column(name = "PHONE", nullable = true, length = 15)
    private String phone;

    @Column(name = "IS_COMPANY", nullable = true, length = 10)
    private Integer isCompany;

    @Column(name = "NAME", nullable = true, length = 60)
    private String name;

    @Column(name = "PARENT", nullable = true, length = 10)
    private Integer parent;

    public Integer getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getIsCompany() {
        return this.isCompany;
    }

    public void setIsCompany(Integer isCompany) {
        this.isCompany = isCompany;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParent() {
        return this.parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }
}