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

/**
 * NOISE_DETAILS
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class NoiseDetailsVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3190387462839580125L;

    /** id */
    private Integer id;

    /** devicesettingsId */
    private Integer devicesettingsId;

    /** noiseLevel */
    private Integer noiseLevel;

    /** ch1Difference */
    private Integer ch1Difference;

    /** ch2Difference */
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