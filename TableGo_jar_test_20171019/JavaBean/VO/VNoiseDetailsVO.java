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
 * V_NOISE_DETAILS
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class VNoiseDetailsVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3555100706505770737L;

    /** deviceId */
    private Integer deviceId;

    /** noiseLevel */
    private Integer noiseLevel;

    /** ch1Difference */
    private Integer ch1Difference;

    /** ch2Difference */
    private Integer ch2Difference;

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