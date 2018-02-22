/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Michele
 */
public class Cliente {

	public static void main(String[] args) throws IOException {
		
		Socket cliente = new Socket("127.0.0.1", 7070);

        DataOutputStream out = new DataOutputStream(cliente.getOutputStream());
        DataInputStream in = new DataInputStream(cliente.getInputStream());
        byte[] vet =  {1,6,3,9,2,5,4,8,7};
        byte[] vet2 = {1,2,3,4,5,6,7,8,9,0};
        int op = 1;

        out.write(op);// Defina Op 
        out.flush();

        	
        if(op==3) {
        	out.write(vet2.length);//tamanho
            out.flush();
            out.write(vet2);
            out.flush();
            int qtd = in.read();
            System.out.println("Qtd impares: " +qtd);
        }
        else if(op ==4) {
        	byte [] vetUnico = new byte[1+vet.length+vet2.length];
        	vetUnico[vetUnico.length-1] = (byte)vet.length;
        	System.arraycopy(vet, 0, vetUnico, 0, vet.length);
        	System.arraycopy(vet2, 0, vetUnico, vet.length, vet2.length);
            out.write((int)vetUnico.length);//tamanho
            out.flush();
            out.write(vetUnico);
            out.flush(); 
            int total = in.read();
            System.out.print("O Produto Escalar eh: " +total);
            }
        else{
        	out.write(vet.length);//tamanho
            out.flush();
            out.write(vet);
            out.flush();
            int newLength = in.read();
            byte[] newvet = new byte[newLength];
            in.read(newvet, 0, newLength);
            for (int i = 0; i < newvet.length; i++) {
                System.out.print(newvet[i]);
                System.out.print(",");
            }
        }
        
	}
}
