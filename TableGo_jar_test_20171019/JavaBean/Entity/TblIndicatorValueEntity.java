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
 * TBL_INDICATOR_VALUE
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "TBL_INDICATOR_VALUE")
public class TblIndicatorValueEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -5932527337817648382L;

    /** indicatorId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "INDICATOR_ID", unique = true, nullable = false, length = 10)
    private Integer indicatorId;

    /** name */
    @Column(name = "NAME", nullable = true, length = 60)
    private String name;

    /** indicatorCode */
    @Column(name = "INDICATOR_CODE", nullable = true, length = 60)
    private String indicatorCode;

    /** categoryId */
    @Column(name = "CATEGORY_ID", nullable = true, length = 10)
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