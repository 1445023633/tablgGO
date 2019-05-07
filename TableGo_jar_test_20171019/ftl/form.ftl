<#-- 生成EasyUI的新增修改的Form表单 -->
<#assign flag = false>
<#if tableInfo.pagingFieldInfos?? && tableInfo.pagingFieldInfos?size gt 0>
<form id="addOrModifyWindowForm" method="post" class="easyui-form" data-options="novalidate:true">
    <#list tableInfo.pagingFieldInfos as pagingList>
        <#list pagingList as fieldInfo>
            <#if fieldInfo.isDictType>
    ${fieldInfo.returnRemark}：<select id="${fieldInfo.proName}" name="${fieldInfo.proName}" style="width:153px"></select><#if fieldInfo_has_next>　<#else><br/><br/></#if>
    <#assign flag = true>
            <#elseif fieldInfo.javaType=="Date">
    ${fieldInfo.returnRemark}：<input id="${fieldInfo.proName}" name="${fieldInfo.proName}" class="easyui-datebox" data-options="editable:false" style="width:153px"/><#if fieldInfo_has_next>　<#else><br/><br/></#if>
            <#elseif fieldInfo.javaType=="Integer">
    ${fieldInfo.returnRemark}：<input id="${fieldInfo.proName}" name="${fieldInfo.proName}" class="easyui-numberbox" data-options="min:0" style="width:153px"/><#if fieldInfo_has_next>　<#else><br/><br/></#if>
            <#elseif fieldInfo.javaType=="BigDecimal">
    ${fieldInfo.returnRemark}：<input id="${fieldInfo.proName}" name="${fieldInfo.proName}" class="easyui-numberbox" data-options="min:0,precision:2" style="width:153px"/><#if fieldInfo_has_next>　<#else><br/><br/></#if>
            <#else>
    ${fieldInfo.returnRemark}：<input id="${fieldInfo.proName}" name="${fieldInfo.proName}" class="easyui-textbox" data-options="validType:'length[1,${fieldInfo.columnSize}]'" style="width:153px"/><#if fieldInfo_has_next>　<#else><br/><br/></#if>
            </#if>
        </#list>
    </#list>
    
    <input type="hidden" name="id" />
</form>
</#if>
<#if flag>

<script type="text/javascript">
<#if tableInfo.fieldInfos?? && tableInfo.fieldInfos?size gt 0>
    function initCombobox(){
    <#list tableInfo.fieldInfos as fieldInfo>
        <#if fieldInfo.isDictType>
        var ${fieldInfo.proName} = getComboboxDictData("${fieldInfo.proName}");
        $("#${fieldInfo.proName}").combobox({
            data: ${fieldInfo.proName},
            panelHeight:"auto",
            editable:false,
            required:false
        });
        
        </#if>
    </#list>
    }
</#if>
</script>
</#if>