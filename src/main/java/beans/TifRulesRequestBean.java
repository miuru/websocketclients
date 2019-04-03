package beans;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility= JsonAutoDetect.Visibility.NONE, setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class TifRulesRequestBean extends OMSTnsAbstractMessage {

    @JsonProperty(value = "DAT")
    protected TifRulesRequestBody tifRulesRequestBody;

    public TifRulesRequestBody getTifRulesRequestBody() {
        return tifRulesRequestBody;
    }


    public void setTifRulesRequestBody(TifRulesRequestBody tifRulesRequestBody) {
        this.tifRulesRequestBody = tifRulesRequestBody;
    }

    public class TifRulesRequestBody {
        private String exgs;

        public String getExgs() {
            return exgs;
        }

        public void setExgs(String exgs) {
            this.exgs = exgs;
        }
    }
}
