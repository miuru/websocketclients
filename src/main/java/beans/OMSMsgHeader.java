package beans;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE, setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)

public class OMSMsgHeader {
    @JsonProperty("msgTyp")
    private int requestType = 1;
    private String tenantCode = "DEFAULT_TENANT";
    @JsonProperty("sesnId")
    private String sessionID;
    @JsonProperty("loginId")
    private int loginID = 1;
    private int channel = -1;
    @JsonProperty("clientIp")
    private String clientIP;
    private String commVer;
    @JsonProperty("unqReqId")
    private String unqReqId;
    @JsonProperty("routeId")
    private String routeId;

    public int getRequestType() {
        return this.requestType;
    }

    public void setRequestType(int requestType) {
        this.requestType = requestType;
    }

    public OMSMsgHeader() {
    }

    public OMSMsgHeader(OMSMsgHeader header) {
        this.requestType = header.getRequestType();
        this.tenantCode = header.getTenantCode();
        this.sessionID = header.getSessionID();
        this.loginID = header.getLoginID();
        this.channel = header.getChannel();
        this.clientIP = header.getClientIP();
        this.commVer = header.getCommVer();
        this.unqReqId = header.getUnqReqId();
    }

    public OMSMsgHeader copyDeep() {
        OMSMsgHeader omsMsgHeader = new OMSMsgHeader(this);
        return omsMsgHeader;
    }

    public int getLoginID() {
        return this.loginID;
    }

    public void setLoginID(int loginID) {
        this.loginID = loginID;
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public int getChannel() {
        return this.channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public String getTenantCode() {
        return this.tenantCode;
    }

    public void setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
    }

    public String getClientIP() {
        return this.clientIP;
    }

    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
    }

    public String getCommVer() {
        return this.commVer;
    }

    public void setCommVer(String commVer) {
        this.commVer = commVer;
    }

    public String getUnqReqId() {
        return this.unqReqId;
    }

    public void setUnqReqId(String unqReqId) {
        this.unqReqId = unqReqId;
    }

    public String getRouteId() {
        return this.routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }
}
