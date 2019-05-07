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
 * TBL_COMMAND_PROTOCOL
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
public class TblCommandProtocolVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 5451954490165928494L;

    /** protocolId */
    private Integer protocolId;

    /** dataType */
    private String dataType;

    /** beginByte */
    private Integer beginByte;

    /** dataByte */
    private Integer dataByte;

    /** binaryValue */
    private Integer binaryValue;

    /** dataExplain */
    private String dataExplain;

    /** remark */
    private String remark;

    /** neddCanculate */
    private Integer neddCanculate;

    /** canculateRule */
    private String canculateRule;

    /** commandCatagoryId */
    private Integer commandCatagoryId;

    /** canculateResultExplain */
    private String canculateResultExplain;

    /** indicatorId */
    private Integer indicatorId;

    /** pointId */
    private Integer pointId;

    /** addressCode */
    private String addressCode;

    /** notNegative */
    private Integer notNegative;

    /**
     * 获取protocolId
     * 
     * @return protocolId
     */
    public Integer getProtocolId() {
        return this.protocolId;
    }

    /**
     * 设置protocolId
     * 
     * @param protocolId
     */
    public void setProtocolId(Integer protocolId) {
        this.protocolId = protocolId;
    }

    /**
     * 获取dataType
     * 
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * 设置dataType
     * 
     * @param dataType
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * 获取beginByte
     * 
     * @return beginByte
     */
    public Integer getBeginByte() {
        return this.beginByte;
    }

    /**
     * 设置beginByte
     * 
     * @param beginByte
     */
    public void setBeginByte(Integer beginByte) {
        this.beginByte = beginByte;
    }

    /**
     * 获取dataByte
     * 
     * @return dataByte
     */
    public Integer getDataByte() {
        return this.dataByte;
    }

    /**
     * 设置dataByte
     * 
     * @param dataByte
     */
    public void setDataByte(Integer dataByte) {
        this.dataByte = dataByte;
    }

    /**
     * 获取binaryValue
     * 
     * @return binaryValue
     */
    public Integer getBinaryValue() {
        return this.binaryValue;
    }

    /**
     * 设置binaryValue
     * 
     * @param binaryValue
     */
    public void setBinaryValue(Integer binaryValue) {
        this.binaryValue = binaryValue;
    }

    /**
     * 获取dataExplain
     * 
     * @return dataExplain
     */
    public String getDataExplain() {
        return this.dataExplain;
    }

    /**
     * 设置dataExplain
     * 
     * @param dataExplain
     */
    public void setDataExplain(String dataExplain) {
        this.dataExplain = dataExplain;
    }

    /**
     * 获取remark
     * 
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * 设置remark
     * 
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取neddCanculate
     * 
     * @return neddCanculate
     */
    public Integer getNeddCanculate() {
        return this.neddCanculate;
    }

    /**
     * 设置neddCanculate
     * 
     * @param neddCanculate
     */
    public void setNeddCanculate(Integer neddCanculate) {
        this.neddCanculate = neddCanculate;
    }

    /**
     * 获取canculateRule
     * 
     * @return canculateRule
     */
    public String getCanculateRule() {
        return this.canculateRule;
    }

    /**
     * 设置canculateRule
     * 
     * @param canculateRule
     */
    public void setCanculateRule(String canculateRule) {
        this.canculateRule = canculateRule;
    }

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
     * 获取canculateResultExplain
     * 
     * @return canculateResultExplain
     */
    public String getCanculateResultExplain() {
        return this.canculateResultExplain;
    }

    /**
     * 设置canculateResultExplain
     * 
     * @param canculateResultExplain
     */
    public void setCanculateResultExplain(String canculateResultExplain) {
        this.canculateResultExplain = canculateResultExplain;
    }

    /**
     * 获取indicatorId
     * 
     * @return indicatorId
     */
    public Integer getIndicatorId() {
        return this.indicatorId;
    }

    /**
     * 设置indicatorId
     * 
     * @param indicatorId
     */
    public void setIndicatorId(Integer indicatorId) {
        this.indicatorId = indicatorId;
    }

    /**
     * 获取pointId
     * 
     * @return pointId
     */
    public Integer getPointId() {
        return this.pointId;
    }

    /**
     * 设置pointId
     * 
     * @param pointId
     */
    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }

    /**
     * 获取addressCode
     * 
     * @return addressCode
     */
    public String getAddressCode() {
        return this.addressCode;
    }

    /**
     * 设置addressCode
     * 
     * @param addressCode
     */
    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    /**
     * 获取notNegative
     * 
     * @return notNegative
     */
    public Integer getNotNegative() {
        return this.notNegative;
    }

    /**
     * 设置notNegative
     * 
     * @param notNegative
     */
    public void setNotNegative(Integer notNegative) {
        this.notNegative = notNegative;
    }
}