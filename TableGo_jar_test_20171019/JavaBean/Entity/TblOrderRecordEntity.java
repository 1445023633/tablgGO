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
 * TBL_ORDER_RECORD
 * 
 * @author bianj
 * @version 1.0.0 2019-02-23
 */
@Entity
@Table(name = "TBL_ORDER_RECORD")
public class TblOrderRecordEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 4929032631946828341L;

    /** orderRecordId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "ORDER_RECORD_ID", unique = true, nullable = false, length = 10)
    private Integer orderRecordId;

    /** adminUserId */
    @Column(name = "ADMIN_USER_ID", nullable = true, length = 10)
    private Integer adminUserId;

    /** pointId */
    @Column(name = "POINT_ID", nullable = true, length = 10)
    private Integer pointId;

    /** orderContent */
    @Column(name = "ORDER_CONTENT", nullable = true, length = 200)
    private String orderContent;

    /** backContent */
    @Column(name = "BACK_CONTENT", nullable = true, length = 200)
    private String backContent;

    /** direction */
    @Column(name = "DIRECTION", nullable = true, length = 10)
    private Integer direction;

    /** sendOrderId */
    @Column(name = "SEND_ORDER_ID", nullable = true, length = 10)
    private Integer sendOrderId;

    /** pointName */
    @Column(name = "POINT_NAME", nullable = true, length = 100)
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