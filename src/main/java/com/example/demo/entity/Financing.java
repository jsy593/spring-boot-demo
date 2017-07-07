package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Financing {
    private BigDecimal pkid;

    private String financingCode;

    private BigDecimal financingApplyId;

    private String financingApplyCode;

    private BigDecimal financingCompanyId;

    private String financingCompanyName;

    private String shroffAccountNo;

    private BigDecimal investorId;

    private String investorName;

    private Short isRecourse;

    private Short payMethod;

    private Short repayMehtod;

    private Date applyDate;

    private Short financingDays;

    private Date expiringDate;

    private Short interestModel;

    private BigDecimal interestRate;

    private BigDecimal handingChargeRate;

    private Short status;

    private String contractNo;

    private String rejectReason;
    
    private String returnReason;

    private BigDecimal financingAmount;

    private BigDecimal interestAmount;

    private BigDecimal handingCharge;

    private BigDecimal repayAmount;

    private BigDecimal repayInterest;

    private BigDecimal repayHandingCharge;

    private Short payStatus;

    private Short repayStatus;

    private Short interestStatus;

    private String remark;

    private String valid;

    private Long addedBy;

    private String addedByName;

    private Date addedTime;

    private Long lastModifiedBy;

    private String lastModifiedByName;

    private Date lastModifiedTime;

    private String lastModifiedIp;

    public BigDecimal getPkid() {
        return pkid;
    }

    public void setPkid(BigDecimal pkid) {
        this.pkid = pkid;
    }

    public String getFinancingCode() {
        return financingCode;
    }

    public void setFinancingCode(String financingCode) {
        this.financingCode = financingCode;
    }

    public BigDecimal getFinancingApplyId() {
        return financingApplyId;
    }

    public void setFinancingApplyId(BigDecimal financingApplyId) {
        this.financingApplyId = financingApplyId;
    }

    public String getFinancingApplyCode() {
        return financingApplyCode;
    }

    public void setFinancingApplyCode(String financingApplyCode) {
        this.financingApplyCode = financingApplyCode;
    }

    public BigDecimal getFinancingCompanyId() {
        return financingCompanyId;
    }

    public void setFinancingCompanyId(BigDecimal financingCompanyId) {
        this.financingCompanyId = financingCompanyId;
    }

    public String getFinancingCompanyName() {
        return financingCompanyName;
    }

    public void setFinancingCompanyName(String financingCompanyName) {
        this.financingCompanyName = financingCompanyName;
    }

    public String getShroffAccountNo() {
        return shroffAccountNo;
    }

    public void setShroffAccountNo(String shroffAccountNo) {
        this.shroffAccountNo = shroffAccountNo;
    }

    public BigDecimal getInvestorId() {
        return investorId;
    }

    public void setInvestorId(BigDecimal investorId) {
        this.investorId = investorId;
    }

    public String getInvestorName() {
        return investorName;
    }

    public void setInvestorName(String investorName) {
        this.investorName = investorName;
    }

    public Short getIsRecourse() {
        return isRecourse;
    }

    public void setIsRecourse(Short isRecourse) {
        this.isRecourse = isRecourse;
    }

    public Short getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Short payMethod) {
        this.payMethod = payMethod;
    }

    public Short getRepayMehtod() {
        return repayMehtod;
    }

    public void setRepayMehtod(Short repayMehtod) {
        this.repayMehtod = repayMehtod;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Short getFinancingDays() {
        return financingDays;
    }

    public void setFinancingDays(Short financingDays) {
        this.financingDays = financingDays;
    }

    public Date getExpiringDate() {
        return expiringDate;
    }

    public void setExpiringDate(Date expiringDate) {
        this.expiringDate = expiringDate;
    }

    public Short getInterestModel() {
        return interestModel;
    }

    public void setInterestModel(Short interestModel) {
        this.interestModel = interestModel;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getHandingChargeRate() {
        return handingChargeRate;
    }

    public void setHandingChargeRate(BigDecimal handingChargeRate) {
        this.handingChargeRate = handingChargeRate;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public BigDecimal getFinancingAmount() {
        return financingAmount;
    }

    public void setFinancingAmount(BigDecimal financingAmount) {
        this.financingAmount = financingAmount;
    }

    public BigDecimal getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(BigDecimal interestAmount) {
        this.interestAmount = interestAmount;
    }

    public BigDecimal getHandingCharge() {
        return handingCharge;
    }

    public void setHandingCharge(BigDecimal handingCharge) {
        this.handingCharge = handingCharge;
    }

    public BigDecimal getRepayAmount() {
        return repayAmount;
    }

    public void setRepayAmount(BigDecimal repayAmount) {
        this.repayAmount = repayAmount;
    }

    public BigDecimal getRepayInterest() {
        return repayInterest;
    }

    public void setRepayInterest(BigDecimal repayInterest) {
        this.repayInterest = repayInterest;
    }

    public BigDecimal getRepayHandingCharge() {
        return repayHandingCharge;
    }

    public void setRepayHandingCharge(BigDecimal repayHandingCharge) {
        this.repayHandingCharge = repayHandingCharge;
    }

    public Short getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Short payStatus) {
        this.payStatus = payStatus;
    }

    public Short getRepayStatus() {
        return repayStatus;
    }

    public void setRepayStatus(Short repayStatus) {
        this.repayStatus = repayStatus;
    }

    public Short getInterestStatus() {
        return interestStatus;
    }

    public void setInterestStatus(Short interestStatus) {
        this.interestStatus = interestStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public Long getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(Long addedBy) {
        this.addedBy = addedBy;
    }

    public String getAddedByName() {
        return addedByName;
    }

    public void setAddedByName(String addedByName) {
        this.addedByName = addedByName;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
    }

    public Long getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(Long lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getLastModifiedByName() {
        return lastModifiedByName;
    }

    public void setLastModifiedByName(String lastModifiedByName) {
        this.lastModifiedByName = lastModifiedByName;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public String getLastModifiedIp() {
        return lastModifiedIp;
    }

    public void setLastModifiedIp(String lastModifiedIp) {
        this.lastModifiedIp = lastModifiedIp;
    }

	public String getReturnReason() {
		return returnReason;
	}

	public void setReturnReason(String returnReason) {
		this.returnReason = returnReason;
	}
    
    
}