import java.io.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import beans.*;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;

@WebSocket()
public class SimpleEchoSocket {
    private final CountDownLatch closeLatch;
    @SuppressWarnings("unused")
    private Session session;
    private String responseData =null;


    public SimpleEchoSocket() {
        this.closeLatch = new CountDownLatch(1);
    }

    public boolean awaitClose(int duration, TimeUnit unit) throws InterruptedException {
        return this.closeLatch.await(duration, unit);
    }

    @OnWebSocketClose
    public void onClose(int statusCode, String reason) {
        System.out.printf("Connection closed: %d - %s%n", statusCode, reason);
        this.session = null;
        this.closeLatch.countDown(); // trigger latch
    }

    @OnWebSocketConnect
    public void onConnect(Session session) {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        if(!TradeUser.getSharedInstance().isAuthenticated() && !TradeUser.getSharedInstance().isTradeAuthenticated());{
        System.out.printf("Got connect: %s%n", session);
        System.out.println("Socket Connected: " + session);
        this.session = session;
        }
        try {

            OMSMsgHeader omsMsgHeader = new OMSMsgHeader();

            if(!TradeUser.getSharedInstance().isAuthenticated() && !TradeUser.getSharedInstance().isTradeAuthenticated()) {
                AuthReqBean authReqBean = new AuthReqBean();
                AuthReqBean.AuthRequest authReq = authReqBean.new AuthRequest();
                authReq.setLgnNme("test");
                authReq.setPwd("a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3");
                authReqBean.setAuthRequest(authReq);
                String json1 = ow.writeValueAsString(authReqBean);
                System.out.println(json1);
                RequestHandler.getSharedInstance().startRequestHandler(session);
                RequestHandler.getSharedInstance().addRequestToQueue(json1);
            }

            if(TradeUser.getSharedInstance().isAuthenticated()) {

                HeaderReqBean headerReqBean = new HeaderReqBean();
                HeaderReqBean.HeaderRequestBody headerRequestBody = headerReqBean.new HeaderRequestBody();
                omsMsgHeader.setRequestType(6);
                headerRequestBody.setCusId(TradeUser.getSharedInstance().getU01CustomerId());
                omsMsgHeader.setSessionID(TradeUser.getSharedInstance().getSessionID());
                headerReqBean.setHeaderRequestBody(headerRequestBody);
                omsMsgHeader.setLoginID(TradeUser.getSharedInstance().getLoginId());
                headerReqBean.setOmsMsgHeader(omsMsgHeader);

                String json3 = ow.writeValueAsString(headerReqBean);
                System.out.println(json3);
                RequestHandler.getSharedInstance().addRequestToQueue(json3);
//
//                if(TradeUser.getSharedInstance().isTradeAuthenticated()) {
//                    CashRequestBean cashRequestBean = new CashRequestBean();
//                    CashRequestBean.CashRequestBody cashRequestBody = cashRequestBean.new CashRequestBody();
//
//                    for (int i = 0; i < TradeUser.getSharedInstance().getCashAccountRec().size(); i++) {
//                        cashRequestBody.setCashAcntId(TradeUser.getSharedInstance().getCashAccountRec().get(i).getCashAccId());
//                        cashRequestBody.setCusId(TradeUser.getSharedInstance().getUserID());
//                        omsMsgHeader.setChannel(1);
//                        cashRequestBody.setTradingAccountId(TradeUser.getSharedInstance().getTradingAccounts().get(i).getTradingAccId());
//                        omsMsgHeader.setRequestType(5);
//                        cashRequestBean.setOmsMsgHeader(omsMsgHeader);
//                        cashRequestBean.setCashRequestBody(cashRequestBody);
//
//                        String json4 = ow.writeValueAsString(cashRequestBean);
//                        System.out.println(json4);
//                        RequestHandler.getSharedInstance().addRequestToQueue(json4);
//
//                    }
//                }
////                HoldingRequestBean holdingRequestBean = new HoldingRequestBean();
////                HoldingRequestBean.HoldingRequestBody holdingRequestBody = holdingRequestBean.new HoldingRequestBody();
////                omsMsgHeader.setRequestType(4);
//
//                holdingRequestBody.setTradingAccId(64);
//                omsMsgHeader.setSessionID(TradeUser.getSharedInstance().getSessionID());
//                omsMsgHeader.setChannel(1);
//                omsMsgHeader.setLoginID(TradeUser.getSharedInstance().getLoginId());
//                omsMsgHeader.setClientIP(TradeUser.getSharedInstance().getClientIP());
//                omsMsgHeader.setCommVer(TradeUser.getSharedInstance().getCommVer());
//                holdingRequestBean.setOmsMsgHeader(omsMsgHeader);
//                holdingRequestBean.setHoldingRequestBody(holdingRequestBody);
//
//                String json2 = ow.writeValueAsString(holdingRequestBean);
//                System.out.println(json2);

                RulesRequestBean rulesRequestBean = new RulesRequestBean();
                RulesRequestBean.RulesRequestBody rulesRequestBody = rulesRequestBean.new RulesRequestBody();
                omsMsgHeader.setRequestType(33);
                rulesRequestBean.setOmsMsgHeader(omsMsgHeader);
                rulesRequestBody.setClientTypeId(0);
                rulesRequestBean.setRulesRequestBody(rulesRequestBody);

                String json6 = ow.writeValueAsString(rulesRequestBean);
                System.out.println(json6);
                RequestHandler.getSharedInstance().addRequestToQueue(json6);

                SubRequestBean subRequestBean = new SubRequestBean();
                SubRequestBean.SubRequestBody subRequestBody = subRequestBean.new SubRequestBody();
                subRequestBody.setService(302);
                omsMsgHeader.setRequestType(200);
                subRequestBean.setSubRequestBody(subRequestBody);
                subRequestBean.setOmsMsgHeader(omsMsgHeader);

                String json5 = ow.writeValueAsString(subRequestBean);
                System.out.println(json5);
                RequestHandler.getSharedInstance().addRequestToQueue(json5);

                OrderRequestBean orderRequestBean = new OrderRequestBean();
                OrderRequestBean.OrderRequestBody orderRequestBody = orderRequestBean.new OrderRequestBody();
                omsMsgHeader.setRequestType(2);
                omsMsgHeader.setSessionID(TradeUser.getSharedInstance().getSessionID());
                omsMsgHeader.setLoginID(TradeUser.getSharedInstance().getLoginId());
                orderRequestBean.setOmsMsgHeader(omsMsgHeader);
                orderRequestBody.setTradingAccId(3931);
                orderRequestBody.setSymbol(1010);
                orderRequestBody.setExg("TDWL");
                orderRequestBody.setOrdTyp(2);
                orderRequestBody.setCusId(421);
                orderRequestBody.setOrdSide(1);
                orderRequestBody.setOrdQty(100);
                orderRequestBody.setTif(0);
                orderRequestBody.setDisQty(0);
                orderRequestBody.setMinQty(0);
                orderRequestBody.setPrice(13);
                orderRequestBody.setDayOrd(0);
                orderRequestBody.setInstruTpe(0);
                orderRequestBody.setExpdate(20171108);
                orderRequestBody.setBkId("");
                orderRequestBody.setMarketCode("ALL");
                orderRequestBean.setOrderRequestBody(orderRequestBody);


                String json7 = ow.writeValueAsString(orderRequestBean);
                System.out.println(json7);
                RequestHandler.getSharedInstance().addRequestToQueue(json7);


            }


            //  session.close(StatusCode.NORMAL, "I'm done");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }




    @OnWebSocketMessage
    public void onMessage(String msg) throws IOException {
        OMSMsgHeader omsMsgHeader = new OMSMsgHeader();
        String[] data = new String[2];

        if (msg.length() > 2) {
            msg = msg.substring(1, msg.length());
            data = msg.split("\"DAT\":");
            data[0] = data[0].replace("\"HED\":", "");
            data[0] = data[0].concat(",");

        }
        // Header = javaScriptSerializer.Deserialize<JSONHeader>(data[0]);
        String response = data[0] + data[1];
        String respo = data[0];
        responseData = data[1];

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Response response1 = new Response();
            omsMsgHeader = objectMapper.readValue(respo, OMSMsgHeader.class);
            response1.responseObject(responseData,omsMsgHeader.getRequestType());

            TradeUser.getSharedInstance().setSessionID(omsMsgHeader.getSessionID());
            TradeUser.getSharedInstance().setLoginId(omsMsgHeader.getLoginID());

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("response::" + msg);
        System.out.println("##############################");

        if (!TradeUser.getSharedInstance().isAuthenticated() && !TradeUser.getSharedInstance().isTradeAuthenticated()){
            TradeUser.getSharedInstance().setAuthenticated(true);
            onConnect(session);
    }

    }

}
