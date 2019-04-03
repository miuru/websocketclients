package beans;

import java.util.ArrayList;

public class AuthenticationResponse {

    private ArrayList<Rules> rules= new ArrayList<Rules>();
    private java.util.ArrayList<PortfolioRecords> portfolio;
    private int isVatApplicable;
    private int userCategory;
    private int pwdExpDays;
    private int blockType;
    private double blockSpread;
    private boolean autoUpdate;
    private String version;
    private int reportDepth ;
    private String reportUrl ;
    private int usrId ;
    private int authSts ;
    private String lgnExpDte ;
    private int dlrId ;
    private String mubNo;
    private int failAtmps ;
    private int instId ;
    private int priceInstId ;
    private int l2AuthTyp ;
    private String prcUsr ;
    private String cusNme ;
    private int clAccType ;
    private String prefLang ;
    private String lgnAls ;
    private String cntryCode ;
    private int u01CustomerId ;
    private String rejResn ;
    private String lstLgnTme ;
    private String brkId ;
    private String ssoToken ;
    private String mobile ;
    private String serverDate ;
    private double maxPriceTolerance ;
    private double maxOrderValue ;
    private AuthResponse.Institution userInstitution ;
    private int[] entitlements;

    public ArrayList<Rules> getRules() {
        return rules;
    }

    public void setRules(ArrayList<Rules> rules) {
        this.rules = rules;
    }

    public ArrayList<PortfolioRecords> getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(ArrayList<PortfolioRecords> portfolio) {
        this.portfolio = portfolio;
    }

    public int getIsVatApplicable() {
        return isVatApplicable;
    }

    public void setIsVatApplicable(int isVatApplicable) {
        this.isVatApplicable = isVatApplicable;
    }

    public int getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(int userCategory) {
        this.userCategory = userCategory;
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

    public int getU01CustomerId() {
        return u01CustomerId;
    }

    public void setU01CustomerId(int u01CustomerId) {
        this.u01CustomerId = u01CustomerId;
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

    public String getServerDate() {
        return serverDate;
    }

    public void setServerDate(String serverDate) {
        this.serverDate = serverDate;
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
}
