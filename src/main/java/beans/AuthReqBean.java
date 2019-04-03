package beans;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility= JsonAutoDetect.Visibility.NONE, setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)

public class AuthReqBean extends OMSTnsAbstractMessage {
    @JsonProperty("DAT")
    protected AuthRequest authRequest;

    public AuthReqBean() {
    }

    public AuthReqBean.AuthRequest getAuthRequest() {
        return this.authRequest;
    }

    public void setAuthRequest(AuthRequest authRequest) {
        this.authRequest = authRequest;
    }

    public class AuthRequest {
        private String lgnNme;
        private String pwd;

        public String getLgnNme() {
            return lgnNme;
        }

        public void setLgnNme(String lgnNme) {
            this.lgnNme = lgnNme;
        }

        public String getPwd() {
            return pwd;
        }

        public void setPwd(String pwd) {
            this.pwd = pwd;
        }
    }
}
