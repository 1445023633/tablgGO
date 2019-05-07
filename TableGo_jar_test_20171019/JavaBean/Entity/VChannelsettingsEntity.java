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
 * V_CHANNELSETTINGS
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "V_CHANNELSETTINGS")
public class VChannelsettingsEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7550658802951928571L;

    /** channelNumber */
    @Column(name = "CHANNEL_NUMBER", nullable = true, length = 10)
    private Integer channelNumber;

    /** location */
    @Column(name = "LOCATION", nullable = true, length = 50)
    private String location;

    /** locationDetail */
    @Column(name = "LOCATION_DETAIL", nullable = true, length = 50)
    private String locationDetail;

    /** createtime */
    @Column(name = "CREATETIME", nullable = true)
    private Date createtime;

    /** enable */
    @Column(name = "ENABLE", nullable = true, length = 10)
    private Integer enable;

    /** deviceId */
    @Column(name = "deviceId", nullable = true, length = 10)
    private Integer deviceId;

    /**
     * 获取channelNumber
     * 
     * @return channelNumber
     */
    public Integer getChannelNumber() {
        return this.channelNumber;
    }

    /**
     * 设置channelNumber
     * 
     * @param channelNumber
     */
    public void setChannelNumber(Integer channelNumber) {
        this.channelNumber = channelNumber;
    }

    /**
     * 获取location
     * 
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * 设置location
     * 
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 获取locationDetail
     * 
     * @return locationDetail
     */
    public String getLocationDetail() {
        return this.locationDetail;
    }

    /**
     * 设置locationDetail
     * 
     * @param locationDetail
     */
    public void setLocationDetail(String locationDetail) {
        this.locationDetail = locationDetail;
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
     * 获取enable
     * 
     * @return enable
     */
    public Integer getEnable() {
        return this.enable;
    }

    /**
     * 设置enable
     * 
     * @param enable
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * 获取deviceId
     * 
     * @return deviceId
     */
    public Integer getDeviceId() {
        return this.deviceId;
    }

    /**
     * 设置deviceId
     * 
     * @param deviceId
     */
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }
}