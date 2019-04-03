package beans;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

import java.io.IOException;

public class Response {

    public Response() {

    }

    public Object responseObject(String datResponse, int msgtype) {

        ObjectMapper objectMapper = new ObjectMapper();
        OMSMsgHeader omsMsgHeader = new OMSMsgHeader();

        switch (msgtype) {
            case 4:
                try {

                    HoldingResponse holdings = objectMapper.readValue(datResponse, HoldingResponse.class);

                    TradeUser.getSharedInstance().setHoldings(holdings.getHoldings());
                    PortFolioDataStore portFolioDataStore = new PortFolioDataStore();
                    portFolioDataStore.processPortfolioResponse(holdings);
                    TradeUser.getSharedInstance().getAuthenticationResponse();

                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case 31:
                try{
                    ExchangeRatesResponse exchangeRatesResponse = objectMapper.readValue(datResponse,ExchangeRatesResponse.class);
                    exchangeRatesResponse.getExchangeRates();
                }catch (IOException e){
                    e.printStackTrace();
                }
            case 7:
                try {
                    TifRuleResponse tifRuleResponse = objectMapper.readValue(datResponse, TifRuleResponse.class);
                    tifRuleResponse.getTifRuleSet();
                    tifRuleResponse.getExgConf();
                }catch (IOException e){
                    e.printStackTrace();
                }
            case 6:
                try {
                    HeaderResponse headerResponse = new HeaderResponse();

                    headerResponse = objectMapper.readValue(datResponse, HeaderResponse.class);

                    TradeUser.getSharedInstance().processCashResponse(headerResponse);
                    TradeUser.getSharedInstance().processHoldingresponse(headerResponse);

                    System.out.println();

                } catch (Exception e) {
                    System.out.println(e);
                }
                break;

            case 5:
                try {

                    CashAccount cashAccount = objectMapper.readValue(datResponse, CashAccount.class);

                    AccountDataStore.getSharedInstance().processCashAccountResponse(cashAccount);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;


            case 33:
                try {
                    RulesResponse rules = objectMapper.readValue(datResponse,RulesResponse.class);

                    TradeUser.getSharedInstance().setRules(rules.getRules());
                    RulesDataStore rulesDataStore = new RulesDataStore();
                    rulesDataStore.processRulesresponse(rules);
                    setTifRulesrequest();
                    setExhangeRatesRequest();
                    TradeUser.getSharedInstance().getAuthenticationResponse();


                }catch (IOException e){
                    e.printStackTrace();
                }

            case 1:
                try {
                    AuthResponse gauthResponse = objectMapper.readValue(datResponse, AuthResponse.class);

                    TradeUser.getSharedInstance().setUserID(gauthResponse.getUsrId());
                    TradeUser.getSharedInstance().setPrcUsr(gauthResponse.getPrcUsr());
                    TradeUser.getSharedInstance().setU01CustomerId(gauthResponse.getU01CustomerId());
                    TradeUser.getSharedInstance().setSessionID(omsMsgHeader.getSessionID());
                    TradeUser.getSharedInstance().setUserID(gauthResponse.getUsrId());
                    TradeUser.getSharedInstance().setLoginId(omsMsgHeader.getLoginID());
                    TradeUser.getSharedInstance().setUserCategory(gauthResponse.getUserCategory());
                    TradeUser.getSharedInstance().setCustomerName(gauthResponse.getCusNme());
                    TradeUser.getSharedInstance().setLgnExpDte(gauthResponse.getLgnExpDte());
                    TradeUser.getSharedInstance().setMaxOrderValue(gauthResponse.getFailAtmps());
                    //  TradeUser.getSharedInstance().setRouteId(gauthResponse.get);
                    TradeUser.getSharedInstance().setClientIP(omsMsgHeader.getClientIP());
                    TradeUser.getSharedInstance().setMubNo(gauthResponse.getMubNo());
                    TradeUser.getSharedInstance().setRequestType(omsMsgHeader.getRequestType());
                    TradeUser.getSharedInstance().setBlockType(gauthResponse.getBlockType());
                    TradeUser.getSharedInstance().setBlockSpread(gauthResponse.getBlockSpread());
                    //TradeUser.getSharedInstance().setUpdatePassword(gauthResponse.getUpdatePassword());
                    TradeUser.getSharedInstance().setMaxOrderValue(gauthResponse.getMaxOrderValue());
                    TradeUser.getSharedInstance().setReportDepth(gauthResponse.getReportDepth());
//                   TradeUser.getSharedInstance().setAutoUpdate(gauthResponse.getAutoUpdate());
                    TradeUser.getSharedInstance().setPwdExpDays(gauthResponse.getPwdExpDays());
                    TradeUser.getSharedInstance().setMaxPriceTolerance(gauthResponse.getMaxPriceTolerance());
//                  TradeUser.getSharedInstance().setInstitutionalService(gauthResponse.getInstitutionalService());

                    return TradeUser.getSharedInstance();

                } catch (IOException e) {
                    System.out.println("" + e);
                }
                break;

            default:
                return "";
        }
        return "";
    }

    public void setCashAccountRequest() throws IOException {
        CashRequestBean cashRequestBean = new CashRequestBean();
        CashRequestBean.CashRequestBody cashRequestBody = cashRequestBean.new CashRequestBody();
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        for (int i = 0; i < TradeUser.getSharedInstance().getCashAccountRec().size(); i++) {
            cashRequestBody.setCashAcntId(TradeUser.getSharedInstance().getCashAccountRec().get(i).getCashAccId());
            cashRequestBody.setCusId(TradeUser.getSharedInstance().getU01CustomerId());
            OMSMsgHeader omsMsgHeader = new OMSMsgHeader();
            omsMsgHeader.setChannel(1);
            omsMsgHeader.setSessionID(TradeUser.getSharedInstance().getSessionID());
            omsMsgHeader.setLoginID(TradeUser.getSharedInstance().getLoginId());
            cashRequestBody.setTradingAccountId(TradeUser.getSharedInstance().getTradingAccounts().get(i).getTradingAccId());
            omsMsgHeader.setRequestType(5);
            cashRequestBean.setOmsMsgHeader(omsMsgHeader);
            cashRequestBean.setCashRequestBody(cashRequestBody);

            String json4 = ow.writeValueAsString(cashRequestBean);
            System.out.println(json4);
            RequestHandler.getSharedInstance().addRequestToQueue(json4);
        }
    }

    public void setTifRulesrequest() throws IOException{
        TifRulesRequestBean tifRulesRequestBean = new TifRulesRequestBean();
        TifRulesRequestBean.TifRulesRequestBody tifRulesRequestBody = tifRulesRequestBean.new TifRulesRequestBody();
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        tifRulesRequestBody.setExgs("*");
        OMSMsgHeader omsMsgHeader = new OMSMsgHeader();
        omsMsgHeader.setSessionID(TradeUser.getSharedInstance().getSessionID());
        omsMsgHeader.setLoginID(TradeUser.getSharedInstance().getLoginId());
        omsMsgHeader.setRequestType(7);
        tifRulesRequestBean.setOmsMsgHeader(omsMsgHeader);
        tifRulesRequestBean.setTifRulesRequestBody(tifRulesRequestBody);


        String json2 = ow.writeValueAsString(tifRulesRequestBean);
        System.out.println(json2);
        RequestHandler.getSharedInstance().addRequestToQueue(json2);
    }
    public void setExhangeRatesRequest() throws IOException{
        ExchangeRatesRequestBean exchangeRatesRequestBean = new ExchangeRatesRequestBean();
        ExchangeRatesRequestBean.ExchangeRatesRequestBody exchangeRatesRequestBody = exchangeRatesRequestBean.new ExchangeRatesRequestBody();
        exchangeRatesRequestBody.setUserId(TradeUser.getSharedInstance().getUserID());
        OMSMsgHeader omsMsgHeader = new OMSMsgHeader();
        omsMsgHeader.setSessionID(TradeUser.getSharedInstance().getSessionID());
        omsMsgHeader.setLoginID(TradeUser.getSharedInstance().getLoginId());
        omsMsgHeader.setRequestType(31);
        exchangeRatesRequestBean.setOmsMsgHeader(omsMsgHeader);
        exchangeRatesRequestBean.setExchangeRatesRequestBody(exchangeRatesRequestBody);
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json2 = ow.writeValueAsString(exchangeRatesRequestBean);
        System.out.println(json2);
        RequestHandler.getSharedInstance().addRequestToQueue(json2);
    }
    public void setHoldingRequest() throws IOException {
        HoldingRequestBean holdingRequestBean = new HoldingRequestBean();
        HoldingRequestBean.HoldingRequestBody holdingRequestBody = holdingRequestBean.new HoldingRequestBody();
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();

        for (int i = 0; i < TradeUser.getSharedInstance().getTradingAccounts().size(); i++) {
            holdingRequestBody.setTradingAccId(TradeUser.getSharedInstance().getTradingAccounts().get(i).getTradingAccId());
            OMSMsgHeader omsMsgHeader = new OMSMsgHeader();
            omsMsgHeader.setSessionID(TradeUser.getSharedInstance().getSessionID());
            omsMsgHeader.setLoginID(TradeUser.getSharedInstance().getLoginId());
            omsMsgHeader.setClientIP(TradeUser.getSharedInstance().getClientIP());
            omsMsgHeader.setCommVer(TradeUser.getSharedInstance().getCommVer());
            omsMsgHeader.setChannel(1);

            omsMsgHeader.setRequestType(4);
            holdingRequestBean.setOmsMsgHeader(omsMsgHeader);
            holdingRequestBean.setHoldingRequestBody(holdingRequestBody);

            String json2 = ow.writeValueAsString(holdingRequestBean);
            System.out.println(json2);
            RequestHandler.getSharedInstance().addRequestToQueue(json2);
        }
    }
}
