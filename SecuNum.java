import java.util.Scanner;
public class SecuNum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = 0;
        System.out.println("Introduzca el valor entero: ");
        num = Integer.parseInt(reader.nextLine());
        while (num<0||num>=12){

        }
        int i, j;
        for (i=1; i<=num; i++){
            for(j=1; j<= i; j++){
                System.out.print(i+ " ");
            }
        }
    }
}
