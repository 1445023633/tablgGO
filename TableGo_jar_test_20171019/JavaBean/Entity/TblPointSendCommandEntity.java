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
 * TBL_POINT_SEND_COMMAND
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "TBL_POINT_SEND_COMMAND")
public class TblPointSendCommandEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -64427784662844551L;

    /** sendCommandId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "SEND_COMMAND_ID", unique = true, nullable = false, length = 10)
    private Integer sendCommandId;

    /** commandContent */
    @Column(name = "COMMAND_CONTENT", nullable = false, length = 255)
    private String commandContent;

    /** commandCatagoryId */
    @Column(name = "COMMAND_CATAGORY_ID", nullable = false, length = 10)
    private Integer commandCatagoryId;

    /** commandName */
    @Column(name = "COMMAND_NAME", nullable = true, length = 255)
    private String commandName;

    /** remark */
    @Column(name = "REMARK", nullable = true, length = 255)
    private String remark;

    /** protocolId */
    @Column(name = "PROTOCOL_ID", nullable = true, length = 255)
    private String protocolId;

    /** intervalTime */
    @Column(name = "INTERVAL_TIME", nullable = true, length = 10)
    private Integer intervalTime;

    /** pointId */
    @Column(name = "POINT_ID", nullable = true, length = 10)
    private Integer pointId;

    /** indicatorCategory */
    @Column(name = "INDICATOR_CATEGORY", nullable = true, length = 10)
    private Integer indicatorCategory;

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
     * 获取commandName
     * 
     * @return commandName
     */
    public String getCommandName() {
        return this.commandName;
    }

    /**
     * 设置commandName
     * 
     * @param commandName
     */
    public void setCommandName(String commandName) {
        this.commandName = commandName;
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

    /**
     * 获取protocolId
     * 
     * @return protocolId
     */
    public String getProtocolId() {
        return this.protocolId;
    }

    /**
     * 设置protocolId
     * 
     * @param protocolId
     */
    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }

    /**
     * 获取intervalTime
     * 
     * @return intervalTime
     */
    public Integer getIntervalTime() {
        return this.intervalTime;
    }

    /**
     * 设置intervalTime
     * 
     * @param intervalTime
     */
    public void setIntervalTime(Integer intervalTime) {
        this.intervalTime = intervalTime;
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
     * 获取indicatorCategory
     * 
     * @return indicatorCategory
     */
    public Integer getIndicatorCategory() {
        return this.indicatorCategory;
    }

    /**
     * 设置indicatorCategory
     * 
     * @param indicatorCategory
     */
    public void setIndicatorCategory(Integer indicatorCategory) {
        this.indicatorCategory = indicatorCategory;
    }
}