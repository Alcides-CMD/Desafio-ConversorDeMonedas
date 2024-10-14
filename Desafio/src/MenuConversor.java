import java.io.IOException;
import java.util.Scanner;

public class MenuConversor {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        CalculadoraConversor conversor = new CalculadoraConversor();

        String menu = """
                ***************************************************************
                ¡Bienvenido al Conversor de moneda! Elija una de las opciones: 
                1-Peso Argentino a Dólar
                2-Dólar a Peso Argentino
                3-Peso Chileno a Dólar
                4-Dolar a Peso Chileno
                5-Dolar a Peso Colombiano
                6-Peso Colombiano a Dolar
                0-Salir 
                ****************************************************************
                """;
        while (true) {
            System.out.println(menu);
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
                break;
            }

            String monedaOrigen, monedaDestino;

            switch (opcion) {
                case 1 -> { monedaOrigen = "ARS"; monedaDestino = "USD"; }
                case 2 -> { monedaOrigen = "USD"; monedaDestino = "ARS"; }
                case 3 -> { monedaOrigen = "CLP"; monedaDestino = "USD"; }
                case 4 -> { monedaOrigen = "USD"; monedaDestino = "CLP"; }
                case 5 -> { monedaOrigen = "USD"; monedaDestino = "COP"; }
                case 6 -> { monedaOrigen = "COP"; monedaDestino = "USD"; }
                default -> {
                    System.out.println("Opción no válida.");
                    continue;
                }
            }

            System.out.printf("Ingrese la cantidad de %s que desea convertir a %s:%n", monedaOrigen, monedaDestino);
            double cantidad = scanner.nextDouble();

            double resultado = conversor.convertir(monedaOrigen, monedaDestino, cantidad);

            System.out.printf("%.2f %s equivale a %.2f %s%n", cantidad, monedaOrigen, resultado, monedaDestino);
        }
        scanner.close();
    }
}