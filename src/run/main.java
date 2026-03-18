package run;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        int num=0;
        try {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Dime un numero", "Tabla de multiplicacion", JOptionPane.INFORMATION_MESSAGE));
            String tabla = "Tabla de multiplicacion";
            for (int i = 1; i <= 12; i++) {
                tabla += "\n " + i + " * " + num + " = " + (num * i) + "\n";
            }
            JOptionPane.showMessageDialog(null, tabla, "Tabla de multiplicacion", JOptionPane.WARNING_MESSAGE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al ingresar numero","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }

    }
}
