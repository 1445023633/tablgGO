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
 * TBL_ORDER_PROTOCOL
 * 
 * @author bianj
 * @version 1.0.0 2019-02-23
 */
@Entity
@Table(name = "TBL_ORDER_PROTOCOL")
public class TblOrderProtocolEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -8278186165296210019L;

    /** protocolId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "PROTOCOL_ID", unique = true, nullable = false, length = 10)
    private Integer protocolId;

    /** dataType */
    @Column(name = "DATA_TYPE", nullable = true, length = 100)
    private String dataType;

    /** beginByte */
    @Column(name = "BEGIN_BYTE", nullable = true, length = 60)
    private String beginByte;

    /** endByte */
    @Column(name = "END_BYTE", nullable = true, length = 100)
    private String endByte;

    /** binaryValue */
    @Column(name = "BINARY_VALUE", nullable = true, length = 10)
    private Integer binaryValue;

    /** dataExplain */
    @Column(name = "DATA_EXPLAIN", nullable = true, length = 100)
    private String dataExplain;

    /** remark */
    @Column(name = "REMARK", nullable = true, length = 200)
    private String remark;

    /** neddCanculate */
    @Column(name = "NEDD_CANCULATE", nullable = true, length = 10)
    private Integer neddCanculate;

    /** canculateRule */
    @Column(name = "CANCULATE_RULE", nullable = true, length = 1000)
    private String canculateRule;

    /** channelIndicator */
    @Column(name = "CHANNEL_INDICATOR", nullable = true, length = 2000)
    private String channelIndicator;

    /** orderCatagoryId */
    @Column(name = "ORDER_CATAGORY_ID", nullable = true, length = 10)
    private Integer orderCatagoryId;

    /** canculateResultExplain */
    @Column(name = "CANCULATE_RESULT_EXPLAIN", nullable = true, length = 1000)
    private String canculateResultExplain;

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
    public String getBeginByte() {
        return this.beginByte;
    }

    /**
     * 设置beginByte
     * 
     * @param beginByte
     */
    public void setBeginByte(String beginByte) {
        this.beginByte = beginByte;
    }

    /**
     * 获取endByte
     * 
     * @return endByte
     */
    public String getEndByte() {
        return this.endByte;
    }

    /**
     * 设置endByte
     * 
     * @param endByte
     */
    public void setEndByte(String endByte) {
        this.endByte = endByte;
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
     * 获取channelIndicator
     * 
     * @return channelIndicator
     */
    public String getChannelIndicator() {
        return this.channelIndicator;
    }

    /**
     * 设置channelIndicator
     * 
     * @param channelIndicator
     */
    public void setChannelIndicator(String channelIndicator) {
        this.channelIndicator = channelIndicator;
    }

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
}