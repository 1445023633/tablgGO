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

/**
 * TBL_MSG_DATA
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class TblMsgDataVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -1140479758837938959L;

    /** msgId */
    private Integer msgId;

    /** sendTime */
    private Date sendTime;

    /** content */
    private String content;

    /** phoneOrEmail */
    private String phoneOrEmail;

    /** msgType */
    private String msgType;

    /** adminUserId */
    private String adminUserId;

    /** direction */
    private Integer direction;

    /**
     * 获取msgId
     * 
     * @return msgId
     */
    public Integer getMsgId() {
        return this.msgId;
    }

    /**
     * 设置msgId
     * 
     * @param msgId
     */
    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    /**
     * 获取sendTime
     * 
     * @return sendTime
     */
    public Date getSendTime() {
        return this.sendTime;
    }

    /**
     * 设置sendTime
     * 
     * @param sendTime
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 获取content
     * 
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * 设置content
     * 
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取phoneOrEmail
     * 
     * @return phoneOrEmail
     */
    public String getPhoneOrEmail() {
        return this.phoneOrEmail;
    }

    /**
     * 设置phoneOrEmail
     * 
     * @param phoneOrEmail
     */
    public void setPhoneOrEmail(String phoneOrEmail) {
        this.phoneOrEmail = phoneOrEmail;
    }

    /**
     * 获取msgType
     * 
     * @return msgType
     */
    public String getMsgType() {
        return this.msgType;
    }

    /**
     * 设置msgType
     * 
     * @param msgType
     */
    public void setMsgType(String msgType) {
        this.msgType = msgType;
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
}