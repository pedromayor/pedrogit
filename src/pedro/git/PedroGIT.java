/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedro.git;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class PedroGIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc =new Scanner (System.in);
       int valor;
       int valorMayor;
       
       System.out.println("Introduce un numero ");
        valor = sc.nextInt();
        valorMayor = valor;
        
        for (int i=0; i<1; i++){
        System.out.println("Introduce un numero ");
        valor = sc.nextInt();
        if (valor>valorMayor) valorMayor = valor;
        }
        
        System.out.println ("El mayor es " + valorMayor);
        
    sc.close();
    }
    
}
