/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Teclea tarifa: ");
        double tarifa = sc.nextDouble();
        System.out.print("Teclea pagado: ");
        double pagado = sc.nextDouble();
        System.out.println("\nO porcentaxe de desconto da compra é "+(tarifa*pagado/100)+" %");
    }
    
}
