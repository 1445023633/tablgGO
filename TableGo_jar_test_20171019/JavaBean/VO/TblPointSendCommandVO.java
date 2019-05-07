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
 * TBL_POINT_SEND_COMMAND
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class TblPointSendCommandVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -64427784662844551L;

    /** sendCommandId */
    private Integer sendCommandId;

    /** commandContent */
    private String commandContent;

    /** commandCatagoryId */
    private Integer commandCatagoryId;

    /** commandName */
    private String commandName;

    /** remark */
    private String remark;

    /** protocolId */
    private String protocolId;

    /** intervalTime */
    private Integer intervalTime;

    /** pointId */
    private Integer pointId;

    /** indicatorCategory */
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