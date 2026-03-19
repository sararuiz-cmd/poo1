import javax.swing.*;

public class Ejercicio2 {
    static void main() {
        int inicio = Integer.parseInt(JOptionPane.showInputDialog(null, "Dime un numero:"));
        int fin = Integer.parseInt(JOptionPane.showInputDialog(null, "Dime otro numero:"));

        int i = inicio;
        String texto = "";

        while (i <= fin) {
            if (i % 2 == 0) {
                String pasos="";
                int factorial = 1;

                for (int j = 1; j <= i; j++) {
                    factorial *= j;
                    if(j>1){
                        pasos+=factorial+",";
                    }
                }

                texto += i + ": " + pasos + "\n";
            }
            i++;
        }

        JOptionPane.showMessageDialog(null,texto);
    }
}
