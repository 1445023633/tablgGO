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
 * HF_DETAILS
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "HF_DETAILS")
public class HfDetailsEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 8842510457513047907L;

    /** id */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "ID", unique = true, nullable = false, length = 10)
    private Integer id;

    /** devicesettingsId */
    @Column(name = "DEVICESETTINGS_ID", nullable = true, length = 10)
    private Integer devicesettingsId;

    /** ch1Hf */
    @Column(name = "CH1_HF", nullable = true)
    private Float ch1Hf;

    /** ch2Hf */
    @Column(name = "CH2_HF", nullable = true)
    private Float ch2Hf;

    /** ch3Hf */
    @Column(name = "CH3_HF", nullable = true)
    private Float ch3Hf;

    /** ch4Hf */
    @Column(name = "CH4_HF", nullable = true)
    private Float ch4Hf;

    /** ch5Hf */
    @Column(name = "CH5_HF", nullable = true)
    private Float ch5Hf;

    /** ch6Hf */
    @Column(name = "CH6_HF", nullable = true)
    private Float ch6Hf;

    /** ch7Hf */
    @Column(name = "CH7_HF", nullable = true)
    private Float ch7Hf;

    /** ch1HfB */
    @Column(name = "CH1_HF_B", nullable = true)
    private Float ch1HfB;

    /** ch2HfB */
    @Column(name = "CH2_HF_B", nullable = true)
    private Float ch2HfB;

    /** ch3HfB */
    @Column(name = "CH3_HF_B", nullable = true)
    private Float ch3HfB;

    /** ch4HfB */
    @Column(name = "CH4_HF_B", nullable = true)
    private Float ch4HfB;

    /** ch5HfB */
    @Column(name = "CH5_HF_B", nullable = true)
    private Float ch5HfB;

    /** ch6HfB */
    @Column(name = "CH6_HF_B", nullable = true)
    private Float ch6HfB;

    /** ch7HfB */
    @Column(name = "CH7_HF_B", nullable = true)
    private Float ch7HfB;

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
     * 获取ch1Hf
     * 
     * @return ch1Hf
     */
    public Float getCh1Hf() {
        return this.ch1Hf;
    }

    /**
     * 设置ch1Hf
     * 
     * @param ch1Hf
     */
    public void setCh1Hf(Float ch1Hf) {
        this.ch1Hf = ch1Hf;
    }

    /**
     * 获取ch2Hf
     * 
     * @return ch2Hf
     */
    public Float getCh2Hf() {
        return this.ch2Hf;
    }

    /**
     * 设置ch2Hf
     * 
     * @param ch2Hf
     */
    public void setCh2Hf(Float ch2Hf) {
        this.ch2Hf = ch2Hf;
    }

    /**
     * 获取ch3Hf
     * 
     * @return ch3Hf
     */
    public Float getCh3Hf() {
        return this.ch3Hf;
    }

    /**
     * 设置ch3Hf
     * 
     * @param ch3Hf
     */
    public void setCh3Hf(Float ch3Hf) {
        this.ch3Hf = ch3Hf;
    }

    /**
     * 获取ch4Hf
     * 
     * @return ch4Hf
     */
    public Float getCh4Hf() {
        return this.ch4Hf;
    }

    /**
     * 设置ch4Hf
     * 
     * @param ch4Hf
     */
    public void setCh4Hf(Float ch4Hf) {
        this.ch4Hf = ch4Hf;
    }

    /**
     * 获取ch5Hf
     * 
     * @return ch5Hf
     */
    public Float getCh5Hf() {
        return this.ch5Hf;
    }

    /**
     * 设置ch5Hf
     * 
     * @param ch5Hf
     */
    public void setCh5Hf(Float ch5Hf) {
        this.ch5Hf = ch5Hf;
    }

    /**
     * 获取ch6Hf
     * 
     * @return ch6Hf
     */
    public Float getCh6Hf() {
        return this.ch6Hf;
    }

    /**
     * 设置ch6Hf
     * 
     * @param ch6Hf
     */
    public void setCh6Hf(Float ch6Hf) {
        this.ch6Hf = ch6Hf;
    }

    /**
     * 获取ch7Hf
     * 
     * @return ch7Hf
     */
    public Float getCh7Hf() {
        return this.ch7Hf;
    }

    /**
     * 设置ch7Hf
     * 
     * @param ch7Hf
     */
    public void setCh7Hf(Float ch7Hf) {
        this.ch7Hf = ch7Hf;
    }

    /**
     * 获取ch1HfB
     * 
     * @return ch1HfB
     */
    public Float getCh1HfB() {
        return this.ch1HfB;
    }

    /**
     * 设置ch1HfB
     * 
     * @param ch1HfB
     */
    public void setCh1HfB(Float ch1HfB) {
        this.ch1HfB = ch1HfB;
    }

    /**
     * 获取ch2HfB
     * 
     * @return ch2HfB
     */
    public Float getCh2HfB() {
        return this.ch2HfB;
    }

    /**
     * 设置ch2HfB
     * 
     * @param ch2HfB
     */
    public void setCh2HfB(Float ch2HfB) {
        this.ch2HfB = ch2HfB;
    }

    /**
     * 获取ch3HfB
     * 
     * @return ch3HfB
     */
    public Float getCh3HfB() {
        return this.ch3HfB;
    }

    /**
     * 设置ch3HfB
     * 
     * @param ch3HfB
     */
    public void setCh3HfB(Float ch3HfB) {
        this.ch3HfB = ch3HfB;
    }

    /**
     * 获取ch4HfB
     * 
     * @return ch4HfB
     */
    public Float getCh4HfB() {
        return this.ch4HfB;
    }

    /**
     * 设置ch4HfB
     * 
     * @param ch4HfB
     */
    public void setCh4HfB(Float ch4HfB) {
        this.ch4HfB = ch4HfB;
    }

    /**
     * 获取ch5HfB
     * 
     * @return ch5HfB
     */
    public Float getCh5HfB() {
        return this.ch5HfB;
    }

    /**
     * 设置ch5HfB
     * 
     * @param ch5HfB
     */
    public void setCh5HfB(Float ch5HfB) {
        this.ch5HfB = ch5HfB;
    }

    /**
     * 获取ch6HfB
     * 
     * @return ch6HfB
     */
    public Float getCh6HfB() {
        return this.ch6HfB;
    }

    /**
     * 设置ch6HfB
     * 
     * @param ch6HfB
     */
    public void setCh6HfB(Float ch6HfB) {
        this.ch6HfB = ch6HfB;
    }

    /**
     * 获取ch7HfB
     * 
     * @return ch7HfB
     */
    public Float getCh7HfB() {
        return this.ch7HfB;
    }

    /**
     * 设置ch7HfB
     * 
     * @param ch7HfB
     */
    public void setCh7HfB(Float ch7HfB) {
        this.ch7HfB = ch7HfB;
    }
}