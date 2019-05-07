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
 * TBL_ORDER_DATA
 * 
 * @author bianj
 * @version 1.0.0 2019-02-23
 */
@Entity
@Table(name = "TBL_ORDER_DATA")
public class TblOrderDataEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -2684593996242181873L;

    /** orderId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "ORDER_ID", unique = true, nullable = false, length = 10)
    private Integer orderId;

    /** orderContent */
    @Column(name = "ORDER_CONTENT", nullable = true, length = 60)
    private String orderContent;

    /** backFlage */
    @Column(name = "BACK_FLAGE", nullable = true, length = 60)
    private String backFlage;

    /** functionMark */
    @Column(name = "FUNCTION_MARK", nullable = true, length = 60)
    private String functionMark;

    /** 指令类别 */
    @Column(name = "指令类别", nullable = true, length = 10)
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