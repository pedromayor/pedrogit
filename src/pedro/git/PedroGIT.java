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
      //parece q todo esta muy bien 
    Scanner sc =new Scanner (System.in);
       int nota;
       int notaMenor;
       
       System.out.println("Introduce un numero ");
        nota = sc.nextInt();
        notaMenor = nota;
        
        for (int i=0; i<10; i++){
        System.out.println("Introduce un numero ");
        nota = sc.nextInt();
        if (nota>notaMenor) notaMenor = nota;
        }
        
        System.out.println ("El menor no es " + notaMenor);
        
    sc.close();
    }
    
}
