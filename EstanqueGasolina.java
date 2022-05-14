import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        Scanner estanque = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de gasolina que tiene el estanque\nEL TANQUE TIENE UNA CAPACIDAD DE 70 LT");
        double litros = estanque.nextDouble();

        while (litros > 70) {
            System.out.println("Ingrese el valor nuevamente");
            litros = estanque.nextDouble();
        }
        if (litros == 70) {
            System.out.println("Estanque lleno");
        } else {
            if (litros >= 60 && litros < 70) {
                System.out.println("estanque casi lleno");
            } else {
                if (litros >= 40 && litros < 60) {
                    System.out.println("Estanque  3/4");
                } else {
                    if (litros >= 35 && litros < 40) {
                        System.out.println("Medio Estanque ");
                    } else {
                        if (litros >= 20 && litros < 35) {
                            System.out.println("Suficiente");
                        } else {
                            if (litros >= 1 && litros < 20) {
                                System.out.println("Insuficiente");
                            }
                        }
                    }
                }
            }
        }
    }
}
