import javax.swing.*;
import java.util.Scanner;

public class Prueba {
    public static void main (String[] args) {
        //declarar edad
        Scanner Leer = new Scanner(System.in); // para imprimir algo ingresado por el usuario
        System.out.println("Introduzca un valor decimal:  ");
        double a= Leer.nextDouble();
        System.out.println("El numero decimal es:  "+ a );
        //double a= Leer.nextDouble();
        Scanner Edad = new Scanner(System.in);
        System.out.println("Ingrese su edad:  ");
        int b= Edad.nextInt();
        System.out.println("Mi edad es: " + b);
        double variable = 2.56;
        System.out.println("MI estatura es: "+ variable);
        //char
        char Sexo = 'M';
        System.out.println("El sexo es: "+Sexo);
        //ASCII
        char simbolo2= 38;
        System.out.println("El caracter es: "+ simbolo2);
        //unicode
        char simbolo3 = '\u0030';
        System.out.println("El caracter es: "+ simbolo3);
        //caracteres que podamos usar
        /* char SaltoDeLinea = '\n';
        char Retroceso= '\b';
        char Tabulador = '\t';
        char PrincipioDeLinea = '\r';
        char NuevaPag= '\f';
        char Comillas = '\"';
        char ComillasSimple = '\'';
        char BarraImbersa = '\\';*/

        // ejemplo de tipo de caracter boolean
           boolean condicion = false;
        boolean Verificar  = 6==3*4;
        System.out.println(Verificar);

        //Imprimir un numero entero ingresado por el usuario
        //metodo ventana de dialogo
        String Num = JOptionPane.showInputDialog(null, "Ingrese el valor del número");
        int NumeroReal = Integer.parseInt(Num);
        System.out.println("Nuestro numero es: "+ NumeroReal);
        //convertir a binario
        String  NumBin=Integer.toBinaryString(NumeroReal);
        System.out.println("Numero en binaro: "+ NumBin);
        //System.out.println("Numero en binaro escrito en java: "+ NumBin );//0b prefijo para binario
        //numero en hexadeximal
        System.out.println("Numero en hexadecimal: " + Integer.toHexString(NumeroReal));
        //System.out.println("Numero en hexadecimal escrito en java: " + 0x2c); //0x prefijo para hexadecimal
        //Numero en Octal
        System.out.println("Numero en octal: "+ Integer.toOctalString(NumeroReal));
        //System.out.println("Numero en octal escrito en java: "+ 0702);// 0 prefijo para octal
        String Resultados ="Nuestro numero es: "+ NumeroReal+"\nNumero en binaro: "+ NumBin + "'\n'Numero en hexadecimal: " + Integer.toHexString(NumeroReal)+"'\n'Numero en octal: "+ Integer.toOctalString(NumeroReal);
        JOptionPane.showMessageDialog(null, Resultados);
        System.out.println();

    }
}