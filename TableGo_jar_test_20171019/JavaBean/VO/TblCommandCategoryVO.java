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
 * TBL_COMMAND_CATEGORY
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class TblCommandCategoryVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7308226632057773282L;

    /** commandCatagoryId */
    private Integer commandCatagoryId;

    /** categoryNmae */
    private String categoryNmae;

    /** direction */
    private Integer direction;

    /**
     * 获取commandCatagoryId
     * 
     * @return commandCatagoryId
     */
    public Integer getCommandCatagoryId() {
        return this.commandCatagoryId;
    }

    /**
     * 设置commandCatagoryId
     * 
     * @param commandCatagoryId
     */
    public void setCommandCatagoryId(Integer commandCatagoryId) {
        this.commandCatagoryId = commandCatagoryId;
    }

    /**
     * 获取categoryNmae
     * 
     * @return categoryNmae
     */
    public String getCategoryNmae() {
        return this.categoryNmae;
    }

    /**
     * 设置categoryNmae
     * 
     * @param categoryNmae
     */
    public void setCategoryNmae(String categoryNmae) {
        this.categoryNmae = categoryNmae;
    }

    /**
     * 获取direction
     * 
     * @return direction
     */
    public Integer getDirection() {
        return this.direction;
    }

    /**
     * 设置direction
     * 
     * @param direction
     */
    public void setDirection(Integer direction) {
        this.direction = direction;
    }
}