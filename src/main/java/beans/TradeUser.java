package beans;

import java.io.IOException;
import java.util.ArrayList;

public class TradeUser {
    private static TradeUser self = null;
    private String sessionID = "";
    private int userCategory;
    private int loginId;
    private boolean isAuthenticated = false;
    private boolean isTradeAuthenticated = false;
    private String customerName;
    private int isVatApplicable;
    private int pwdExpDays;
    private int blockType;
    private double blockSpread;
    private boolean autoUpdate;
    private String version;
    private int reportDepth;
    private String reportUrl;
    private int usrId;
    private int authSts;
    private String lgnExpDte;
    private int dlrId;
    private String mubNo;
    private int failAtmps;
    private int instId;
    private int priceInstId;
    private int l2AuthTyp;
    private String prcUsr;
    private String cusNme;
    private int clAccType;
    private String prefLang;
    private String lgnAls;
    private String cntryCode;
    private int u01CustomerId;
    private String rejResn;
    private String lstLgnTme;
    private String brkId;
    private String ssoToken;
    private String mobile;
    private String serverDate;
    private double maxPriceTolerance;
    private double maxOrderValue;
    private AuthResponse.Institution userInstitution;
    private int[] entitlements;
    private long tradingAccountId;
    public double avgPrice;
    public double tradingLimit;
    public double openBuyBlock;
    public double receivable;
    public long cashAcntId;
    public boolean isMar;
    public double blkAmt;
    public double payAmt;
    public double penSet;
    public String curr;
    public double cashForWith;
    public double buyPwr;
    public double odLmt;
    public double marLmt;
    public double unrealSales;
    public double marBlk;
    public double marDue;
    public double cashAmt;
    public double groupBuyingPower;
    public double otherBlk;
    private int userID;
    private String institutionalService;
    private boolean updatePassword;
    private long routeId;
    private String clientIP;
    private String commVer;
    private int requestType;
    private String tradingAccName;
    private int isDefault;
    private String exchange;
    private String cashAccountId;
    private int tradingAccId;
    private String cashAccName;
    private int marginStatus;
    private int invAccNo;
    private String cashAccId;
    private ArrayList<CashAccountH> cashAccountRec = new ArrayList<CashAccountH>();
    private ArrayList<TradingAccount> tradingAccounts = new ArrayList<TradingAccount>();
    private ArrayList<PortfolioRecords> holdings = new ArrayList<PortfolioRecords>();
    private ArrayList<Rules> rules= new ArrayList<Rules>();


    public ArrayList<Rules> getRules() {
        return rules;
    }

    public void setRules(ArrayList<Rules> rules) {
        this.rules = rules;
    }

    public ArrayList<PortfolioRecords> getHoldings() {
        return holdings;
    }

    public void setHoldings(ArrayList<PortfolioRecords> holdings) {
        this.holdings = holdings;
    }

    public ArrayList<TradingAccount> getTradingAccounts() {
        return tradingAccounts;
    }

    public void setTradingAccounts(ArrayList<TradingAccount> tradingAccounts) {
        this.tradingAccounts = tradingAccounts;
    }

    public int getIsVatApplicable() {
        return isVatApplicable;
    }

    public void setIsVatApplicable(int isVatApplicable) {
        this.isVatApplicable = isVatApplicable;
    }

    public int getUsrId() {
        return usrId;
    }

    public void setUsrId(int usrId) {
        this.usrId = usrId;
    }

    public int getAuthSts() {
        return authSts;
    }

    public void setAuthSts(int authSts) {
        this.authSts = authSts;
    }

    public String getLgnExpDte() {
        return lgnExpDte;
    }

    public void setLgnExpDte(String lgnExpDte) {
        this.lgnExpDte = lgnExpDte;
    }

    public int getDlrId() {
        return dlrId;
    }

    public void setDlrId(int dlrId) {
        this.dlrId = dlrId;
    }

    public String getMubNo() {
        return mubNo;
    }

    public void setMubNo(String mubNo) {
        this.mubNo = mubNo;
    }

    public int getFailAtmps() {
        return failAtmps;
    }

    public void setFailAtmps(int failAtmps) {
        this.failAtmps = failAtmps;
    }

    public int getInstId() {
        return instId;
    }

    public void setInstId(int instId) {
        this.instId = instId;
    }

