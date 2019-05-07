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
 * TBL_ORDER_CATEGORY
 * 
 * @author bianj
 * @version 1.0.0 2019-02-23
 */
public class TblOrderCategoryVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -4847941703930909641L;

    /** orderCatagoryId */
    private Integer orderCatagoryId;

    /** categoryNmae */
    private String categoryNmae;

    /** direction */
    private Integer direction;

    /**
     * 获取orderCatagoryId
     * 
     * @return orderCatagoryId
     */
    public Integer getOrderCatagoryId() {
        return this.orderCatagoryId;
    }

    /**
     * 设置orderCatagoryId
     * 
     * @param orderCatagoryId
     */
    public void setOrderCatagoryId(Integer orderCatagoryId) {
        this.orderCatagoryId = orderCatagoryId;
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