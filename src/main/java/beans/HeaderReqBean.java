package beans;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility= JsonAutoDetect.Visibility.NONE, setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class HeaderReqBean extends OMSTnsAbstractMessage {

    @JsonProperty(value = "DAT")
    protected HeaderRequestBody headerRequestBody;

    public HeaderRequestBody getHeaderRequestBody() {
        return headerRequestBody;
    }


    public void setHeaderRequestBody(HeaderRequestBody headerRequestBody) {
        this.headerRequestBody = headerRequestBody;
    }

    public class HeaderRequestBody {
        private int cusId;

        public int getCusId() {
            return cusId;
        }

        public void setCusId(int cusId) {
            this.cusId = cusId;
        }
    }
}
