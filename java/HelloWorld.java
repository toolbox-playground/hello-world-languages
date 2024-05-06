import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        HttpServer server = HttpServer.create(new java.net.InetSocketAddress(port), 0);
        server.createContext("/", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
        System.out.println("Agora escutando em: http://localhost:" + port);
    }

    static class MyHandler implements HttpHandler {
        // @Override
        // public void handle(HttpExchange exchange) throws IOException {
        //     String response = "Hello, World!";
        //     exchange.sendResponseHeaders(200, response.getBytes().length);
        //     OutputStream os = exchange.getResponseBody();
        //     os.write(response.getBytes());
        //     os.close();
        // }
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "";
            try {
                response = new String(Files.readAllBytes(Paths.get("index.html")));
            } catch (IOException e) {
                e.printStackTrace();
                response = "Error loading HTML file";
            }

            exchange.sendResponseHeaders(200, response.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }

    }
}
