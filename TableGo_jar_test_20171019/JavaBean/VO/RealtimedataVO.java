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
 * REALTIMEDATA
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class RealtimedataVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 2203152285134370431L;

    /** id */
    private Integer id;

    /** channelsettingsId */
    private Integer channelsettingsId;

    /** amplitude */
    private Float amplitude;

    /** frequency */
    private Integer frequency;

    /** energy */
    private Integer energy;

    /** alarmAmplitude */
    private Integer alarmAmplitude;

    /** alarmAmplitudeFrequency */
    private Integer alarmAmplitudeFrequency;

    /** updatetime */
    private Date updatetime;

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
     * 获取channelsettingsId
     * 
     * @return channelsettingsId
     */
    public Integer getChannelsettingsId() {
        return this.channelsettingsId;
    }

    /**
     * 设置channelsettingsId
     * 
     * @param channelsettingsId
     */
    public void setChannelsettingsId(Integer channelsettingsId) {
        this.channelsettingsId = channelsettingsId;
    }

    /**
     * 获取amplitude
     * 
     * @return amplitude
     */
    public Float getAmplitude() {
        return this.amplitude;
    }

    /**
     * 设置amplitude
     * 
     * @param amplitude
     */
    public void setAmplitude(Float amplitude) {
        this.amplitude = amplitude;
    }

    /**
     * 获取frequency
     * 
     * @return frequency
     */
    public Integer getFrequency() {
        return this.frequency;
    }

    /**
     * 设置frequency
     * 
     * @param frequency
     */
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    /**
     * 获取energy
     * 
     * @return energy
     */
    public Integer getEnergy() {
        return this.energy;
    }

    /**
     * 设置energy
     * 
     * @param energy
     */
    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    /**
     * 获取alarmAmplitude
     * 
     * @return alarmAmplitude
     */
    public Integer getAlarmAmplitude() {
        return this.alarmAmplitude;
    }

    /**
     * 设置alarmAmplitude
     * 
     * @param alarmAmplitude
     */
    public void setAlarmAmplitude(Integer alarmAmplitude) {
        this.alarmAmplitude = alarmAmplitude;
    }

    /**
     * 获取alarmAmplitudeFrequency
     * 
     * @return alarmAmplitudeFrequency
     */
    public Integer getAlarmAmplitudeFrequency() {
        return this.alarmAmplitudeFrequency;
    }

    /**
     * 设置alarmAmplitudeFrequency
     * 
     * @param alarmAmplitudeFrequency
     */
    public void setAlarmAmplitudeFrequency(Integer alarmAmplitudeFrequency) {
        this.alarmAmplitudeFrequency = alarmAmplitudeFrequency;
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
}