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
 * TBL_ROLE_DEFINE
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "TBL_ROLE_DEFINE")
public class TblRoleDefineEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 4140694910181288419L;

    /** roleId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "ROLE_ID", unique = true, nullable = false, length = 10)
    private Integer roleId;

    /** roleName */
    @Column(name = "ROLE_NAME", nullable = true, length = 255)
    private String roleName;

    /**
     * 获取roleId
     * 
     * @return roleId
     */
    public Integer getRoleId() {
        return this.roleId;
    }

    /**
     * 设置roleId
     * 
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取roleName
     * 
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * 设置roleName
     * 
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}