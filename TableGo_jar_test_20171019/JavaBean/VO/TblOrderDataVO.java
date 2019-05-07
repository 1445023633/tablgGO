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
 * TBL_ORDER_DATA
 * 
 * @author bianj
 * @version 1.0.0 2019-02-23
 */
public class TblOrderDataVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -2684593996242181873L;

    /** orderId */
    private Integer orderId;

    /** orderContent */
    private String orderContent;

    /** backFlage */
    private String backFlage;

    /** functionMark */
    private String functionMark;

    /** 指令类别 */
    private String 指令类别;

    /**
     * 获取orderId
     * 
     * @return orderId
     */
    public Integer getOrderId() {
        return this.orderId;
    }

    /**
     * 设置orderId
     * 
     * @param orderId
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取orderContent
     * 
     * @return orderContent
     */
    public String getOrderContent() {
        return this.orderContent;
    }

    /**
     * 设置orderContent
     * 
     * @param orderContent
     */
    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent;
    }

    /**
     * 获取backFlage
     * 
     * @return backFlage
     */
    public String getBackFlage() {
        return this.backFlage;
    }

    /**
     * 设置backFlage
     * 
     * @param backFlage
     */
    public void setBackFlage(String backFlage) {
        this.backFlage = backFlage;
    }

    /**
     * 获取functionMark
     * 
     * @return functionMark
     */
    public String getFunctionMark() {
        return this.functionMark;
    }

    /**
     * 设置functionMark
     * 
     * @param functionMark
     */
    public void setFunctionMark(String functionMark) {
        this.functionMark = functionMark;
    }

    /**
     * 获取指令类别
     * 
     * @return 指令类别
     */
    public String get指令类别() {
        return this.指令类别;
    }

    /**
     * 设置指令类别
     * 
     * @param 指令类别
     */
    public void set指令类别(String 指令类别) {
        this.指令类别 = 指令类别;
    }
}