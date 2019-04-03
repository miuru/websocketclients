package beans;

import io.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Date;

/**
 * DB session response.
 */
public class SessionResponse  {
    @JsonProperty(value = "usrId")
    private long loginId;
    private String sessionToken;
    @JsonProperty(value = "authSts")
    private int authStatus;
    private String clientIp;
    private Date loginTime;
    @JsonProperty("lgnExpDte")
    private String expiryTime;
    private String description;

    @ApiModelProperty(value = "user's login id", required = true, example = "user123")
    public long getLoginId() {
        return loginId;
    }

    public void setLoginId(long loginId) {
        this.loginId = loginId;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    @ApiModelProperty(value = "authentication status", required = true, allowableValues = "0, 1", example = "1")
    public int getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(int authStatus) {
        this.authStatus = authStatus;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    @ApiModelProperty(value = "login expiry date time", example = "2017-03-12 12:12:12")
    public String getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
