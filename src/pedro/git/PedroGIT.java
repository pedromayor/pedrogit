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
        
    Scanner sc =new Scanner (System.in);
       int valor;
       int valorMenor;
       
       System.out.println("Introduce un numero ");
        valor = sc.nextInt();
        valorMenor = valor;
        
        for (int i=0; i<10; i++){
        System.out.println("Introduce un numero ");
        valor = sc.nextInt();
        if (valor>valorMenor) valorMenor = valor;
        }
        
        System.out.println ("El menor no es " + valorMenor);
        
    sc.close();
    }
    
}
