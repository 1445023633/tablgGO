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
 * TBL_COMMAND_CATEGORY
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "TBL_COMMAND_CATEGORY")
public class TblCommandCategoryEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7308226632057773282L;

    /** commandCatagoryId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "COMMAND_CATAGORY_ID", unique = true, nullable = false, length = 10)
    private Integer commandCatagoryId;

    /** categoryNmae */
    @Column(name = "CATEGORY_NMAE", nullable = true, length = 100)
    private String categoryNmae;

    /** direction */
    @Column(name = "DIRECTION", nullable = true, length = 10)
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