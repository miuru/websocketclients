package beans;

import org.codehaus.jackson.annotate.JsonProperty;

public class ExchangeRatesRequestBean extends OMSTnsAbstractMessage  {
    @JsonProperty(value = "DAT")
    private ExchangeRatesRequestBody exchangeRatesRequestBody;

    public ExchangeRatesRequestBody getExchangeRatesRequestBody() {
        return exchangeRatesRequestBody;
    }

    public void setExchangeRatesRequestBody(ExchangeRatesRequestBody exchangeRatesRequestBody) {
        this.exchangeRatesRequestBody = exchangeRatesRequestBody;
    }
    public class ExchangeRatesRequestBody{

        private int userId;

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }
    }
}
