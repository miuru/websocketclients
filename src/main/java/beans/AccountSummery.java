package beans;


public class AccountSummery {
    public double balance;
    public double tradingLimit;
    public double openBuyBlock;
    public double receivable;
    public String cashAcntId ;
    public boolean isMar ;
    public double blkAmt;
    public double payAmt ;
    public double penSet;
    public String curr ;
    public double cashForWith ;
    public double buyPwr ;
    public double odLmt ;
    public double marLmt;
    public double unrealSales;
    public double marBlk ;
    public double marDue ;
    public double cashAmt ;
    public double groupBuyingPower ;
    public double otherBlk ;
    private String cashAccName;
    private int marginStatus;
    private int invAccNo;
    private int cashAccId;

    public AccountSummery (){}

    public AccountSummery(String accID) {
        cashAcntId = accID;
        //orderBuyingPower = new Hashtable<String, Double>();
    }

    public String getCashAccName() {
        return cashAccName;
    }

    public void setCashAccName(String cashAccName) {
        this.cashAccName = cashAccName;
    }

    public int getMarginStatus() {
        return marginStatus;
    }

    public void setMarginStatus(int marginStatus) {
        this.marginStatus = marginStatus;
    }

    public int getInvAccNo() {
        return invAccNo;
    }

    public void setInvAccNo(int invAccNo) {
        this.invAccNo = invAccNo;
    }

    public int getCashAccId() {
        return cashAccId;
    }

    public void setCashAccId(int cashAccId) {
        this.cashAccId = cashAccId;
    }

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
