import javax.swing.*;

public class NombreExtensoConJOption {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog(null, "Ingresa el primer nombre completo");


        String nombre2 = JOptionPane.showInputDialog(null, "Ingresa el segundo nombre completo");


        String nombre3 = JOptionPane.showInputDialog(null, "Ingresa el tercer nombre completo");

        if (nombre1.length() > nombre2.length() && nombre1.length() > nombre3.length()) {
        JOptionPane.showMessageDialog(null, "El nombre mas largo es\t"+nombre1);

        } else if (nombre2.length() > nombre1.length() && nombre2.length() > nombre3.length()){
            JOptionPane.showMessageDialog(null,"El nombre mas largo es\t"+ nombre2);


        }else if (nombre3.length() > nombre2.length() && nombre3.length() > nombre1.length());
        JOptionPane.showMessageDialog(null, "El nombre mas largo es\t"+ nombre3);

    }
}