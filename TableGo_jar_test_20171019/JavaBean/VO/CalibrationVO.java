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
 * CALIBRATION
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class CalibrationVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 8644223452941978066L;

    /** id */
    private Integer id;

    /** normalvalue */
    private Float normalvalue;

    /** actualvalue */
    private Float actualvalue;

    /** coefficient */
    private Float coefficient;

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
     * 获取normalvalue
     * 
     * @return normalvalue
     */
    public Float getNormalvalue() {
        return this.normalvalue;
    }

    /**
     * 设置normalvalue
     * 
     * @param normalvalue
     */
    public void setNormalvalue(Float normalvalue) {
        this.normalvalue = normalvalue;
    }

    /**
     * 获取actualvalue
     * 
     * @return actualvalue
     */
    public Float getActualvalue() {
        return this.actualvalue;
    }

    /**
     * 设置actualvalue
     * 
     * @param actualvalue
     */
    public void setActualvalue(Float actualvalue) {
        this.actualvalue = actualvalue;
    }

    /**
     * 获取coefficient
     * 
     * @return coefficient
     */
    public Float getCoefficient() {
        return this.coefficient;
    }

    /**
     * 设置coefficient
     * 
     * @param coefficient
     */
    public void setCoefficient(Float coefficient) {
        this.coefficient = coefficient;
    }
}