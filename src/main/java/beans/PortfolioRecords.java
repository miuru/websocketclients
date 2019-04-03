package beans;

import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(value = "holdings", description = "HoldingRes body")
public class PortfolioRecords {

    private String key;
    private int symbolID;
    private String tradeMatchId;
    private String transactionCode;
    private String orderId;
    private int transactionType;
    private int transactionSubType;
    private int pendingSubscribedQty;
    private int subscribedQty;
    private int shortHoldings;
    private int allowToLiqQty;
    private int realizedGainLost;
    private int manualBlock;
    private int netReceivable;
    private Date lastUpdateDate;
    private long netHolding;
    private int holdingBlock;
    private int payQty;
    private int recQty;
    private double pendSell;
    private double pendBuy;
    private int custodianCode;
    private double wAvgPrice;
    private double weightedAvgCost;
    private double avgPrice;
    private double avgCst;
    private String curr;
    private int instruTyp;
    private int tradingAccId;
    private String exg;
    private int pldQty;
    private int strikePrice;
    private double tradingAccount;
    private double vaiQtyForSell;
    private double avaiQty;
    private double avaiSubscribe;
    private double qty;
    private String symbol;
    private double lastUpdate;

    public PortfolioRecords(){}
//    public void PortfolioRecords(){}
//
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getSymbolID() {
        return symbolID;
    }

    public void setSymbolID(int symbolID) {
        this.symbolID = symbolID;
    }

    public String getTradeMatchId() {
        return tradeMatchId;
    }

    public void setTradeMatchId(String tradeMatchId) {
        this.tradeMatchId = tradeMatchId;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(int transactionType) {
        this.transactionType = transactionType;
    }

    public int getTransactionSubType() {
        return transactionSubType;
    }

    public void setTransactionSubType(int transactionSubType) {
        this.transactionSubType = transactionSubType;
    }

    public int getPendingSubscribedQty() {
        return pendingSubscribedQty;
    }

    public void setPendingSubscribedQty(int pendingSubscribedQty) {
        this.pendingSubscribedQty = pendingSubscribedQty;
    }

    public int getSubscribedQty() {
        return subscribedQty;
    }

    public void setSubscribedQty(int subscribedQty) {
        this.subscribedQty = subscribedQty;
    }

    public int getShortHoldings() {
        return shortHoldings;
    }

    public void setShortHoldings(int shortHoldings) {
        this.shortHoldings = shortHoldings;
    }

    public int getAllowToLiqQty() {
        return allowToLiqQty;
    }

    public void setAllowToLiqQty(int allowToLiqQty) {
        this.allowToLiqQty = allowToLiqQty;
    }

    public int getRealizedGainLost() {
        return realizedGainLost;
    }

    public void setRealizedGainLost(int realizedGainLost) {
        this.realizedGainLost = realizedGainLost;
    }

    public int getManualBlock() {
        return manualBlock;
    }

    public void setManualBlock(int manualBlock) {
        this.manualBlock = manualBlock;
    }

    public int getNetReceivable() {
        return netReceivable;
    }

    public void setNetReceivable(int netReceivable) {
        this.netReceivable = netReceivable;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public long getNetHolding() {
        return netHolding;
    }

    public void setNetHolding(long netHolding) {
        this.netHolding = netHolding;
    }

    public int getHoldingBlock() {
        return holdingBlock;
    }

    public void setHoldingBlock(int holdingBlock) {
        this.holdingBlock = holdingBlock;
    }

    public int getPayQty() {
        return payQty;
    }

    public void setPayQty(int payQty) {
        this.payQty = payQty;
    }

    public int getRecQty() {
        return recQty;
    }

    public void setRecQty(int recQty) {
        this.recQty = recQty;
    }

    public double getPendSell() {
        return pendSell;
    }

    public void setPendSell(double pendSell) {
        this.pendSell = pendSell;
    }

    public double getPendBuy() {
        return pendBuy;
    }

    public void setPendBuy(double pendBuy) {
        this.pendBuy = pendBuy;
    }

    public int getCustodianCode() {
        return custodianCode;
    }

    public void setCustodianCode(int custodianCode) {
        this.custodianCode = custodianCode;
    }

    public double getwAvgPrice() {
        return wAvgPrice;
    }

    public void setwAvgPrice(double wAvgPrice) {
        this.wAvgPrice = wAvgPrice;
    }

    public double getWeightedAvgCost() {
        return weightedAvgCost;
    }

    public void setWeightedAvgCost(double weightedAvgCost) {
        this.weightedAvgCost = weightedAvgCost;
    }

    public double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public double getAvgCst() {
        return avgCst;
    }

    public void setAvgCst(double avgCst) {
        this.avgCst = avgCst;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }

    public int getInstruTyp() {
        return instruTyp;
    }

    public void setInstruTyp(int instruTyp) {
        this.instruTyp = instruTyp;
    }

    public int getTradingAccId() {
        return tradingAccId;
    }

    public void setTradingAccId(int tradingAccId) {
        this.tradingAccId = tradingAccId;
    }

    public String getExg() {
        return exg;
    }

    public void setExg(String exg) {
        this.exg = exg;
    }

    public int getPldQty() {
        return pldQty;
    }

    public void setPldQty(int pldQty) {
        this.pldQty = pldQty;
    }

    public int getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(int strikePrice) {
        this.strikePrice = strikePrice;
    }

    public double getTradingAccount() {
        return tradingAccount;
    }

    public void setTradingAccount(double tradingAccount) {
        this.tradingAccount = tradingAccount;
    }

    public double getVaiQtyForSell() {
        return vaiQtyForSell;
    }

    public void setVaiQtyForSell(double vaiQtyForSell) {
        this.vaiQtyForSell = vaiQtyForSell;
    }

    public double getAvaiQty() {
        return avaiQty;
    }

    public void setAvaiQty(double avaiQty) {
        this.avaiQty = avaiQty;
    }

    public double getAvaiSubscribe() {
        return avaiSubscribe;
    }

    public void setAvaiSubscribe(double avaiSubscribe) {
        this.avaiSubscribe = avaiSubscribe;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(double lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}