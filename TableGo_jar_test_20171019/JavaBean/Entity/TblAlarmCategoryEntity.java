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
 * TBL_ALARM_CATEGORY
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "TBL_ALARM_CATEGORY")
public class TblAlarmCategoryEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 1620564751301175327L;

    /** alarmCategoryId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "ALARM_CATEGORY_ID", unique = true, nullable = false, length = 10)
    private Integer alarmCategoryId;

    /** name */
    @Column(name = "NAME", nullable = true, length = 255)
    private String name;

    /**
     * 获取alarmCategoryId
     * 
     * @return alarmCategoryId
     */
    public Integer getAlarmCategoryId() {
        return this.alarmCategoryId;
    }

    /**
     * 设置alarmCategoryId
     * 
     * @param alarmCategoryId
     */
    public void setAlarmCategoryId(Integer alarmCategoryId) {
        this.alarmCategoryId = alarmCategoryId;
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
}