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
 * TBL_ALARM_CATEGORY
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class TblAlarmCategoryVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 1620564751301175327L;

    /** alarmCategoryId */
    private Integer alarmCategoryId;

    /** name */
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