    public int getPriceInstId() {
        return priceInstId;
    }

    public void setPriceInstId(int priceInstId) {
        this.priceInstId = priceInstId;
    }

    public int getL2AuthTyp() {
        return l2AuthTyp;
    }

    public void setL2AuthTyp(int l2AuthTyp) {
        this.l2AuthTyp = l2AuthTyp;
    }

    public String getPrcUsr() {
        return prcUsr;
    }

    public void setPrcUsr(String prcUsr) {
        this.prcUsr = prcUsr;
    }

    public String getCusNme() {
        return cusNme;
    }

    public void setCusNme(String cusNme) {
        this.cusNme = cusNme;
    }

    public int getClAccType() {
        return clAccType;
    }

    public void setClAccType(int clAccType) {
        this.clAccType = clAccType;
    }

    public String getPrefLang() {
        return prefLang;
    }

    public void setPrefLang(String prefLang) {
        this.prefLang = prefLang;
    }

    public String getLgnAls() {
        return lgnAls;
    }

    public void setLgnAls(String lgnAls) {
        this.lgnAls = lgnAls;
    }

    public String getCntryCode() {
        return cntryCode;
    }

    public void setCntryCode(String cntryCode) {
        this.cntryCode = cntryCode;
    }

    public String getRejResn() {
        return rejResn;
    }

    public void setRejResn(String rejResn) {
        this.rejResn = rejResn;
    }

    public String getLstLgnTme() {
        return lstLgnTme;
    }

    public void setLstLgnTme(String lstLgnTme) {
        this.lstLgnTme = lstLgnTme;
    }

    public String getBrkId() {
        return brkId;
    }

    public void setBrkId(String brkId) {
        this.brkId = brkId;
    }

    public String getSsoToken() {
        return ssoToken;
    }

