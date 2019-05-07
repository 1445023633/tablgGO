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
 * TBL_INDICATOR_VALUE
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class TblIndicatorValueVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -5932527337817648382L;

    /** indicatorId */
    private Integer indicatorId;

    /** name */
    private String name;

    /** indicatorCode */
    private String indicatorCode;

    /** categoryId */
    private Integer categoryId;

    /**
     * 获取indicatorId
     * 
     * @return indicatorId
     */
    public Integer getIndicatorId() {
        return this.indicatorId;
    }

    /**
     * 设置indicatorId
     * 
     * @param indicatorId
     */
    public void setIndicatorId(Integer indicatorId) {
        this.indicatorId = indicatorId;
    }

    /**
     * 获取name
     * 
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置name
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取indicatorCode
     * 
     * @return indicatorCode
     */
    public String getIndicatorCode() {
        return this.indicatorCode;
    }

    /**
     * 设置indicatorCode
     * 
     * @param indicatorCode
     */
    public void setIndicatorCode(String indicatorCode) {
        this.indicatorCode = indicatorCode;
    }

    /**
     * 获取categoryId
     * 
     * @return categoryId
     */
    public Integer getCategoryId() {
        return this.categoryId;
    }

    /**
     * 设置categoryId
     * 
     * @param categoryId
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}