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
 * TBL_ORDER_RECORD
 * 
 * @author bianj
 * @version 1.0.0 2019-02-23
 */
public class TblOrderRecordVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 4929032631946828341L;

    /** orderRecordId */
    private Integer orderRecordId;

    /** adminUserId */
    private Integer adminUserId;

    /** pointId */
    private Integer pointId;

    /** orderContent */
    private String orderContent;

    /** backContent */
    private String backContent;

    /** direction */
    private Integer direction;

    /** sendOrderId */
    private Integer sendOrderId;

    /** pointName */
    private String pointName;

    /**
     * 获取orderRecordId
     * 
     * @return orderRecordId
     */
    public Integer getOrderRecordId() {
        return this.orderRecordId;
    }

    /**
     * 设置orderRecordId
     * 
     * @param orderRecordId
     */
    public void setOrderRecordId(Integer orderRecordId) {
        this.orderRecordId = orderRecordId;
    }

    /**
     * 获取adminUserId
     * 
     * @return adminUserId
     */
    public Integer getAdminUserId() {
        return this.adminUserId;
    }

    /**
     * 设置adminUserId
     * 
     * @param adminUserId
     */
    public void setAdminUserId(Integer adminUserId) {
        this.adminUserId = adminUserId;
    }

    /**
     * 获取pointId
     * 
     * @return pointId
     */
    public Integer getPointId() {
        return this.pointId;
    }

    /**
     * 设置pointId
     * 
     * @param pointId
     */
    public void setPointId(Integer pointId) {
        this.pointId = pointId;
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
     * 获取backContent
     * 
     * @return backContent
     */
    public String getBackContent() {
        return this.backContent;
    }

    /**
     * 设置backContent
     * 
     * @param backContent
     */
    public void setBackContent(String backContent) {
        this.backContent = backContent;
    }

    /**
     * 获取direction
     * 
     * @return direction
     */
    public Integer getDirection() {
        return this.direction;
    }

    /**
     * 设置direction
     * 
     * @param direction
     */
    public void setDirection(Integer direction) {
        this.direction = direction;
    }

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
     * 获取pointName
     * 
     * @return pointName
     */
    public String getPointName() {
        return this.pointName;
    }

    /**
     * 设置pointName
     * 
     * @param pointName
     */
    public void setPointName(String pointName) {
        this.pointName = pointName;
    }
}