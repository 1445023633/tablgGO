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
 * TBL_USER_OPERATION
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class TblUserOperationVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3783686881029745563L;

    /** userOperationId */
    private Integer userOperationId;

    /** recordTime */
    private Date recordTime;

    /** fromIp */
    private String fromIp;

    /** userId */
    private String userId;

    /** intefaceAddress */
    private String intefaceAddress;

    /**
     * 获取userOperationId
     * 
     * @return userOperationId
     */
    public Integer getUserOperationId() {
        return this.userOperationId;
    }

    /**
     * 设置userOperationId
     * 
     * @param userOperationId
     */
    public void setUserOperationId(Integer userOperationId) {
        this.userOperationId = userOperationId;
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
     * 获取fromIp
     * 
     * @return fromIp
     */
    public String getFromIp() {
        return this.fromIp;
    }

    /**
     * 设置fromIp
     * 
     * @param fromIp
     */
    public void setFromIp(String fromIp) {
        this.fromIp = fromIp;
    }

    /**
     * 获取userId
     * 
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * 设置userId
     * 
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取intefaceAddress
     * 
     * @return intefaceAddress
     */
    public String getIntefaceAddress() {
        return this.intefaceAddress;
    }

    /**
     * 设置intefaceAddress
     * 
     * @param intefaceAddress
     */
    public void setIntefaceAddress(String intefaceAddress) {
        this.intefaceAddress = intefaceAddress;
    }
}