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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * DEVICEDIAGRAM
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "DEVICEDIAGRAM")
public class DevicediagramEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -5487627998527824175L;

    /** id */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "ID", unique = true, nullable = false, length = 10)
    private Integer id;

    /** channelsettingsId */
    @Column(name = "CHANNELSETTINGS_ID", nullable = true, length = 10)
    private Integer channelsettingsId;

    /** devicedataId */
    @Column(name = "DEVICEDATA_ID", nullable = true, length = 10)
    private Integer devicedataId;

    /** ch1Amplitude */
    @Column(name = "CH1_AMPLITUDE", nullable = true, length = 65535)
    private String ch1Amplitude;

    /** ch2Amplitude */
    @Column(name = "CH2_AMPLITUDE", nullable = true, length = 65535)
    private String ch2Amplitude;

    /** ch1Phase */
    @Column(name = "CH1_PHASE", nullable = true, length = 65535)
    private String ch1Phase;

    /** ch2Phase */
    @Column(name = "CH2_PHASE", nullable = true, length = 65535)
    private String ch2Phase;

    /** updateflag */
    @Column(name = "UPDATEFLAG", nullable = true, length = 10)
    private Integer updateflag;

    /** addAmplitude */
    @Column(name = "ADD_AMPLITUDE", nullable = true, length = 65535)
    private String addAmplitude;

    /** addPhase */
    @Column(name = "ADD_PHASE", nullable = true, length = 65535)
    private String addPhase;

    /** phase */
    @Column(name = "PHASE", nullable = true, length = 65535)
    private String phase;

    /** ch3Amplitude */
    @Column(name = "CH3_AMPLITUDE", nullable = true, length = 65535)
    private String ch3Amplitude;

    /** ch3Phase */
    @Column(name = "CH3_PHASE", nullable = true, length = 65535)
    private String ch3Phase;

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
     * 获取devicedataId
     * 
     * @return devicedataId
     */
    public Integer getDevicedataId() {
        return this.devicedataId;
    }

    /**
     * 设置devicedataId
     * 
     * @param devicedataId
     */
    public void setDevicedataId(Integer devicedataId) {
        this.devicedataId = devicedataId;
    }

    /**
     * 获取ch1Amplitude
     * 
     * @return ch1Amplitude
     */
    public String getCh1Amplitude() {
        return this.ch1Amplitude;
    }

    /**
     * 设置ch1Amplitude
     * 
     * @param ch1Amplitude
     */
    public void setCh1Amplitude(String ch1Amplitude) {
        this.ch1Amplitude = ch1Amplitude;
    }

    /**
     * 获取ch2Amplitude
     * 
     * @return ch2Amplitude
     */
    public String getCh2Amplitude() {
        return this.ch2Amplitude;
    }

    /**
     * 设置ch2Amplitude
     * 
     * @param ch2Amplitude
     */
    public void setCh2Amplitude(String ch2Amplitude) {
        this.ch2Amplitude = ch2Amplitude;
    }

    /**
     * 获取ch1Phase
     * 
     * @return ch1Phase
     */
    public String getCh1Phase() {
        return this.ch1Phase;
    }

    /**
     * 设置ch1Phase
     * 
     * @param ch1Phase
     */
    public void setCh1Phase(String ch1Phase) {
        this.ch1Phase = ch1Phase;
    }

    /**
     * 获取ch2Phase
     * 
     * @return ch2Phase
     */
    public String getCh2Phase() {
        return this.ch2Phase;
    }

    /**
     * 设置ch2Phase
     * 
     * @param ch2Phase
     */
    public void setCh2Phase(String ch2Phase) {
        this.ch2Phase = ch2Phase;
    }

    /**
     * 获取updateflag
     * 
     * @return updateflag
     */
    public Integer getUpdateflag() {
        return this.updateflag;
    }

    /**
     * 设置updateflag
     * 
     * @param updateflag
     */
    public void setUpdateflag(Integer updateflag) {
        this.updateflag = updateflag;
    }

    /**
     * 获取addAmplitude
     * 
     * @return addAmplitude
     */
    public String getAddAmplitude() {
        return this.addAmplitude;
    }

    /**
     * 设置addAmplitude
     * 
     * @param addAmplitude
     */
    public void setAddAmplitude(String addAmplitude) {
        this.addAmplitude = addAmplitude;
    }

    /**
     * 获取addPhase
     * 
     * @return addPhase
     */
    public String getAddPhase() {
        return this.addPhase;
    }

    /**
     * 设置addPhase
     * 
     * @param addPhase
     */
    public void setAddPhase(String addPhase) {
        this.addPhase = addPhase;
    }

    /**
     * 获取phase
     * 
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * 设置phase
     * 
     * @param phase
     */
    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * 获取ch3Amplitude
     * 
     * @return ch3Amplitude
     */
    public String getCh3Amplitude() {
        return this.ch3Amplitude;
    }

    /**
     * 设置ch3Amplitude
     * 
     * @param ch3Amplitude
     */
    public void setCh3Amplitude(String ch3Amplitude) {
        this.ch3Amplitude = ch3Amplitude;
    }

    /**
     * 获取ch3Phase
     * 
     * @return ch3Phase
     */
    public String getCh3Phase() {
        return this.ch3Phase;
    }

    /**
     * 设置ch3Phase
     * 
     * @param ch3Phase
     */
    public void setCh3Phase(String ch3Phase) {
        this.ch3Phase = ch3Phase;
    }
}