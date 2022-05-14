import java.util.Scanner;

public class CalcKilo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double kg=0;
        while (kg<=0){
            System.out.println("ingrese una medida en kg (kilogramos) para la conversion: ");
            kg = Integer.parseInt(reader.nextLine());
        }
        double tonel;
        tonel= kg / 1000.00;
        double oz;
        oz = kg * 35.2740;
        double lb;
        lb = kg * 2.2046;
        System.out.println("Unidad a convertir: "+ kg + "   kilogramos");
        System.out.println("tonelada: "+ tonel);
        System.out.println("onzas: "+ oz);
        System.out.println("Libras: "+ lb);
    }
}
