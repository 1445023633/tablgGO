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
 * TEMPDATA
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "TEMPDATA")
public class TempdataEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -4670168761437242401L;

    /** id */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "ID", unique = true, nullable = false, length = 10)
    private Integer id;

    /** tempchannelsettingsId */
    @Column(name = "TEMPCHANNELSETTINGS_ID", nullable = true, length = 10)
    private Integer tempchannelsettingsId;

    /** value */
    @Column(name = "VALUE", nullable = true)
    private Float value;

    /** alarm */
    @Column(name = "ALARM", nullable = true, length = 10)
    private Integer alarm;

    /** createtime */
    @Column(name = "CREATETIME", nullable = true)
    private Date createtime;

    /** times */
    @Column(name = "TIMES", nullable = true, length = 10)
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
     * 获取createtime
     * 
     * @return createtime
     */
    public Date getCreatetime() {
        return this.createtime;
    }

    /**
     * 设置createtime
     * 
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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