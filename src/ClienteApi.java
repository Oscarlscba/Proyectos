import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

    public class ClienteApi {
        private static final String API_URL = "https://v6.exchangerate-api.com/v6/57b40d2976f9b910d4f21420/latest/USD";

        public String obtenerTasasDeCambio() throws IOException, InterruptedException {
            HttpClient cliente = HttpClient.newHttpClient();
            HttpRequest solicitud = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL))
                    .build();
            HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
            return respuesta.body();
        }
    }


