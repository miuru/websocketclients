package beans;

import org.codehaus.jackson.annotate.JsonProperty;

public class CashRequestBean extends OMSTnsAbstractMessage  {
    @JsonProperty(value = "DAT")
    private CashRequestBody cashRequestBody;

    public CashRequestBody getCashRequestBody() {
        return cashRequestBody;
    }

    public void setCashRequestBody(CashRequestBody cashRequestBody) {
        this.cashRequestBody = cashRequestBody;
    }
    public class CashRequestBody{

        private int tradingAccountId;
        private String cashAcntId;
        private int cusId;

        public int getTradingAccountId() {
            return tradingAccountId;
        }

        public void setTradingAccountId(int tradingAccountId) {
            this.tradingAccountId = tradingAccountId;
        }

        public String getCashAcntId() {
            return cashAcntId;
        }

        public void setCashAcntId(String cashAcntId) {
            this.cashAcntId = cashAcntId;
        }

        public int getCusId() {
            return cusId;
        }

        public void setCusId(int cusId) {
            this.cusId = cusId;
        }
    }
}
