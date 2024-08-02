import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientMain {
    public static void main(String[] args) {
        String host = "127.0.0.1";
        int port = 8080;
        try (Socket clirntSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clirntSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clirntSocket.getInputStream()))) {
            out.println("Igor");
            String resp = in.readLine();
            System.out.println(resp);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
