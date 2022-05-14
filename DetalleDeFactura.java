import java.text.DecimalFormat;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner factura = new Scanner(System.in);
        System.out.println("                  FACTURA DE PRECIO EN NEGOCIO");
        System.out.println("");
        System.out.print("Por favor introduzca el nombre del comprador:\t" );
        String nombre= factura.nextLine();
        System.out.print("El nombre del propetario es:\t"+nombre);
        System.out.println("\n----------------------------------");
        System.out.print("Por favor introduzca el primero valor a sumar:\t");
        double num1 = factura.nextDouble() ;
        System.out.print("Por favor introduzca el segundo valor a sumar:\t");
        //imprimir solo 2 decimales df.format(variable)
        DecimalFormat df = new DecimalFormat("###.##");
        double num2 = factura.nextDouble();
        double contador = (num1 +num2);
        double itbms = contador * .19;
        double total = contador + itbms;
        System.out.println("----------------------------------");
        System.out.println("La Suma es:\t" + df.format(contador));
        System.out.println("El Ibms de la suma:\t"+ df.format(itbms));
        System.out.println("El total de su compra es:\t"+df.format(total));
        System.out.println("----------------------------------");
        System.out.println("La factura producto de oficina tiene un total bruto de   " +df.format(contador));
        System.out.print("con un impuesto de  " + df.format(itbms));
        System.out.print("  y el monto despues de impuesto es de   "+ df.format(total));
    }

}
