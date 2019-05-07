<#-- 生成Controller -->
package ${moduleName}.controller;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import common.bean.Paging;
import common.bean.ResultJsonWrap;
import common.controller.BaseController;

import ${moduleName}.entity.${tableInfo.firstUpperCase}Entity;
import ${moduleName}.service.${tableInfo.firstUpperCase}Service;

/**
 * ${tableInfo.remark}管理模块Controller
 * 
 * @author bianj
 * @version 1.0.0 ${today}
 */
@Lazy
@RestController
@RequestMapping(value = "/${moduleName}/${tableInfo.firstLowerCase}/*")
public class ${tableInfo.firstUpperCase}Controller extends BaseController {
	private Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	private ${tableInfo.firstUpperCase}Service ${tableInfo.firstLowerCase}Service;
	
    /**
     * 根据参数查询${tableInfo.remark}列表和分页数据
     * 
     * @param ${tableInfo.firstLowerCase}
     *            查询参数
     * @param paging
     *            分页参数
     * @param rows
     *            EasyUI的分页组件传过来的PageSize
     * @return 分页数据
     */
	@RequestMapping(value = "/${tableInfo.firstLowerCase}List")
	public Paging ${tableInfo.firstLowerCase}List(${tableInfo.firstUpperCase}Entity ${tableInfo.firstLowerCase}, Paging paging, Integer rows) {
		paging.setPageSize(rows);
		paging.clearRows();

		try {
			paging = ${tableInfo.firstLowerCase}Service.find${tableInfo.firstUpperCase}ByCondition(${tableInfo.firstLowerCase}, paging);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}

		return paging;
	}
	    
    /**
     * 新增${tableInfo.remark}
     * 
     * @param ${tableInfo.firstLowerCase}
     *            ${tableInfo.remark}信息
     * @return 结果数据
     */
    @RequestMapping(value = "/add${tableInfo.firstUpperCase}")
    public ResultJsonWrap add${tableInfo.firstUpperCase}(${tableInfo.firstUpperCase}Entity ${tableInfo.firstLowerCase}) {
        ResultJsonWrap result = new ResultJsonWrap();

        try {
            ${tableInfo.firstLowerCase}Service.add${tableInfo.firstUpperCase}(${tableInfo.firstLowerCase});
            
            result.setMsg("新增${tableInfo.remark}成功！");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            result.setErrorMsg("新增${tableInfo.remark}失败！");
        }

        return result;
    }

    /**
     * 修改${tableInfo.remark}
     * 
     * @param ${tableInfo.firstLowerCase}
     *            ${tableInfo.remark}信息
     * @return 结果数据
     */
    @RequestMapping(value = "/modify${tableInfo.firstUpperCase}")
    public ResultJsonWrap modify${tableInfo.firstUpperCase}(${tableInfo.firstUpperCase}Entity ${tableInfo.firstLowerCase}) {
        ResultJsonWrap result = new ResultJsonWrap();
        
        String id = ${tableInfo.firstLowerCase}.getId();
        if (StringUtils.isBlank(id)) {
            result.setErrorMsg("请选择需要修改的数据！");
            return result;
        }

        try {
            ${tableInfo.firstLowerCase}Service.modify${tableInfo.firstUpperCase}(${tableInfo.firstLowerCase});
            
            result.setMsg("修改${tableInfo.remark}成功");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            result.setErrorMsg("修改${tableInfo.remark}失败！");
        }

        return result;
    }

    /**
     * 批量删除${tableInfo.remark}
     * 
     * @param idList
     *            ID列表
     * @return 结果数据
     */
    @RequestMapping(value = "/delete${tableInfo.firstUpperCase}")
    public ResultJsonWrap delete${tableInfo.firstUpperCase}(@RequestBody List<String> idList) {
        ResultJsonWrap result = new ResultJsonWrap();

        if (CollectionUtils.isEmpty(idList)) {
            result.setErrorMsg("请选择需要删除的数据！");
            return result;
        }

        try {
            ${tableInfo.firstLowerCase}Service.delete${tableInfo.firstUpperCase}ByIds(idList);
            
            result.setMsg("删除${tableInfo.remark}成功！");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            result.setErrorMsg("删除${tableInfo.remark}失败！");
        }

        return result;
    }

}