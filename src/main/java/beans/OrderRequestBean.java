package beans;

import org.codehaus.jackson.annotate.JsonProperty;

public class OrderRequestBean extends OMSTnsAbstractMessage {

    @JsonProperty(value = "DAT")
    protected OrderRequestBody orderRequestBody;

    public OrderRequestBody getOrderRequestBody() {
        return orderRequestBody;
    }

    public void setOrderRequestBody(OrderRequestBody orderRequestBody) {
        this.orderRequestBody = orderRequestBody;
    }

    public class OrderRequestBody {
        private int cusId;
        private int tradingAccId;
        private int symbol;
        private String exg;
        private int ordTyp;
        private int ordSide;
        private int ordQty;
        private int tif;
        private int disQty;
        private int minQty;
        private int price;
        private int dayOrd;
        private int instruTpe;
        private long expdate;
        private String bkId;
        private String marketCode;

        public int getTradingAccId() {
            return tradingAccId;
        }

        public void setTradingAccId(int tradingAccId) {
            this.tradingAccId = tradingAccId;
        }

        public int getSymbol() {
            return symbol;
        }

        public void setSymbol(int symbol) {
            this.symbol = symbol;
        }

        public String getExg() {
            return exg;
        }

        public void setExg(String exg) {
            this.exg = exg;
        }

        public int getOrdTyp() {
            return ordTyp;
        }

        public void setOrdTyp(int ordTyp) {
            this.ordTyp = ordTyp;
        }

        public int getOrdSide() {
            return ordSide;
        }

        public void setOrdSide(int ordSide) {
            this.ordSide = ordSide;
        }

        public int getOrdQty() {
            return ordQty;
        }

        public void setOrdQty(int ordQty) {
            this.ordQty = ordQty;
        }

        public int getTif() {
            return tif;
        }

        public void setTif(int tif) {
            this.tif = tif;
        }

        public int getDisQty() {
            return disQty;
        }

        public void setDisQty(int disQty) {
            this.disQty = disQty;
        }

        public int getMinQty() {
            return minQty;
        }

        public void setMinQty(int minQty) {
            this.minQty = minQty;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getDayOrd() {
            return dayOrd;
        }

        public void setDayOrd(int dayOrd) {
            this.dayOrd = dayOrd;
        }

        public int getInstruTpe() {
            return instruTpe;
        }

        public void setInstruTpe(int instruTpe) {
            this.instruTpe = instruTpe;
        }

        public long getExpdate() {
            return expdate;
        }

        public void setExpdate(long expdate) {
            this.expdate = expdate;
        }

        public String getBkId() {
            return bkId;
        }

        public void setBkId(String bkId) {
            this.bkId = bkId;
        }

        public String getMarketCode() {
            return marketCode;
        }

        public void setMarketCode(String marketCode) {
            this.marketCode = marketCode;
        }

        public int getCusId() {
            return cusId;
        }

        public void setCusId(int cusId) {
            this.cusId = cusId;
        }
    }
}