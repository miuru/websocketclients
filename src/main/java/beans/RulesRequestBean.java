package beans;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility= JsonAutoDetect.Visibility.NONE, setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class RulesRequestBean extends OMSTnsAbstractMessage {

    @JsonProperty(value = "DAT")
    protected RulesRequestBody rulesRequestBody;

    public RulesRequestBody getRulesRequestBody() {
        return rulesRequestBody;
    }


    public void setRulesRequestBody(RulesRequestBody rulesRequestBody) {
        this.rulesRequestBody = rulesRequestBody;
    }

    public class RulesRequestBody {
        private int clientTypeId;

        public int getClientTypeId() {
            return clientTypeId;
        }

        public void setClientTypeId(int clientTypeId) {
            this.clientTypeId = clientTypeId;
        }
    }
}
