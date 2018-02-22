/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Michele
 */
public class Servidor {
    public static void main(String[] args) {
		try {
            ServerSocket srv = new ServerSocket(7070);


            while (true) {
            	System.out.println("Servidor Conectado");
                Socket cliente = srv.accept();
                Thread t = new Thread(new TratarInteiros(cliente));
                t.start();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
	}
    
}
