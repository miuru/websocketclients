package beans;

import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(value = "holding", description = "holding body")
public class HoldingResponse {

    private ArrayList<PortfolioRecords> holdings = new ArrayList<PortfolioRecords>();

    public HoldingResponse() {

    }

    public void setHoldings(ArrayList<PortfolioRecords> holdings) {
        this.holdings = holdings;
    }


    public ArrayList<PortfolioRecords> getHoldings() {
        return holdings;
    }
}
