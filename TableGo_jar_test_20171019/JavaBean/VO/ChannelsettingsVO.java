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
 * CHANNELSETTINGS
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class ChannelsettingsVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -254821494207166725L;

    /** id */
    private Integer id;

    /** devicesettingId */
    private Integer devicesettingId;

    /** channelNumber */
    private Integer channelNumber;

    /** location */
    private String location;

    /** locationDetail */
    private String locationDetail;

    /** createtime */
    private Date createtime;

    /** enable */
    private Integer enable;

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
     * 获取devicesettingId
     * 
     * @return devicesettingId
     */
    public Integer getDevicesettingId() {
        return this.devicesettingId;
    }

    /**
     * 设置devicesettingId
     * 
     * @param devicesettingId
     */
    public void setDevicesettingId(Integer devicesettingId) {
        this.devicesettingId = devicesettingId;
    }

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
}