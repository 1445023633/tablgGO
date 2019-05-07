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
 * TBL_INDICATOR_CATEGORIES
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "TBL_INDICATOR_CATEGORIES")
public class TblIndicatorCategoriesEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -4240242399843346907L;

    /** categoryId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "CATEGORY_ID", unique = true, nullable = false, length = 10)
    private Integer categoryId;

    /** name */
    @Column(name = "NAME", nullable = true, length = 60)
    private String name;

    /** categoryCode */
    @Column(name = "CATEGORY_CODE", nullable = true, length = 60)
    private String categoryCode;

    /** parent */
    @Column(name = "PARENT", nullable = true, length = 10)
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