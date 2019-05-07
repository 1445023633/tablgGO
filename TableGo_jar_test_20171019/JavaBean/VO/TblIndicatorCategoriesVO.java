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
 * TBL_INDICATOR_CATEGORIES
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class TblIndicatorCategoriesVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -4240242399843346907L;

    /** categoryId */
    private Integer categoryId;

    /** name */
    private String name;

    /** categoryCode */
    private String categoryCode;

    /** parent */
    private Integer parent;

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
     * 获取categoryCode
     * 
     * @return categoryCode
     */
    public String getCategoryCode() {
        return this.categoryCode;
    }

    /**
     * 设置categoryCode
     * 
     * @param categoryCode
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
     * 获取parent
     * 
     * @return parent
     */
    public Integer getParent() {
        return this.parent;
    }

    /**
     * 设置parent
     * 
     * @param parent
     */
    public void setParent(Integer parent) {
        this.parent = parent;
    }
}