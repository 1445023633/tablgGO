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
 * TBL_ALARM_DOWN_RECORD
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "TBL_ALARM_DOWN_RECORD")
public class TblAlarmDownRecordEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 1447230213264847744L;

    /** alamDownRecordId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "ALAM_DOWN_RECORD_ID", unique = true, nullable = false, length = 10)
    private Integer alamDownRecordId;

    /** reason */
    @Column(name = "REASON", nullable = true, length = 255)
    private String reason;

    /** recordTime */
    @Column(name = "RECORD_TIME", nullable = true)
    private Date recordTime;

    /** recordUser */
    @Column(name = "RECORD_USER", nullable = true, length = 255)
    private String recordUser;

    /** downResult */
    @Column(name = "DOWN_RESULT", nullable = true, length = 255)
    private String downResult;

    /** pointDataId */
    @Column(name = "POINT_DATA_ID", nullable = true, length = 10)
    private Integer pointDataId;

    /**
     * 获取alamDownRecordId
     * 
     * @return alamDownRecordId
     */
    public Integer getAlamDownRecordId() {
        return this.alamDownRecordId;
    }

    /**
     * 设置alamDownRecordId
     * 
     * @param alamDownRecordId
     */
    public void setAlamDownRecordId(Integer alamDownRecordId) {
        this.alamDownRecordId = alamDownRecordId;
    }

    /**
     * 获取reason
     * 
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * 设置reason
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
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
     * 获取recordUser
     * 
     * @return recordUser
     */
    public String getRecordUser() {
        return this.recordUser;
    }

    /**
     * 设置recordUser
     * 
     * @param recordUser
     */
    public void setRecordUser(String recordUser) {
        this.recordUser = recordUser;
    }

    /**
     * 获取downResult
     * 
     * @return downResult
     */
    public String getDownResult() {
        return this.downResult;
    }

    /**
     * 设置downResult
     * 
     * @param downResult
     */
    public void setDownResult(String downResult) {
        this.downResult = downResult;
    }

    /**
     * 获取pointDataId
     * 
     * @return pointDataId
     */
    public Integer getPointDataId() {
        return this.pointDataId;
    }

    /**
     * 设置pointDataId
     * 
     * @param pointDataId
     */
    public void setPointDataId(Integer pointDataId) {
        this.pointDataId = pointDataId;
    }
}