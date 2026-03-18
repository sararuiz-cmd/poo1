import javax.swing.*;

public class Ejercicio2 {
    static void main() {
        int inicio=Integer.parseInt(JOptionPane.showInputDialog(null,"Dime un numero:"));
        int fin=Integer.parseInt(JOptionPane.showInputDialog(null,"Dime otro numero:"));
        int i=inicio;
        String texto="";
        while (i<fin){
           if(i%2==0){
               texto+=i+"\n";
           }
        }
        JOptionPane.showMessageDialog(null,texto);
    }
}
