/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package psp4;

/**
 *
 * @author Pedro
 */
import java.io.*;

import java.net.*;

public class ServidorConTresClientes {

    static final int Puerto = 2000;

    public ServidorConTresClientes() {

        try {

            ServerSocket sServidor = new ServerSocket(Puerto);

            System.out.println("Escucho el puerto " + Puerto);

            for (int nCli = 0; nCli < 3; nCli++) {

                Socket sCliente = sServidor.accept();

                System.out.println("Sirvo al cliente " + nCli);

                DataOutputStream flujo_salida = new DataOutputStream(sCliente.getOutputStream());

                flujo_salida.writeUTF("Hola cliente " + nCli);

                sCliente.close();

            }

            System.out.println("Se han atendido los clientes");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    public static void main(String[] arg) {

        new ServidorConTresClientes();

    }

}
