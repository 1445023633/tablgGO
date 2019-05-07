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
 * TBL_ROLE_FUNC
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class TblRoleFuncVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 6258468940722114157L;

    /** roleFuncId */
    private Integer roleFuncId;

    /** funcId */
    private Integer funcId;

    /** roleId */
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