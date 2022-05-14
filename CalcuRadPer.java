import java.util.Scanner;
public class CalcuRadPer {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int r=0 ;
        System.out.println("Por favor introduzca el numero del radio: ");
        r = Integer.parseInt(reader.nextLine());
        double AreaCircu= (3.1416) * (r*r);
        double PeriCircu= 2* (3.1416) * r;
        System.out.println("El radio es: " + "   "+ r);
        System.out.println("El area de la circunferencia es: " + "   "+ AreaCircu);
        System.out.println("El perimetro de la circunferencia es: " + "   " + PeriCircu);
    }
}
