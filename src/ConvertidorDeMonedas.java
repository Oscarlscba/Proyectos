import com.google.gson.Gson;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class ConvertidorDeMonedas {
    private ClienteApi clienteApi;
    private Gson gson;

    public ConvertidorDeMonedas() {
        this.clienteApi = new ClienteApi();
        this.gson = new Gson();
    }

    public void convertir() throws IOException, InterruptedException {
        System.out.println("Bienvenido al Conversor de Monedas");

        String respuestaJson = clienteApi.obtenerTasasDeCambio();
        RespuestaTasasDeCambio respuesta = gson.fromJson(respuestaJson, RespuestaTasasDeCambio.class);

        Map<String, Double> tasas = respuesta.getTasasDeConversion();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione la moneda de origen:");
            System.out.println("1. ARS - Peso argentino");
            System.out.println("2. BOB - Boliviano boliviano");
            System.out.println("3. BRL - Real brasileño");
            System.out.println("4. CLP - Peso chileno");
            System.out.println("5. COP - Peso colombiano");
            System.out.println("6. USD - Dólar estadounidense");
            System.out.println("7. Salir");

            int opcionOrigen = scanner.nextInt();
            String monedaOrigen = obtenerMoneda(opcionOrigen);

            if (monedaOrigen == null) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.println("Seleccione la moneda de destino:");
            System.out.println("1. ARS - Peso argentino");
            System.out.println("2. BOB - Boliviano boliviano");
            System.out.println("3. BRL - Real brasileño");
            System.out.println("4. CLP - Peso chileno");
            System.out.println("5. COP - Peso colombiano");
            System.out.println("6. USD - Dólar estadounidense");
            System.out.println("7. Salir");

            int opcionDestino = scanner.nextInt();
            String monedaDestino = obtenerMoneda(opcionDestino);

            if (monedaDestino == null) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.println("Ingrese la cantidad a convertir:");
            double cantidad = scanner.nextDouble();

            Double tasaOrigen = tasas.get(monedaOrigen);
            Double tasaDestino = tasas.get(monedaDestino);

            if (tasaOrigen != null && tasaDestino != null) {
                double resultado = cantidad * (tasaDestino / tasaOrigen);
                System.out.printf("%.2f %s son %.2f %s%n", cantidad, monedaOrigen, resultado, monedaDestino);
            } else {
                System.out.println("Moneda no soportada.");
            }
        }
    }

    private String obtenerMoneda(int opcion) {
        switch (opcion) {
            case 1:
                return "ARS";
            case 2:
                return "BOB";
            case 3:
                return "BRL";
            case 4:
                return "CLP";
            case 5:
                return "COP";
            case 6:
                return "USD";
            case 7:
                return null;
            default:
                System.out.println("Opción no válida.");
                return null;
        }
    }
}
