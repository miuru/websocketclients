package beans;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility= JsonAutoDetect.Visibility.NONE, setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class HoldingRequestBean extends OMSTnsAbstractMessage {

    @JsonProperty(value = "DAT")
    protected HoldingRequestBody holdingRequestBody;

    public HoldingRequestBody getHoldingRequestBody() {
        return holdingRequestBody;
    }


    public void setHoldingRequestBody(HoldingRequestBody holdingRequestBody) {
         this.holdingRequestBody = holdingRequestBody;
    }

    public class HoldingRequestBody {
        private int tradingAccId;

        public int getTradingAccId() {
            return tradingAccId;
        }

        public void setTradingAccId(int tradingAccId) {
            this.tradingAccId = tradingAccId;
        }
    }
}
