package beans;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TradingAccount  {

    private String tradingAccName;
    private int isDefault;
    private int routeId;
    private String exchange;
    private String cashAccountId;
    private int tradingAccId;

    public String getTradingAccName() {
        return tradingAccName;
    }

    public void setTradingAccName(String tradingAccName) {
        this.tradingAccName = tradingAccName;
    }

    public int getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getCashAccountId() {
        return cashAccountId;
    }

    public void setCashAccountId(String cashAccountId) {
        this.cashAccountId = cashAccountId;
    }

    public int getTradingAccId() {
        return tradingAccId;
    }

    public void setTradingAccId(int tradingAccId) {
        this.tradingAccId = tradingAccId;
    }
}
