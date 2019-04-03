package beans;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.eclipse.jetty.util.log.Logger;

import org.eclipse.jetty.websocket.api.Session;

public class RequestHandler extends Thread {

    private DataQueue dataQueue;
    private boolean isActive = true;
    private Session session = null;

    private static RequestHandler self;

    //private static final Logger logger = LogManager.getLogger(RequestHandler.class);

    private RequestHandler() {
        setName("Start RealTimeRequestHandler");
        this.dataQueue = new DataQueue();
        this.start();
    }

    public static RequestHandler getSharedInstance() {
        if (self == null) {
            self = new RequestHandler();
        }
        return self;
    }

    public void startRequestHandler(Session session) {
        this.session = session;
    }

    public void addRequestToQueue(String request) {

        dataQueue.add(request);
    }

    public void run() {
        while (isActive) {
            try {
                if (dataQueue.size() > 0 ) {
//                   AuthReqBean authReqBean = (AuthReqBean) dataQueue.pop();
//                    ObjectMapper om = new ObjectMapper();
                    String req = (String)dataQueue.pop();
//                    String req = om.writeValueAsString(authReqBean);
                    System.out.println("Before writing Request to socket :" + req);
                    session.getRemote().sendString(req);
                    session.getRemote().flush();


                } else {
                    sleep(100);
                }
            } catch (NullPointerException e) {
                System.out.println(e);
            } catch (Exception e) {
                System.out.println( e);
//                //Close all connections
//                RealTimePriceConnection.getSharedInstance().closeConnections();
//                //Notify this Disconnection to Others
//                PriceEventsStore.getSharedInstance().notifyDisconnection();

            }
        }
    }


}