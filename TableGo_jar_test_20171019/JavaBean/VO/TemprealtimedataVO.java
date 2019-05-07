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
 * TEMPREALTIMEDATA
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class TemprealtimedataVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -8722231880714119593L;

    /** id */
    private Integer id;

    /** tempchannelsettingsId */
    private Integer tempchannelsettingsId;

    /** value */
    private Float value;

    /** alarm */
    private Integer alarm;

    /** updatetime */
    private Date updatetime;

    /** times */
    private Integer times;

    /**
     * 获取id
     * 
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置id
     * 
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取tempchannelsettingsId
     * 
     * @return tempchannelsettingsId
     */
    public Integer getTempchannelsettingsId() {
        return this.tempchannelsettingsId;
    }

    /**
     * 设置tempchannelsettingsId
     * 
     * @param tempchannelsettingsId
     */
    public void setTempchannelsettingsId(Integer tempchannelsettingsId) {
        this.tempchannelsettingsId = tempchannelsettingsId;
    }

    /**
     * 获取value
     * 
     * @return value
     */
    public Float getValue() {
        return this.value;
    }

    /**
     * 设置value
     * 
     * @param value
     */
    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * 获取alarm
     * 
     * @return alarm
     */
    public Integer getAlarm() {
        return this.alarm;
    }

    /**
     * 设置alarm
     * 
     * @param alarm
     */
    public void setAlarm(Integer alarm) {
        this.alarm = alarm;
    }

    /**
     * 获取updatetime
     * 
     * @return updatetime
     */
    public Date getUpdatetime() {
        return this.updatetime;
    }

    /**
     * 设置updatetime
     * 
     * @param updatetime
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 获取times
     * 
     * @return times
     */
    public Integer getTimes() {
        return this.times;
    }

    /**
     * 设置times
     * 
     * @param times
     */
    public void setTimes(Integer times) {
        this.times = times;
    }
}