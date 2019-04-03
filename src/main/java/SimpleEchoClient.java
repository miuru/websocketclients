
import java.net.URI;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.websocket.client.ClientUpgradeRequest;
import org.eclipse.jetty.websocket.client.WebSocketClient;

public class SimpleEchoClient {
    private static boolean isConnected;

    public static void main(String[] args)
        {
            WebSocketClient client = new WebSocketClient();
            SimpleEchoSocket socket = new SimpleEchoSocket();

            try
            {
                client.start();

                URI uri = new URI("ws://192.168.14.214:9080/streaming-api");
                ClientUpgradeRequest request = new ClientUpgradeRequest();
                client.connect(socket,uri,request);
                System.out.printf("Connecting to : %s%n",uri);
                isConnected=client.isStarted();
                socket.awaitClose(500000,TimeUnit.HOURS);

            }
            catch (Throwable t)
            {
                t.printStackTrace();
            }
        finally
        {
            try
            {
                client.stop();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
