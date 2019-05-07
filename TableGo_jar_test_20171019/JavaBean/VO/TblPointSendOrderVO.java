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
 * TBL_POINT_SEND_ORDER
 * 
 * @author bianj
 * @version 1.0.0 2019-02-23
 */
public class TblPointSendOrderVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 8533489228781829605L;

    /** sendOrderId */
    private Integer sendOrderId;

    /** orderContent */
    private String orderContent;

    /** orderCatagoryId */
    private Integer orderCatagoryId;

    /** orderName */
    private String orderName;

    /** remark */
    private String remark;

    /**
     * 获取sendOrderId
     * 
     * @return sendOrderId
     */
    public Integer getSendOrderId() {
        return this.sendOrderId;
    }

    /**
     * 设置sendOrderId
     * 
     * @param sendOrderId
     */
    public void setSendOrderId(Integer sendOrderId) {
        this.sendOrderId = sendOrderId;
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
     * 获取orderCatagoryId
     * 
     * @return orderCatagoryId
     */
    public Integer getOrderCatagoryId() {
        return this.orderCatagoryId;
    }

    /**
     * 设置orderCatagoryId
     * 
     * @param orderCatagoryId
     */
    public void setOrderCatagoryId(Integer orderCatagoryId) {
        this.orderCatagoryId = orderCatagoryId;
    }

    /**
     * 获取orderName
     * 
     * @return orderName
     */
    public String getOrderName() {
        return this.orderName;
    }

    /**
     * 设置orderName
     * 
     * @param orderName
     */
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    /**
     * 获取remark
     * 
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * 设置remark
     * 
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}