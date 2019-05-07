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
 * REALTIMEDATA
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "REALTIMEDATA")
public class RealtimedataEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 2203152285134370431L;

    /** id */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "ID", unique = true, nullable = false, length = 10)
    private Integer id;

    /** channelsettingsId */
    @Column(name = "CHANNELSETTINGS_ID", nullable = true, length = 10)
    private Integer channelsettingsId;

    /** amplitude */
    @Column(name = "AMPLITUDE", nullable = true)
    private Float amplitude;

    /** frequency */
    @Column(name = "FREQUENCY", nullable = true, length = 10)
    private Integer frequency;

    /** energy */
    @Column(name = "ENERGY", nullable = true, length = 10)
    private Integer energy;

    /** alarmAmplitude */
    @Column(name = "ALARM_AMPLITUDE", nullable = true, length = 10)
    private Integer alarmAmplitude;

    /** alarmAmplitudeFrequency */
    @Column(name = "ALARM_AMPLITUDE_FREQUENCY", nullable = true, length = 10)
    private Integer alarmAmplitudeFrequency;

    /** updatetime */
    @Column(name = "UPDATETIME", nullable = true)
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