package beans;

import org.codehaus.jackson.annotate.JsonProperty;

public class SubRequestBean extends OMSTnsAbstractMessage {

    @JsonProperty(value = "DAT")
    private SubRequestBody subRequestBody;

    public SubRequestBody getSubRequestBody() {
        return subRequestBody;
    }

    public void setSubRequestBody(SubRequestBody subRequestBody) {
        this.subRequestBody = subRequestBody;
    }

    public class SubRequestBody {
        private int service;

        public int getService() {
            return service;
        }

        public void setService(int service) {
            this.service = service;
        }
    }
}
