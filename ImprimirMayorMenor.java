import java.util.Scanner;

public class ImprimirMayorMenor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: \t");
        int num1 = s.nextInt();

        System.out.print("Ingrese el segundo numero: \t");
        int num2 = s.nextInt();
        System.out.println("");
        System.out.println("Numeros ordenados de mayor a menor");


       if (num1 > num2){
           System.out.println( "Numero mayor:\t"+num1 + "\n"+"Numero menor:\t"+num2);
       } else {
           if (num2  > num1){
               System.out.println("Numero mayor:\t"+num2+ "\n"+"Numero menor:\t"+ num1);
           }
       }
    }
}
