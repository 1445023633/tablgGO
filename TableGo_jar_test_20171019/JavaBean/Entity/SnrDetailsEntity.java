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
 * SNR_DETAILS
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "SNR_DETAILS")
public class SnrDetailsEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -8262897206091965570L;

    /** id */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "ID", unique = true, nullable = false, length = 10)
    private Integer id;

    /** devicesettingsId */
    @Column(name = "DEVICESETTINGS_ID", nullable = true, length = 10)
    private Integer devicesettingsId;

    /** ch1Snr */
    @Column(name = "CH1_SNR", nullable = true)
    private Float ch1Snr;

    /** ch2Snr */
    @Column(name = "CH2_SNR", nullable = true)
    private Float ch2Snr;

    /** ch3Snr */
    @Column(name = "CH3_SNR", nullable = true)
    private Float ch3Snr;

    /** ch4Snr */
    @Column(name = "CH4_SNR", nullable = true)
    private Float ch4Snr;

    /** ch5Snr */
    @Column(name = "CH5_SNR", nullable = true)
    private Float ch5Snr;

    /** ch6Snr */
    @Column(name = "CH6_SNR", nullable = true)
    private Float ch6Snr;

    /** ch7Snr */
    @Column(name = "CH7_SNR", nullable = true)
    private Float ch7Snr;

    /** ch1SnrB */
    @Column(name = "CH1_SNR_B", nullable = true)
    private Float ch1SnrB;

    /** ch2SnrB */
    @Column(name = "CH2_SNR_B", nullable = true)
    private Float ch2SnrB;

    /** ch3SnrB */
    @Column(name = "CH3_SNR_B", nullable = true)
    private Float ch3SnrB;

    /** ch4SnrB */
    @Column(name = "CH4_SNR_B", nullable = true)
    private Float ch4SnrB;

    /** ch5SnrB */
    @Column(name = "CH5_SNR_B", nullable = true)
    private Float ch5SnrB;

    /** ch6SnrB */
    @Column(name = "CH6_SNR_B", nullable = true)
    private Float ch6SnrB;

    /** ch7SnrB */
    @Column(name = "CH7_SNR_B", nullable = true)
    private Float ch7SnrB;

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
     * 获取devicesettingsId
     * 
     * @return devicesettingsId
     */
    public Integer getDevicesettingsId() {
        return this.devicesettingsId;
    }

    /**
     * 设置devicesettingsId
     * 
     * @param devicesettingsId
     */
    public void setDevicesettingsId(Integer devicesettingsId) {
        this.devicesettingsId = devicesettingsId;
    }

    /**
     * 获取ch1Snr
     * 
     * @return ch1Snr
     */
    public Float getCh1Snr() {
        return this.ch1Snr;
    }

    /**
     * 设置ch1Snr
     * 
     * @param ch1Snr
     */
    public void setCh1Snr(Float ch1Snr) {
        this.ch1Snr = ch1Snr;
    }

    /**
     * 获取ch2Snr
     * 
     * @return ch2Snr
     */
    public Float getCh2Snr() {
        return this.ch2Snr;
    }

    /**
     * 设置ch2Snr
     * 
     * @param ch2Snr
     */
    public void setCh2Snr(Float ch2Snr) {
        this.ch2Snr = ch2Snr;
    }

    /**
     * 获取ch3Snr
     * 
     * @return ch3Snr
     */
    public Float getCh3Snr() {
        return this.ch3Snr;
    }

    /**
     * 设置ch3Snr
     * 
     * @param ch3Snr
     */
    public void setCh3Snr(Float ch3Snr) {
        this.ch3Snr = ch3Snr;
    }

    /**
     * 获取ch4Snr
     * 
     * @return ch4Snr
     */
    public Float getCh4Snr() {
        return this.ch4Snr;
    }

    /**
     * 设置ch4Snr
     * 
     * @param ch4Snr
     */
    public void setCh4Snr(Float ch4Snr) {
        this.ch4Snr = ch4Snr;
    }

    /**
     * 获取ch5Snr
     * 
     * @return ch5Snr
     */
    public Float getCh5Snr() {
        return this.ch5Snr;
    }

    /**
     * 设置ch5Snr
     * 
     * @param ch5Snr
     */
    public void setCh5Snr(Float ch5Snr) {
        this.ch5Snr = ch5Snr;
    }

    /**
     * 获取ch6Snr
     * 
     * @return ch6Snr
     */
    public Float getCh6Snr() {
        return this.ch6Snr;
    }

    /**
     * 设置ch6Snr
     * 
     * @param ch6Snr
     */
    public void setCh6Snr(Float ch6Snr) {
        this.ch6Snr = ch6Snr;
    }

    /**
     * 获取ch7Snr
     * 
     * @return ch7Snr
     */
    public Float getCh7Snr() {
        return this.ch7Snr;
    }

    /**
     * 设置ch7Snr
     * 
     * @param ch7Snr
     */
    public void setCh7Snr(Float ch7Snr) {
        this.ch7Snr = ch7Snr;
    }

    /**
     * 获取ch1SnrB
     * 
     * @return ch1SnrB
     */
    public Float getCh1SnrB() {
        return this.ch1SnrB;
    }

    /**
     * 设置ch1SnrB
     * 
     * @param ch1SnrB
     */
    public void setCh1SnrB(Float ch1SnrB) {
        this.ch1SnrB = ch1SnrB;
    }

    /**
     * 获取ch2SnrB
     * 
     * @return ch2SnrB
     */
    public Float getCh2SnrB() {
        return this.ch2SnrB;
    }

    /**
     * 设置ch2SnrB
     * 
     * @param ch2SnrB
     */
    public void setCh2SnrB(Float ch2SnrB) {
        this.ch2SnrB = ch2SnrB;
    }

    /**
     * 获取ch3SnrB
     * 
     * @return ch3SnrB
     */
    public Float getCh3SnrB() {
        return this.ch3SnrB;
    }

    /**
     * 设置ch3SnrB
     * 
     * @param ch3SnrB
     */
    public void setCh3SnrB(Float ch3SnrB) {
        this.ch3SnrB = ch3SnrB;
    }

    /**
     * 获取ch4SnrB
     * 
     * @return ch4SnrB
     */
    public Float getCh4SnrB() {
        return this.ch4SnrB;
    }

    /**
     * 设置ch4SnrB
     * 
     * @param ch4SnrB
     */
    public void setCh4SnrB(Float ch4SnrB) {
        this.ch4SnrB = ch4SnrB;
    }

    /**
     * 获取ch5SnrB
     * 
     * @return ch5SnrB
     */
    public Float getCh5SnrB() {
        return this.ch5SnrB;
    }

    /**
     * 设置ch5SnrB
     * 
     * @param ch5SnrB
     */
    public void setCh5SnrB(Float ch5SnrB) {
        this.ch5SnrB = ch5SnrB;
    }

    /**
     * 获取ch6SnrB
     * 
     * @return ch6SnrB
     */
    public Float getCh6SnrB() {
        return this.ch6SnrB;
    }

    /**
     * 设置ch6SnrB
     * 
     * @param ch6SnrB
     */
    public void setCh6SnrB(Float ch6SnrB) {
        this.ch6SnrB = ch6SnrB;
    }

    /**
     * 获取ch7SnrB
     * 
     * @return ch7SnrB
     */
    public Float getCh7SnrB() {
        return this.ch7SnrB;
    }

    /**
     * 设置ch7SnrB
     * 
     * @param ch7SnrB
     */
    public void setCh7SnrB(Float ch7SnrB) {
        this.ch7SnrB = ch7SnrB;
    }
}