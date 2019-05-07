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

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * TBL_COMMAND_RECORD
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "TBL_COMMAND_RECORD")
public class TblCommandRecordEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 3457243595257407631L;

    /** commandRecordId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "COMMAND_RECORD_ID", unique = true, nullable = false, length = 10)
    private Integer commandRecordId;

    /** adminUserId */
    @Column(name = "ADMIN_USER_ID", nullable = true, length = 50)
    private String adminUserId;

    /** commandContent */
    @Column(name = "COMMAND_CONTENT", nullable = true, length = 500)
    private String commandContent;

    /** backContent */
    @Column(name = "BACK_CONTENT", nullable = true, length = 500)
    private String backContent;

    /** sendCommandId */
    @Column(name = "SEND_COMMAND_ID", nullable = true, length = 10)
    private Integer sendCommandId;

    /** pointName */
    @Column(name = "POINT_NAME", nullable = true, length = 100)
    private String pointName;

    /** commandCatagoryId */
    @Column(name = "COMMAND_CATAGORY_ID", nullable = true, length = 10)
    private Integer commandCatagoryId;

    /** recordTime */
    @Column(name = "RECORD_TIME", nullable = true)
    private Date recordTime;

    /** pointId */
    @Column(name = "POINT_ID", nullable = true, length = 10)
    private Integer pointId;

    /**
     * 获取commandRecordId
     * 
     * @return commandRecordId
     */
    public Integer getCommandRecordId() {
        return this.commandRecordId;
    }

    /**
     * 设置commandRecordId
     * 
     * @param commandRecordId
     */
    public void setCommandRecordId(Integer commandRecordId) {
        this.commandRecordId = commandRecordId;
    }

    /**
     * 获取adminUserId
     * 
     * @return adminUserId
     */
    public String getAdminUserId() {
        return this.adminUserId;
    }

    /**
     * 设置adminUserId
     * 
     * @param adminUserId
     */
    public void setAdminUserId(String adminUserId) {
        this.adminUserId = adminUserId;
    }

    /**
     * 获取commandContent
     * 
     * @return commandContent
     */
    public String getCommandContent() {
        return this.commandContent;
    }

    /**
     * 设置commandContent
     * 
     * @param commandContent
     */
    public void setCommandContent(String commandContent) {
        this.commandContent = commandContent;
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
     * 获取sendCommandId
     * 
     * @return sendCommandId
     */
    public Integer getSendCommandId() {
        return this.sendCommandId;
    }

    /**
     * 设置sendCommandId
     * 
     * @param sendCommandId
     */
    public void setSendCommandId(Integer sendCommandId) {
        this.sendCommandId = sendCommandId;
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

    /**
     * 获取commandCatagoryId
     * 
     * @return commandCatagoryId
     */
    public Integer getCommandCatagoryId() {
        return this.commandCatagoryId;
    }

    /**
     * 设置commandCatagoryId
     * 
     * @param commandCatagoryId
     */
    public void setCommandCatagoryId(Integer commandCatagoryId) {
        this.commandCatagoryId = commandCatagoryId;
    }

    /**
     * 获取recordTime
     * 
     * @return recordTime
     */
    public Date getRecordTime() {
        return this.recordTime;
    }

    /**
     * 设置recordTime
     * 
     * @param recordTime
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
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
}