import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        int integrantes = 3;
        System.out.print("Cuantos integrantes hay en tu familia\t"+ integrantes);
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nEl primer mienbro de la familia es:\t");
        String nombre1 = entrada.nextLine();
        String nombre1b = nombre1.toUpperCase().charAt(1)+ "." +nombre1.substring(nombre1.length()-2);

        System.out.println("El segundo mienbro de la familia es:\t");
        String nombre2 = entrada.nextLine();
        String nombre2b = nombre2.toUpperCase().charAt(1)+ "." +nombre2.substring(nombre2.length()-2);

        System.out.println("El tercer mienbro de la familia es:\t");
        String nombre3 = entrada.nextLine();
        String nombre3b = nombre3.toUpperCase().charAt(1)+"." + nombre3.substring(nombre3.length()-2);

String resultSalida = nombre1b +"_"+nombre2b+"_"+nombre3b;
        System.out.println("resultado final de nombres:\t"+resultSalida);
    }
}
