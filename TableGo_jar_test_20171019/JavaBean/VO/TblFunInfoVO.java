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
 * TBL_FUN_INFO
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class TblFunInfoVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -2352942875335481904L;

    /** funcId */
    private Integer funcId;

    /** address */
    private String address;

    /** funcName */
    private String funcName;

    /** lineIds */
    private String lineIds;

    /** company */
    private String company;

    /** point */
    private String point;

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
     * 获取address
     * 
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * 设置address
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取funcName
     * 
     * @return funcName
     */
    public String getFuncName() {
        return this.funcName;
    }

    /**
     * 设置funcName
     * 
     * @param funcName
     */
    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    /**
     * 获取lineIds
     * 
     * @return lineIds
     */
    public String getLineIds() {
        return this.lineIds;
    }

    /**
     * 设置lineIds
     * 
     * @param lineIds
     */
    public void setLineIds(String lineIds) {
        this.lineIds = lineIds;
    }

    /**
     * 获取company
     * 
     * @return company
     */
    public String getCompany() {
        return this.company;
    }

    /**
     * 设置company
     * 
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取point
     * 
     * @return point
     */
    public String getPoint() {
        return this.point;
    }

    /**
     * 设置point
     * 
     * @param point
     */
    public void setPoint(String point) {
        this.point = point;
    }
}