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
 * NOISE_DETAILS
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "NOISE_DETAILS")
public class NoiseDetailsEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3190387462839580125L;

    /** id */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "ID", unique = true, nullable = false, length = 10)
    private Integer id;

    /** devicesettingsId */
    @Column(name = "DEVICESETTINGS_ID", nullable = true, length = 10)
    private Integer devicesettingsId;

    /** noiseLevel */
    @Column(name = "NOISE_LEVEL", nullable = true, length = 10)
    private Integer noiseLevel;

    /** ch1Difference */
    @Column(name = "CH1_DIFFERENCE", nullable = true, length = 10)
    private Integer ch1Difference;

    /** ch2Difference */
    @Column(name = "CH2_DIFFERENCE", nullable = true, length = 10)
    private Integer ch2Difference;

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
     * 获取noiseLevel
     * 
     * @return noiseLevel
     */
    public Integer getNoiseLevel() {
        return this.noiseLevel;
    }

    /**
     * 设置noiseLevel
     * 
     * @param noiseLevel
     */
    public void setNoiseLevel(Integer noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    /**
     * 获取ch1Difference
     * 
     * @return ch1Difference
     */
    public Integer getCh1Difference() {
        return this.ch1Difference;
    }

    /**
     * 设置ch1Difference
     * 
     * @param ch1Difference
     */
    public void setCh1Difference(Integer ch1Difference) {
        this.ch1Difference = ch1Difference;
    }

    /**
     * 获取ch2Difference
     * 
     * @return ch2Difference
     */
    public Integer getCh2Difference() {
        return this.ch2Difference;
    }

    /**
     * 设置ch2Difference
     * 
     * @param ch2Difference
     */
    public void setCh2Difference(Integer ch2Difference) {
        this.ch2Difference = ch2Difference;
    }
}