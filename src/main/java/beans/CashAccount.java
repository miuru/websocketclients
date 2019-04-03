package beans;

import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(value = "CashResponse", description = "CashResponse body")
public class CashAccount {

    private double balance ;
    private double tradingLimit;
    private double openBuyBlock;
    private double receivable;
    private String cashAcntId ;
    private boolean isMar ;
    private double blkAmt;
    private double payAmt ;
    private double penSet;
    private String curr ;
    private double cashForWith ;
    private double buyPwr ;
    private double odLmt ;
    private double marLmt;
    private double unrealSales;
    private double marBlk ;
    private double marDue ;
    private double cashAmt ;
    private double groupBuyingPower ;
    private double otherBlk ;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTradingLimit() {
        return tradingLimit;
    }

    public void setTradingLimit(double tradingLimit) {
        this.tradingLimit = tradingLimit;
    }

    public double getOpenBuyBlock() {
        return openBuyBlock;
    }

    public void setOpenBuyBlock(double openBuyBlock) {
        this.openBuyBlock = openBuyBlock;
    }

    public double getReceivable() {
        return receivable;
    }

    public void setReceivable(double receivable) {
        this.receivable = receivable;
    }

    public String getCashAcntId() {
        return cashAcntId;
    }

    public void setCashAcntId(String cashAcntId) {
        this.cashAcntId = cashAcntId;
    }

    public boolean isMar() {
        return isMar;
    }

    public void setMar(boolean mar) {
        isMar = mar;
    }

    public double getBlkAmt() {
        return blkAmt;
    }

    public void setBlkAmt(double blkAmt) {
        this.blkAmt = blkAmt;
    }

    public double getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(double payAmt) {
        this.payAmt = payAmt;
    }

    public double getPenSet() {
        return penSet;
    }

    public void setPenSet(double penSet) {
        this.penSet = penSet;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }

    public double getCashForWith() {
        return cashForWith;
    }

    public void setCashForWith(double cashForWith) {
        this.cashForWith = cashForWith;
    }

    public double getBuyPwr() {
        return buyPwr;
    }

    public void setBuyPwr(double buyPwr) {
        this.buyPwr = buyPwr;
    }

    public double getOdLmt() {
        return odLmt;
    }

    public void setOdLmt(double odLmt) {
        this.odLmt = odLmt;
    }

    public double getMarLmt() {
        return marLmt;
    }

    public void setMarLmt(double marLmt) {
        this.marLmt = marLmt;
    }

    public double getUnrealSales() {
        return unrealSales;
    }

    public void setUnrealSales(double unrealSales) {
        this.unrealSales = unrealSales;
    }

    public double getMarBlk() {
        return marBlk;
    }

    public void setMarBlk(double marBlk) {
        this.marBlk = marBlk;
    }

    public double getMarDue() {
        return marDue;
    }

    public void setMarDue(double marDue) {
        this.marDue = marDue;
    }

    public double getCashAmt() {
        return cashAmt;
    }

    public void setCashAmt(double cashAmt) {
        this.cashAmt = cashAmt;
    }

    public double getGroupBuyingPower() {
        return groupBuyingPower;
    }

    public void setGroupBuyingPower(double groupBuyingPower) {
        this.groupBuyingPower = groupBuyingPower;
    }

    public double getOtherBlk() {
        return otherBlk;
    }

    public void setOtherBlk(double otherBlk) {
        this.otherBlk = otherBlk;
    }
}
