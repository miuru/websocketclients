package beans;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(value = "headerres", description = "header body")
public class HeaderResponse  {

    private ArrayList<CashAccountH> cashAccounts;
    private ArrayList<TradingAccount> tradingAccounts;

    public ArrayList<TradingAccount> getTradingAccounts() {
        return tradingAccounts;
    }

    public ArrayList<CashAccountH> getCashAccounts() {
        return cashAccounts;
    }

    public void setCashAccounts(ArrayList<CashAccountH> cashAccounts) {
        this.cashAccounts = cashAccounts;
    }

    public void setTradingAccounts(ArrayList<TradingAccount> tradingAccounts) {
        this.tradingAccounts = tradingAccounts;
    }

    }