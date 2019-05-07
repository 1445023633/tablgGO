<#-- 生成Service -->
package ${moduleName}.service;

import java.util.List;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import common.bean.Paging;
import common.dao.BaseDAO;

import ${moduleName}.entity.${tableInfo.firstUpperCase}Entity;

/**
 * ${tableInfo.remark}管理模块Service接口实现
 * 
 * @author bianj
 * @version 1.0.0 ${today}
 */
@Lazy
@Service
public class ${tableInfo.firstUpperCase}Service extends BaseDAO {
    /** SQL的命名空间 */
    private static final String SQL_NS = "${moduleName}.${tableInfo.firstLowerCase}.";

    /**
     * 根据分页条件查询${tableInfo.remark}数据并分页
     * 
     * @param ${tableInfo.firstLowerCase}
     *            查询参数
     * @param paging
     *            分页参数
     * @return 分页数据
     */
    public Paging find${tableInfo.firstUpperCase}ByCondition(${tableInfo.firstUpperCase}Entity ${tableInfo.firstLowerCase}, Paging paging) {
        paging.setStringParams(${tableInfo.firstLowerCase});

        paging = baseMyBatisDAO.findForPageHelper(SQL_NS + "find${tableInfo.firstUpperCase}ByCondition", paging);

        return paging;
    }
    
    /**
     * 根据ID查询${tableInfo.remark}
     * 
     * @param id
     *            ID主键
     * @return ${tableInfo.firstLowerCase}Entity
     */
    public ${tableInfo.firstUpperCase}Entity find${tableInfo.firstUpperCase}ById(String id){
        return baseJpaDAO.findById(${tableInfo.firstUpperCase}Entity.class, id);
    }

    /**
     * 新增${tableInfo.remark}
     * 
     * @param ${tableInfo.firstLowerCase}
     *            ${tableInfo.remark}
     */
    public void add${tableInfo.firstUpperCase}(${tableInfo.firstUpperCase}Entity ${tableInfo.firstLowerCase}) {
        ${tableInfo.firstLowerCase}.setId(null);
        baseJpaDAO.persist(${tableInfo.firstLowerCase});
    }

    /**
     * 修改${tableInfo.remark}
     * 
     * @param ${tableInfo.firstLowerCase}
     *            ${tableInfo.remark}
     */
    public void modify${tableInfo.firstUpperCase}(${tableInfo.firstUpperCase}Entity ${tableInfo.firstLowerCase}) {
        baseJpaDAO.merge(${tableInfo.firstLowerCase});
    }

    /**
     * 批量删除${tableInfo.remark}
     * 
     * @param idList
     *            ID列表
     */
    public void delete${tableInfo.firstUpperCase}ByIds(List<String> idList) {
        baseMyBatisDAO.delete(SQL_NS + "delete${tableInfo.firstUpperCase}ByIds", idList);
    }

}

