/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package socketcliente;
import java.io.*;
import java.net.*;


/**
 *
 * @author profesor
 */
public class SocketCliente {

    
    static final String HOST = "127.0.0.1";
    static final int PUERTO =2000;
    
    public SocketCliente()
            {
            try{
            
                try (Socket scliente = new Socket(HOST, PUERTO)) {
                    InputStream aux=scliente.getInputStream();
                    DataInputStream flujo_entrada = new DataInputStream(aux);
                    System.out.println("Flujo entrada: "+ flujo_entrada.readUTF());
                }
                
                
            
               }catch (IOException ex)
               {
                 System.out.println(ex.getMessage());
               }
            
                
                
            
            }
            
            
            /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // TODO code application logic here
        for (int i=0; i<100; i++ )        
            new SocketCliente();
    }
    
    
}
