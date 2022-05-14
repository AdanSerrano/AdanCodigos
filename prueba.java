public class prueba{

    public static void main(String[] args) {
        // Nuestro texto de ejemplo
        String texto = "¡Hola Mundo!";

        // Dividimos nuestro texto por el espacio
        String[] resultadoSplit = texto.split("   ");

        // Mostramos el resultado en consola
        for (String itemSplit : resultadoSplit) {
            System.out.print(itemSplit);
        }
    }
}
