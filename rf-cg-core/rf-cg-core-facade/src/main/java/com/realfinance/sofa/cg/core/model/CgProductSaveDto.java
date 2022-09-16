package com.realfinance.sofa.cg.core.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CgProductSaveDto {

    private Integer id;

    /**
     * 产品编码
     */
    private String productEncoded;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品描述
     */
    private  String productDescribe;


    /**
     * 采购目录ID
     */
    private Integer purchaseCatalog;

    /**
     * 规格型号
     */
    private  String model;

    private  String  calculateUnit;
    /**
     * 产品代码
     */
    private  String productCode;

    /**
     * 英文名
     */
    private  String englishName;


    /**
     * 采购方案ID
     */
    private  Integer project;



    /**
     * 是否中标
     */
    private  Boolean  isBid;


    /**
     * 入库时间
     */
    private LocalDateTime enterRepositoryTime;


    /**
     * 供应商ID
     */
    private  Integer supplier;


    /**
     * 价格
     */
    private BigDecimal price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductEncoded() {
        return productEncoded;
    }

    public void setProductEncoded(String productEncoded) {
        this.productEncoded = productEncoded;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescribe() {
        return productDescribe;
    }

    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public Boolean getBid() {
        return isBid;
    }

    public void setBid(Boolean bid) {
        isBid = bid;
    }

    public LocalDateTime getEnterRepositoryTime() {
        return enterRepositoryTime;
    }

    public void setEnterRepositoryTime(LocalDateTime enterRepositoryTime) {
        this.enterRepositoryTime = enterRepositoryTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public String getCalculateUnit() {
        return calculateUnit;
    }

    public void setCalculateUnit(String calculateUnit) {
        this.calculateUnit = calculateUnit;
    }

    public Integer getPurchaseCatalog() {
        return purchaseCatalog;
    }

    public void setPurchaseCatalog(Integer purchaseCatalog) {
        this.purchaseCatalog = purchaseCatalog;
    }

    public Integer getProject() {
        return project;
    }

    public void setProject(Integer project) {
        this.project = project;
    }

    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }
}
