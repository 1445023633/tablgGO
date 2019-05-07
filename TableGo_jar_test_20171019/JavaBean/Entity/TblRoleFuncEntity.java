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
 * TBL_ROLE_FUNC
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "TBL_ROLE_FUNC")
public class TblRoleFuncEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 6258468940722114157L;

    /** roleFuncId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "ROLE_FUNC_ID", unique = true, nullable = false, length = 10)
    private Integer roleFuncId;

    /** funcId */
    @Column(name = "FUNC_ID", nullable = true, length = 10)
    private Integer funcId;

    /** roleId */
    @Column(name = "ROLE_ID", nullable = true, length = 10)
    private Integer roleId;

    /**
     * 获取roleFuncId
     * 
     * @return roleFuncId
     */
    public Integer getRoleFuncId() {
        return this.roleFuncId;
    }

    /**
     * 设置roleFuncId
     * 
     * @param roleFuncId
     */
    public void setRoleFuncId(Integer roleFuncId) {
        this.roleFuncId = roleFuncId;
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