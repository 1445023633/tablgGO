<#-- 生成EasyUI的DataGrid -->
<#if tableInfo.fieldInfos?? && tableInfo.fieldInfos?size gt 0>
var ${tableInfo.firstLowerCase}Grid = $("#${tableInfo.firstLowerCase}Grid").datagrid({
    fit:true,
    rownumbers:true,
    singleSelect:false,
    method:"post",
    pagination:true,
    pageSize:pageSize,
    pageList:pageList,
    toolbar:"#${tableInfo.firstLowerCase}Toolbar",
    url:${tableInfo.firstLowerCase}GridUrl,
    columns:[[
    <#list tableInfo.fieldInfos as fieldInfo>
        <#if fieldInfo.primaryKey>
        {field:'${fieldInfo.proName}',checkbox:true},
        <#elseif fieldInfo.isDictType>
        {field:'${fieldInfo.proName}',title:'${fieldInfo.returnRemark}',width:100,align:'center',formatter:get${fieldInfo.firstUpperCase}Name},
        <#else>
        {field:'${fieldInfo.proName}',title:'${fieldInfo.returnRemark}',width:100},
        </#if>
    </#list>
   ]]
});
</#if>
