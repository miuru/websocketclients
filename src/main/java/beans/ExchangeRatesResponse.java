package beans;

import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(value = "ExchangeRates", description = "ExchangeRates body")
public class ExchangeRatesResponse {
    private ArrayList<ExchangeRates> rates= new ArrayList<ExchangeRates>();

    public ExchangeRatesResponse() {

    }

    public void setExchangeRates(ArrayList<ExchangeRates> rates) {
        this.rates =rates;
    }


    public ArrayList<ExchangeRates> getExchangeRates() {
        return rates;
    }
}
