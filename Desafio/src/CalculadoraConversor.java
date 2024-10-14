import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CalculadoraConversor {
    private final String API_KEY = "13c8239b6bb68e8d4de0beb8";
    private JsonObject tasasCambio;

    public CalculadoraConversor() throws IOException, InterruptedException {
        actualizarTasas();
    }

    private void actualizarTasas() throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/USD";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(response.body(), JsonObject.class);
        this.tasasCambio = jsonObject.getAsJsonObject("conversion_rates");
    }

    public double convertir(String monedaOrigen, String monedaDestino, double cantidad) {
        double tasaOrigen = tasasCambio.get(monedaOrigen).getAsDouble();
        double tasaDestino = tasasCambio.get(monedaDestino).getAsDouble();
        return cantidad * (tasaDestino / tasaOrigen);
    }
}