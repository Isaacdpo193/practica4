/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double dolar = 17;
    double euro = 18.29;
    Scanner lecturaDatos = new Scanner(System.in);
    System.out.println("Ingrese cantidad en peso");
    double pesos = lecturaDatos.nextInt();
    double totalDolares = pesos/dolar;
    System.out.println("La cantidad en dolares es;"+totalDolares);
    double totalEuros = pesos/euro;
    System.out.println("La cantidad en euros es;"+totalEuros);
    }
    
}
