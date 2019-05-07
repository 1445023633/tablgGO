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
 * TBL_USER_ROLE
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "TBL_USER_ROLE")
public class TblUserRoleEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -2016180111870615173L;

    /** userRoleId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "USER_ROLE_ID", unique = true, nullable = false, length = 10)
    private Integer userRoleId;

    /** userId */
    @Column(name = "USER_ID", nullable = true, length = 200)
    private String userId;

    /** roleId */
    @Column(name = "ROLE_ID", nullable = true, length = 10)
    private Integer roleId;

    /**
     * 获取userRoleId
     * 
     * @return userRoleId
     */
    public Integer getUserRoleId() {
        return this.userRoleId;
    }

    /**
     * 设置userRoleId
     * 
     * @param userRoleId
     */
    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * 获取userId
     * 
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * 设置userId
     * 
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取roleId
     * 
     * @return roleId
     */
    public Integer getRoleId() {
        return this.roleId;
    }

    /**
     * 设置roleId
     * 
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}