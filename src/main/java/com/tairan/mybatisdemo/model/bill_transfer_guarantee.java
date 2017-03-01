package com.tairan.mybatisdemo.model;

import java.math.BigDecimal;
import java.util.Date;

public class bill_transfer_guarantee {
    private String id;

    private String billnumber;

    private String channelid;

    private String channelaccount;

    private String transfertype;

    private String fromuserid;

    private String fromaccountid;

    private String touserid;

    private String toaccountid;

    private String tothirduserid;

    private String tothirdaccountid;

    private String businessnumber;

    private String batchid;

    private String businessbody;

    private String appid;

    private Date businessdate;

    private String businessdesc;

    private BigDecimal amount;

    private String sign;

    private Date invaliddate;

    private Date createdate;

    private Date updatedate;

    private String description;

    private Byte version;

    private String isecardpay;

    private String ecardaccountid;

    private String callbackurl;

    private String virtualgoods;

    private Boolean isdeleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBillnumber() {
        return billnumber;
    }

    public void setBillnumber(String billnumber) {
        this.billnumber = billnumber == null ? null : billnumber.trim();
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getChannelaccount() {
        return channelaccount;
    }

    public void setChannelaccount(String channelaccount) {
        this.channelaccount = channelaccount == null ? null : channelaccount.trim();
    }

    public String getTransfertype() {
        return transfertype;
    }

    public void setTransfertype(String transfertype) {
        this.transfertype = transfertype == null ? null : transfertype.trim();
    }

    public String getFromuserid() {
        return fromuserid;
    }

    public void setFromuserid(String fromuserid) {
        this.fromuserid = fromuserid == null ? null : fromuserid.trim();
    }

    public String getFromaccountid() {
        return fromaccountid;
    }

    public void setFromaccountid(String fromaccountid) {
        this.fromaccountid = fromaccountid == null ? null : fromaccountid.trim();
    }

    public String getTouserid() {
        return touserid;
    }

    public void setTouserid(String touserid) {
        this.touserid = touserid == null ? null : touserid.trim();
    }

    public String getToaccountid() {
        return toaccountid;
    }

    public void setToaccountid(String toaccountid) {
        this.toaccountid = toaccountid == null ? null : toaccountid.trim();
    }

    public String getTothirduserid() {
        return tothirduserid;
    }

    public void setTothirduserid(String tothirduserid) {
        this.tothirduserid = tothirduserid == null ? null : tothirduserid.trim();
    }

    public String getTothirdaccountid() {
        return tothirdaccountid;
    }

    public void setTothirdaccountid(String tothirdaccountid) {
        this.tothirdaccountid = tothirdaccountid == null ? null : tothirdaccountid.trim();
    }

    public String getBusinessnumber() {
        return businessnumber;
    }

    public void setBusinessnumber(String businessnumber) {
        this.businessnumber = businessnumber == null ? null : businessnumber.trim();
    }

    public String getBatchid() {
        return batchid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid == null ? null : batchid.trim();
    }

    public String getBusinessbody() {
        return businessbody;
    }

    public void setBusinessbody(String businessbody) {
        this.businessbody = businessbody == null ? null : businessbody.trim();
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public Date getBusinessdate() {
        return businessdate;
    }

    public void setBusinessdate(Date businessdate) {
        this.businessdate = businessdate;
    }

    public String getBusinessdesc() {
        return businessdesc;
    }

    public void setBusinessdesc(String businessdesc) {
        this.businessdesc = businessdesc == null ? null : businessdesc.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public Date getInvaliddate() {
        return invaliddate;
    }

    public void setInvaliddate(Date invaliddate) {
        this.invaliddate = invaliddate;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Byte getVersion() {
        return version;
    }

    public void setVersion(Byte version) {
        this.version = version;
    }

    public String getIsecardpay() {
        return isecardpay;
    }

    public void setIsecardpay(String isecardpay) {
        this.isecardpay = isecardpay == null ? null : isecardpay.trim();
    }

    public String getEcardaccountid() {
        return ecardaccountid;
    }

    public void setEcardaccountid(String ecardaccountid) {
        this.ecardaccountid = ecardaccountid == null ? null : ecardaccountid.trim();
    }

    public String getCallbackurl() {
        return callbackurl;
    }

    public void setCallbackurl(String callbackurl) {
        this.callbackurl = callbackurl == null ? null : callbackurl.trim();
    }

    public String getVirtualgoods() {
        return virtualgoods;
    }

    public void setVirtualgoods(String virtualgoods) {
        this.virtualgoods = virtualgoods == null ? null : virtualgoods.trim();
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }
}