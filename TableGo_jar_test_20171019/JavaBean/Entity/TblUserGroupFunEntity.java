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
 * TBL_USER_GROUP_FUN
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "TBL_USER_GROUP_FUN")
public class TblUserGroupFunEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -260748867283992447L;

    /** groupFuncId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "GROUP_FUNC_ID", unique = true, nullable = false, length = 10)
    private Integer groupFuncId;

    /** userGroupId */
    @Column(name = "USER_GROUP_ID", nullable = true, length = 10)
    private Integer userGroupId;

    /** funcId */
    @Column(name = "FUNC_ID", nullable = true, length = 10)
    private Integer funcId;

    /**
     * 获取groupFuncId
     * 
     * @return groupFuncId
     */
    public Integer getGroupFuncId() {
        return this.groupFuncId;
    }

    /**
     * 设置groupFuncId
     * 
     * @param groupFuncId
     */
    public void setGroupFuncId(Integer groupFuncId) {
        this.groupFuncId = groupFuncId;
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
     * 获取funcId
     * 
     * @return funcId
     */
    public Integer getFuncId() {
        return this.funcId;
    }

    /**
     * 设置funcId
     * 
     * @param funcId
     */
    public void setFuncId(Integer funcId) {
        this.funcId = funcId;
    }
}