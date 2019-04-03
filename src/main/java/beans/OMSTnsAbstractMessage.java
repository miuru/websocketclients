package beans;

import org.codehaus.jackson.annotate.JsonProperty;

public class OMSTnsAbstractMessage {
    @JsonProperty("HED")
    protected OMSMsgHeader omsMsgHeader;

    public OMSTnsAbstractMessage() {
        omsMsgHeader = new OMSMsgHeader();
    }


    public OMSMsgHeader getOmsMsgHeader() {
        return omsMsgHeader;
    }

    public void setOmsMsgHeader(OMSMsgHeader omsMsgHeader) {
        this.omsMsgHeader = omsMsgHeader;
    }

}
