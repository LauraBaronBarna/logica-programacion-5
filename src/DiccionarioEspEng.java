import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class DiccionarioEspEng {

    public static void main(String[] args) {
        // Crear diccionario Español-Inglés
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("Hola", "Hello");
        diccionario.put("Casa", "House");
        diccionario.put("Familia", "Family");
        diccionario.put("Cielo", "Sky");
        diccionario.put("Gato", "Cat");
        diccionario.put("País", "Country");
        diccionario.put("Cocina", "Kitchen");
        diccionario.put("Luz", "Light");
        diccionario.put("Libro", "Book");
        diccionario.put("Celular", "Cellphone");
        diccionario.put("Comida", "Food");
        diccionario.put("Estrella", "Star");
        diccionario.put("Tortuga", "Turtle");
        diccionario.put("Arte", "Art");
        diccionario.put("Música", "Music");
        diccionario.put("Cama", "Bed");
        diccionario.put("Agua", "Water");
        diccionario.put("Vela", "Candle");
        diccionario.put("Ventana", "Window ");

        String[] palabrasEsp = seleccionarPalabrasAleatorias(diccionario, 5);

        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        for (String palabraEsp : palabrasEsp) {
            System.out.print("Traducción de: " + palabraEsp + "a inglés ");
            String palabraPorTraducir = scanner.nextLine();

            if (diccionario.containsKey(palabraEsp) && diccionario.get(palabraEsp).equalsIgnoreCase(palabraPorTraducir)) {
                System.out.println("Respuesta correcta");
                respuestasCorrectas++;
            } else {
                System.out.println("Error. La respuesta correcta es: " + diccionario.get(palabraEsp));
                respuestasIncorrectas++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

        scanner.close();
    }

    private static String[] seleccionarPalabrasAleatorias(Map<String, String> diccionario, int cantidad) {
        Random random = new Random();
        String[] palabrasEspanol = diccionario.keySet().toArray(new String[0]);
        String[] palabrasSeleccionadas = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            int indiceAleatorio = random.nextInt(palabrasEspanol.length);
            palabrasSeleccionadas[i] = palabrasEspanol[indiceAleatorio];
        }

        return palabrasSeleccionadas;
    }
}
