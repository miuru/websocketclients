package beans;

import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(value = "TradingAccounts", description = "TradingAccount body")
public class TradingAccountResponse {
    private long tradingAccountId;
    private  String tradingAccountNo;
    private  String displayName;
    private String institute;
    private  long cashAccountId;
    private String exchangeCode;
    private String type;
    private  boolean defaultAccount;
    private  boolean tradingEnabled;
    private  String tradingGroup;
    private  String status ;
    private  String commissionGroup;
    private  double discountPercentage;
    private  String commissionDiscountGroup;
    private  String execBrokerId ;
    private  String exchangeAccNo;
    private  String customerSettleGroup;
    private  long custodianId;
    private  String externalRef;
    private  boolean tradeRejectionEnabled ;
    private  boolean shortSellEnabled;
    private  boolean shariaCompliant;
    private double netHoldingWithPledge;
    private  double netHoldingWithoutPledge ;

    public long getTradingAccountId() {
        return tradingAccountId;
    }

    public void setTradingAccountId(long tradingAccountId) {
        this.tradingAccountId = tradingAccountId;
    }

    public String getTradingAccountNo() {
        return tradingAccountNo;
    }

    public void setTradingAccountNo(String tradingAccountNo) {
        this.tradingAccountNo = tradingAccountNo;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public long getCashAccountId() {
        return cashAccountId;
    }

    public void setCashAccountId(long cashAccountId) {
        this.cashAccountId = cashAccountId;
    }

    public String getExchangeCode() {
        return exchangeCode;
    }

    public void setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDefaultAccount() {
        return defaultAccount;
    }

    public void setDefaultAccount(boolean defaultAccount) {
        this.defaultAccount = defaultAccount;
    }

    public boolean isTradingEnabled() {
        return tradingEnabled;
    }

    public void setTradingEnabled(boolean tradingEnabled) {
        this.tradingEnabled = tradingEnabled;
    }

    public String getTradingGroup() {
        return tradingGroup;
    }

    public void setTradingGroup(String tradingGroup) {
        this.tradingGroup = tradingGroup;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCommissionGroup() {
        return commissionGroup;
    }

    public void setCommissionGroup(String commissionGroup) {
        this.commissionGroup = commissionGroup;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public String getCommissionDiscountGroup() {
        return commissionDiscountGroup;
    }

    public void setCommissionDiscountGroup(String commissionDiscountGroup) {
        this.commissionDiscountGroup = commissionDiscountGroup;
    }

    public String getExecBrokerId() {
        return execBrokerId;
    }

    public void setExecBrokerId(String execBrokerId) {
        this.execBrokerId = execBrokerId;
    }

    public String getExchangeAccNo() {
        return exchangeAccNo;
    }

    public void setExchangeAccNo(String exchangeAccNo) {
        this.exchangeAccNo = exchangeAccNo;
    }

    public String getCustomerSettleGroup() {
        return customerSettleGroup;
    }

    public void setCustomerSettleGroup(String customerSettleGroup) {
        this.customerSettleGroup = customerSettleGroup;
    }

    public long getCustodianId() {
        return custodianId;
    }

    public void setCustodianId(long custodianId) {
        this.custodianId = custodianId;
    }

    public String getExternalRef() {
        return externalRef;
    }

    public void setExternalRef(String externalRef) {
        this.externalRef = externalRef;
    }

    public boolean isTradeRejectionEnabled() {
        return tradeRejectionEnabled;
    }

    public void setTradeRejectionEnabled(boolean tradeRejectionEnabled) {
        this.tradeRejectionEnabled = tradeRejectionEnabled;
    }

    public boolean isShortSellEnabled() {
        return shortSellEnabled;
    }

    public void setShortSellEnabled(boolean shortSellEnabled) {
        this.shortSellEnabled = shortSellEnabled;
    }

    public boolean isShariaCompliant() {
        return shariaCompliant;
    }

    public void setShariaCompliant(boolean shariaCompliant) {
        this.shariaCompliant = shariaCompliant;
    }

    public double getNetHoldingWithPledge() {
        return netHoldingWithPledge;
    }

    public void setNetHoldingWithPledge(double netHoldingWithPledge) {
        this.netHoldingWithPledge = netHoldingWithPledge;
    }

    public double getNetHoldingWithoutPledge() {
        return netHoldingWithoutPledge;
    }

    public void setNetHoldingWithoutPledge(double netHoldingWithoutPledge) {
        this.netHoldingWithoutPledge = netHoldingWithoutPledge;
    }
}
