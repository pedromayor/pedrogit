/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socketsejemplo;
import java.io.*;
import java.net.*;

/**
 *
 * @author beade
 */
public class ServerHilo extends Thread{
    
    private Socket skCliente=null;
    private int contadorCliente;
    public ServerHilo (Socket socket, int contador)
    {
        
               skCliente = socket;
               contadorCliente = contador;
        
    }
    
    
    public void run ()
    {
         try {
             // Creo los flujos de entrada y salida
     //DataInputStream flujo_entrada = new DataInputStream(skCliente.getInputStream());
     DataOutputStream flujo_salida= new DataOutputStream(skCliente.getOutputStream());

// ATENDER PETICIÓN DEL CLIENTE
     flujo_salida.writeUTF("Hola cliente "+contadorCliente);

     // Se cierra la conexión
     skCliente.close();
     System.out.println("Cliente desconectado");

     } catch( Exception e ) {
         System.out.println( e.getMessage() );
     }
    
    }
}
