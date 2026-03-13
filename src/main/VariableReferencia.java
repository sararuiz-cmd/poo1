package main;

import org.w3c.dom.xpath.XPathResult;

import javax.swing.*;
import java.util.Scanner;

public class VariableReferencia {
    public static void main(String[] args) {
        //Scanner leer=new Scanner(System.in);
        //System.out.println("Dime tu nombre:");
        //String nombre=leer.nextLine();
        //System.out.println("Hola "+ nombre);
        String nombre= JOptionPane.showInputDialog("Dime tu nombre: ");
        String mensaje="Hola "+ nombre;

        JOptionPane.showMessageDialog(null,mensaje+", bienvenido a la uam");
    }
}
