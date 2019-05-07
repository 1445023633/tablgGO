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
 * TBL_FUN_INFO
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "TBL_FUN_INFO")
public class TblFunInfoEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -2352942875335481904L;

    /** funcId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "FUNC_ID", unique = true, nullable = false, length = 10)
    private Integer funcId;

    /** address */
    @Column(name = "ADDRESS", nullable = false, length = 200)
    private String address;

    /** funcName */
    @Column(name = "FUNC_NAME", nullable = false, length = 60)
    private String funcName;

    /** lineIds */
    @Column(name = "LINE_IDS", nullable = true, length = 100)
    private String lineIds;

    /** company */
    @Column(name = "COMPANY", nullable = true, length = 200)
    private String company;

    /** point */
    @Column(name = "POINT", nullable = true, length = 60)
    private String point;

    /**
     * 获取funcId
     * 
     * @return funcId
     */
    public Integer getFuncId() {
        return this.funcId;
    }

    /**
     * 设置funcId
     * 
     * @param funcId
     */
    public void setFuncId(Integer funcId) {
        this.funcId = funcId;
    }

    /**
     * 获取address
     * 
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * 设置address
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取funcName
     * 
     * @return funcName
     */
    public String getFuncName() {
        return this.funcName;
    }

    /**
     * 设置funcName
     * 
     * @param funcName
     */
    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    /**
     * 获取lineIds
     * 
     * @return lineIds
     */
    public String getLineIds() {
        return this.lineIds;
    }

    /**
     * 设置lineIds
     * 
     * @param lineIds
     */
    public void setLineIds(String lineIds) {
        this.lineIds = lineIds;
    }

    /**
     * 获取company
     * 
     * @return company
     */
    public String getCompany() {
        return this.company;
    }

    /**
     * 设置company
     * 
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取point
     * 
     * @return point
     */
    public String getPoint() {
        return this.point;
    }

    /**
     * 设置point
     * 
     * @param point
     */
    public void setPoint(String point) {
        this.point = point;
    }
}