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
 * TBL_POINT_CATEGORY
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class TblPointCategoryVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -8338969534374344445L;

    /** pointCatgoryId */
    private Integer pointCatgoryId;

    /** pontCatagoryName */
    private String pontCatagoryName;

    /**
     * 获取pointCatgoryId
     * 
     * @return pointCatgoryId
     */
    public Integer getPointCatgoryId() {
        return this.pointCatgoryId;
    }

    /**
     * 设置pointCatgoryId
     * 
     * @param pointCatgoryId
     */
    public void setPointCatgoryId(Integer pointCatgoryId) {
        this.pointCatgoryId = pointCatgoryId;
    }

    /**
     * 获取pontCatagoryName
     * 
     * @return pontCatagoryName
     */
    public String getPontCatagoryName() {
        return this.pontCatagoryName;
    }

    /**
     * 设置pontCatagoryName
     * 
     * @param pontCatagoryName
     */
    public void setPontCatagoryName(String pontCatagoryName) {
        this.pontCatagoryName = pontCatagoryName;
    }
}