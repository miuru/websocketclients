package beans;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility= JsonAutoDetect.Visibility.NONE, setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class AuthResponseBean extends OMSTnsAbstractMessage {
    @JsonProperty(value = "DAT")
    private AuthResponseTnsBean authResponseTnsBean;

    public AuthResponseTnsBean getBody() {
        return authResponseTnsBean;
    }

    public void setBody(AuthResponseTnsBean authResponseTnsBean) {
        this.authResponseTnsBean = authResponseTnsBean;
    }

    public class AuthResponseTnsBean {
        @JsonProperty(value = "usrId")
        private String userId;
        @JsonProperty(value = "authSts")
        private int authStatus;
        @JsonProperty(value = "dlrId")
        private int dealerId;
        @JsonProperty(value = "mubNo")
        private String customerNo;
        @JsonProperty(value = "failAtmps")
        private int failAttempts;
        @JsonProperty(value = "instId")
        private int institutionId;
        @JsonProperty(value = "instName")
        private String institutionName;
        @JsonProperty(value = "l2AuthTyp")
        private int l2AuthTyp;
        @JsonProperty(value = "prcUsr")
        private String priceUser;//remove ?
        @JsonProperty(value = "cusNme")
        private String customerName;//rename into name
        @JsonProperty(value = "clAccType")
        private int accountType;
        @JsonProperty(value = "prefLang")
        private String preferredLanguage;
        @JsonProperty(value = "lgnAls")
        private String loginAlias;
        @JsonProperty(value = "cntryCode")
        private String countryCode;
        @JsonProperty(value = "rejResn")
        private String rejectReason;
        @JsonProperty("lgnExpDte")
        private String loginExpiryDate;
        @JsonProperty("lstLgnTme")
        private String lastLoginTime;
        @JsonProperty("brkId")
        private String brokerId;//get from syspara
        @JsonProperty("ssoToken")
        private String ssoToken;
        @JsonProperty("mobile")
        private String mobile;
        @JsonProperty(value = "u01CustomerId")
        private long customerId;
        @JsonProperty(value = "entitlements")
        private int[] entitlements;
        private int isVatApplicable;

        private int userCategory;
        private long pwdExpDays;
        private int blockType;
        private double blockSpread;
        private int reportDepth;
        private String reportUrl;
        private String serverDate;

        private double maxPriceTolerance;
        private double maxOrderValue;

        private boolean updatePassword;
        private boolean autoUpdate;
        private String version;
        private long routeId;
        private String clientVersion;

        @JsonIgnore
        private String password;
        @JsonIgnore
        private String loginName;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public int getAuthStatus() {
            return authStatus;
        }

        public void setAuthStatus(int authStatus) {
            this.authStatus = authStatus;
        }

        public int getDealerId() {
            return dealerId;
        }

        public void setDealerId(int dealerId) {
            this.dealerId = dealerId;
        }

        public String getCustomerNo() {
            return customerNo;
        }

        public void setCustomerNo(String customerNo) {
            this.customerNo = customerNo;
        }

        public int getFailAttempts() {
            return failAttempts;
        }

        public void setFailAttempts(int failAttempts) {
            this.failAttempts = failAttempts;
        }

        public int getInstitutionId() {
            return institutionId;
        }

        public void setInstitutionId(int institutionId) {
            this.institutionId = institutionId;
        }

        public String getInstitutionName() {
            return institutionName;
        }

        public void setInstitutionName(String institutionName) {
            this.institutionName = institutionName;
        }

        public int getL2AuthTyp() {
            return l2AuthTyp;
        }

        public void setL2AuthTyp(int l2AuthTyp) {
            this.l2AuthTyp = l2AuthTyp;
        }

        public String getPriceUser() {
            return priceUser;
        }

        public void setPriceUser(String priceUser) {
            this.priceUser = priceUser;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public int getAccountType() {
            return accountType;
        }

        public void setAccountType(int accountType) {
            this.accountType = accountType;
        }

        public String getPreferredLanguage() {
            return preferredLanguage;
        }

        public void setPreferredLanguage(String preferredLanguage) {
            this.preferredLanguage = preferredLanguage;
        }

        public String getLoginAlias() {
            return loginAlias;
        }

        public void setLoginAlias(String loginAlias) {
            this.loginAlias = loginAlias;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public long getCustomerId() {
            return customerId;
        }

        public void setCustomerId(long customerId) {
            this.customerId = customerId;
        }

        public String getRejectReason() {
            return rejectReason;
        }

        public void setRejectReason(String rejectReason) {
            this.rejectReason = rejectReason;
        }

        public String getLoginExpiryDate() {
            return loginExpiryDate;
        }

        public void setLoginExpiryDate(String loginExpiryDate) {
            this.loginExpiryDate = loginExpiryDate;
        }

        public String getLastLoginTime() {
            return lastLoginTime;
        }

        public void setLastLoginTime(String lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
        }

        public String getBrokerId() {
            return brokerId;
        }

        public void setBrokerId(String brokerId) {
            this.brokerId = brokerId;
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

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getLoginName() {
            return loginName;
        }

        public void setLoginName(String loginName) {
            this.loginName = loginName;
        }

        public int[] getEntitlements() {
            return entitlements;
        }

        public void setEntitlements(int[] entitlements) {
            this.entitlements = entitlements;
        }

        public int getIsVatApplicable() {
            return isVatApplicable;
        }

        public void setIsVatApplicable(int isVatApplicable) {
            this.isVatApplicable = isVatApplicable;
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

        public boolean getAutoUpdate() {
            return autoUpdate;
        }

        public void setAutoUpdate(boolean autoUpdate) {
            this.autoUpdate = autoUpdate;
        }

        public int getUserCategory() {
            return userCategory;
        }

        public void setUserCategory(int userCategory) {
            this.userCategory = userCategory;
        }

        public long getPwdExpDays() {
            return pwdExpDays;
        }

        public void setPwdExpDays(long pwdExpDays) {
            this.pwdExpDays = pwdExpDays;
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

        public boolean getUpdatePassword() {
            return updatePassword;
        }

        public void setUpdatePassword(boolean updatePassword) {
            this.updatePassword = updatePassword;
        }

        public long getRouteId() {
            return routeId;
        }

        public void setRouteId(long routeId) {
            this.routeId = routeId;
        }

        public String getClientVersion() {
            return clientVersion;
        }

        public void setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
        }
    }

}
