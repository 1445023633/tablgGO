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
 * TBL_POINTS
 * 
 * @author bianj
 * @version 1.0.0 2019-05-07
 */
@Entity
@Table(name = "TBL_POINTS")
public class TblPointsEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -4822795662476674128L;

    /** pointId */
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "native")
    @Column(name = "POINT_ID", unique = true, nullable = false, length = 10)
    private Integer pointId;

    /** lineId */
    @Column(name = "LINE_ID", nullable = true, length = 10)
    private Integer lineId;

    /** status */
    @Column(name = "STATUS", nullable = true, length = 200)
    private String status;

    /** image */
    @Column(name = "IMAGE", nullable = true, length = 200)
    private String image;

    /** pointAddress */
    @Column(name = "POINT_ADDRESS", nullable = true, length = 60)
    private String pointAddress;

    /** longLati */
    @Column(name = "LONG_LATI", nullable = true, length = 100)
    private String longLati;

    /** indicators */
    @Column(name = "INDICATORS", nullable = true, length = 60)
    private String indicators;

    /** pointName */
    @Column(name = "POINT_NAME", nullable = true, length = 60)
    private String pointName;

    /** phones */
    @Column(name = "PHONES", nullable = true, length = 200)
    private String phones;

    /** pointCatagoryId */
    @Column(name = "POINT_CATAGORY_ID", nullable = true, length = 10)
    private Integer pointCatagoryId;

    /** pointRegistPackage */
    @Column(name = "POINT_REGIST_PACKAGE", nullable = true, length = 255)
    private String pointRegistPackage;

    /** portName */
    @Column(name = "PORT_NAME", nullable = true, length = 255)
    private String portName;

    /** portBound */
    @Column(name = "PORT_BOUND", nullable = true, length = 10)
    private Integer portBound;

    /** smsNumber */
    @Column(name = "SMS_NUMBER", nullable = true, length = 200)
    private String smsNumber;

    /** lineOrder */
    @Column(name = "LINE_ORDER", nullable = true, length = 10)
    private Integer lineOrder;

    /** isCorner */
    @Column(name = "IS_CORNER", nullable = true, length = 10)
    private Integer isCorner;

    /** removeFlage */
    @Column(name = "REMOVE_FLAGE", nullable = true, length = 10)
    private Integer removeFlage;

    /** ip */
    @Column(name = "IP", nullable = true, length = 100)
    private String ip;

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
     * 获取lineId
     * 
     * @return lineId
     */
    public Integer getLineId() {
        return this.lineId;
    }

    /**
     * 设置lineId
     * 
     * @param lineId
     */
    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    /**
     * 获取status
     * 
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * 设置status
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取image
     * 
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * 设置image
     * 
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取pointAddress
     * 
     * @return pointAddress
     */
    public String getPointAddress() {
        return this.pointAddress;
    }

    /**
     * 设置pointAddress
     * 
     * @param pointAddress
     */
    public void setPointAddress(String pointAddress) {
        this.pointAddress = pointAddress;
    }

    /**
     * 获取longLati
     * 
     * @return longLati
     */
    public String getLongLati() {
        return this.longLati;
    }

    /**
     * 设置longLati
     * 
     * @param longLati
     */
    public void setLongLati(String longLati) {
        this.longLati = longLati;
    }

    /**
     * 获取indicators
     * 
     * @return indicators
     */
    public String getIndicators() {
        return this.indicators;
    }

    /**
     * 设置indicators
     * 
     * @param indicators
     */
    public void setIndicators(String indicators) {
        this.indicators = indicators;
    }

    /**
     * 获取pointName
     * 
     * @return pointName
     */
    public String getPointName() {
        return this.pointName;
    }

    /**
     * 设置pointName
     * 
     * @param pointName
     */
    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    /**
     * 获取phones
     * 
     * @return phones
     */
    public String getPhones() {
        return this.phones;
    }

    /**
     * 设置phones
     * 
     * @param phones
     */
    public void setPhones(String phones) {
        this.phones = phones;
    }

    /**
     * 获取pointCatagoryId
     * 
     * @return pointCatagoryId
     */
    public Integer getPointCatagoryId() {
        return this.pointCatagoryId;
    }

    /**
     * 设置pointCatagoryId
     * 
     * @param pointCatagoryId
     */
    public void setPointCatagoryId(Integer pointCatagoryId) {
        this.pointCatagoryId = pointCatagoryId;
    }

    /**
     * 获取pointRegistPackage
     * 
     * @return pointRegistPackage
     */
    public String getPointRegistPackage() {
        return this.pointRegistPackage;
    }

    /**
     * 设置pointRegistPackage
     * 
     * @param pointRegistPackage
     */
    public void setPointRegistPackage(String pointRegistPackage) {
        this.pointRegistPackage = pointRegistPackage;
    }

    /**
     * 获取portName
     * 
     * @return portName
     */
    public String getPortName() {
        return this.portName;
    }

    /**
     * 设置portName
     * 
     * @param portName
     */
    public void setPortName(String portName) {
        this.portName = portName;
    }

    /**
     * 获取portBound
     * 
     * @return portBound
     */
    public Integer getPortBound() {
        return this.portBound;
    }

    /**
     * 设置portBound
     * 
     * @param portBound
     */
    public void setPortBound(Integer portBound) {
        this.portBound = portBound;
    }

    /**
     * 获取smsNumber
     * 
     * @return smsNumber
     */
    public String getSmsNumber() {
        return this.smsNumber;
    }

    /**
     * 设置smsNumber
     * 
     * @param smsNumber
     */
    public void setSmsNumber(String smsNumber) {
        this.smsNumber = smsNumber;
    }

    /**
     * 获取lineOrder
     * 
     * @return lineOrder
     */
    public Integer getLineOrder() {
        return this.lineOrder;
    }

    /**
     * 设置lineOrder
     * 
     * @param lineOrder
     */
    public void setLineOrder(Integer lineOrder) {
        this.lineOrder = lineOrder;
    }

    /**
     * 获取isCorner
     * 
     * @return isCorner
     */
    public Integer getIsCorner() {
        return this.isCorner;
    }

    /**
     * 设置isCorner
     * 
     * @param isCorner
     */
    public void setIsCorner(Integer isCorner) {
        this.isCorner = isCorner;
    }

    /**
     * 获取removeFlage
     * 
     * @return removeFlage
     */
    public Integer getRemoveFlage() {
        return this.removeFlage;
    }

    /**
     * 设置removeFlage
     * 
     * @param removeFlage
     */
    public void setRemoveFlage(Integer removeFlage) {
        this.removeFlage = removeFlage;
    }

    /**
     * 获取ip
     * 
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * 设置ip
     * 
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }
}