    public void setSsoToken(String ssoToken) {
        this.ssoToken = ssoToken;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public AuthResponse.Institution getUserInstitution() {
        return userInstitution;
    }

    public void setUserInstitution(AuthResponse.Institution userInstitution) {
        this.userInstitution = userInstitution;
    }

    public int[] getEntitlements() {
        return entitlements;
    }

    public void setEntitlements(int[] entitlements) {
        this.entitlements = entitlements;
    }

    public boolean isTradeAuthenticated() {
        return isTradeAuthenticated;
    }

    public void setTradeAuthenticated(boolean tradeAuthenticated) {
        isTradeAuthenticated = tradeAuthenticated;
    }

    public int getU01CustomerId() {
        return u01CustomerId;
    }

    public void setU01CustomerId(int u01CustomerId) {
        this.u01CustomerId = u01CustomerId;
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

    public String getCashAccId() {
        return cashAccId;
    }

    public void setCashAccId(String cashAccId) {
        this.cashAccId = cashAccId;
    }

    public static TradeUser getSelf() {
        return self;
    }

    public String getTradingAccName() {
        return tradingAccName;
    }

    public void setTradingAccName(String tradingAccName) {
        this.tradingAccName = tradingAccName;
    }

    public int getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getCashAccountId() {
        return cashAccountId;
    }

    public void setCashAccountId(String cashAccountId) {
        this.cashAccountId = cashAccountId;
    }

    public int getTradingAccId() {
        return tradingAccId;
    }

    public void setTradingAccId(int tradingAccId) {
        this.tradingAccId = tradingAccId;
    }

    public static void setSelf(TradeUser self) {
        TradeUser.self = self;
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

    public long getCashAcntId() {
        return cashAcntId;
    }

    public void setCashAcntId(long cashAcntId) {
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

    public double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double balance;

    public long getTradingAccountId() {
        return tradingAccountId;
    }

    public void setTradingAccountId(long tradingAccountId) {
        this.tradingAccountId = tradingAccountId;
    }

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getRequestType() {
        return requestType;
    }

    public void setRequestType(int requestType) {
        this.requestType = requestType;
    }

    public String getClientIP() {
        return clientIP;
    }

    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
    }

    public String getCommVer() {
        return commVer;
    }

    public void setCommVer(String commVer) {
        this.commVer = commVer;
    }

    public int getPwdExpDays() {
        return pwdExpDays;
    }

    public void setPwdExpDays(int pwdExpDays) {
        this.pwdExpDays = pwdExpDays;
    }

    public int getBlockType() {
        return blockType;
    }

    public void setBlockType(int blockType) {
        this.blockType = blockType;
    }

    public double getBlockSpread() {
        return blockSpread;
    }

    public void setBlockSpread(double blockSpread) {
        this.blockSpread = blockSpread;
    }

    public int getReportDepth() {
        return reportDepth;
    }

    public void setReportDepth(int reportDepth) {
        this.reportDepth = reportDepth;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getServerDate() {
        return serverDate;
    }

    public void setServerDate(String serverDate) {
        this.serverDate = serverDate;
    }

    public String getInstitutionalService() {
        return institutionalService;
    }

    public void setInstitutionalService(String institutionalService) {
        this.institutionalService = institutionalService;
    }

    public double getMaxPriceTolerance() {
        return maxPriceTolerance;
    }

    public void setMaxPriceTolerance(double maxPriceTolerance) {
        this.maxPriceTolerance = maxPriceTolerance;
    }

    public double getMaxOrderValue() {
        return maxOrderValue;
    }

    public void setMaxOrderValue(double maxOrderValue) {
        this.maxOrderValue = maxOrderValue;
    }

    public boolean isUpdatePassword() {
        return updatePassword;
    }

    public void setUpdatePassword(boolean updatePassword) {
        this.updatePassword = updatePassword;
    }

    public boolean isAutoUpdate() {
        return autoUpdate;
    }

    public void setAutoUpdate(boolean autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public long getRouteId() {
        return routeId;
    }

    public void setRouteId(long routeId) {
        this.routeId = routeId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    private TradeUser() {
        self = this;
    }

    public int getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(int userCategory) {
        this.userCategory = userCategory;
    }

    public static TradeUser getSharedInstance() {
        if (self == null) {
            self = new TradeUser();
        }
        return self;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public ArrayList<CashAccountH> getCashAccountRec() {
        return cashAccountRec;
    }

    public void setCashAccountRec(ArrayList<CashAccountH> cashAccountRec) {
        this.cashAccountRec = cashAccountRec;
    }

    public void setAuthenticated(boolean authenticated) {
        isAuthenticated = authenticated;
    }

    public void processCashResponse(HeaderResponse headerResponse) throws IOException {

        TradeUser.getSharedInstance().setCashAccountRec(headerResponse.getCashAccounts());
        TradeUser.getSharedInstance().setTradingAccounts(headerResponse.getTradingAccounts());
        Response response = new Response();
        response.setCashAccountRequest();
    }

    protected void processHoldingresponse(HeaderResponse headerResponse) throws IOException {

        TradeUser.getSharedInstance().setTradingAccounts(headerResponse.getTradingAccounts());
        Response response = new Response();
        response.setHoldingRequest();
    }

    public AuthenticationResponse getAuthenticationResponse() {
        AuthResponse authResponse = new AuthResponse();
        AuthenticationResponse authenticationResponse = new AuthenticationResponse();
        authenticationResponse.setPortfolio(TradeUser.getSharedInstance().getHoldings());
        authenticationResponse.setRules(TradeUser.getSharedInstance().getRules());
        authenticationResponse.setUsrId(TradeUser.getSharedInstance().getUserID());
        authenticationResponse.setIsVatApplicable(authResponse.getIsVatApplicable());
        authenticationResponse.setIsVatApplicable(TradeUser.getSharedInstance().getIsVatApplicable());
        authenticationResponse.setCusNme(TradeUser.getSharedInstance().getCustomerName());
        authenticationResponse.setAuthSts(TradeUser.getSharedInstance().getAuthSts());
        authenticationResponse.setLstLgnTme(TradeUser.getSharedInstance().getLstLgnTme());
        authenticationResponse.setBlockSpread(TradeUser.getSharedInstance().getBlockSpread());
        authenticationResponse.setBlockType(TradeUser.getSharedInstance().getBlockType());
        authenticationResponse.setL2AuthTyp(TradeUser.getSharedInstance().getL2AuthTyp());
        authenticationResponse.setMubNo(TradeUser.getSharedInstance().getMubNo());
        authenticationResponse.setLgnExpDte(TradeUser.getSharedInstance().getLgnExpDte());
        authenticationResponse.setPrcUsr(TradeUser.getSharedInstance().getPrcUsr());

        return authenticationResponse;
    }
}
