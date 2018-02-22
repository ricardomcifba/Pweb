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
public class TratarInteiros implements Runnable {

    private byte[] vetor;
    private Socket cliente;

    public TratarInteiros(Socket cliente) {
        this.cliente = cliente;
    }

    public byte[] getVetor() {
        return vetor;
    }

    public void setArrumarPilha(byte[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i; j < vetor.length; j++) {
                if (vetor[i] % 2 != 0) {
                    byte aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        this.vetor = vetor;
    }

    public void setRemovePar(byte[] vetor) {
        byte[] semPar = new byte[vetor.length];
        int x = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 1) {
                semPar[x] = vetor[i];
                x++;
            }
        }
        byte[] semParTrim = new byte[x];
        System.arraycopy(semPar, 0, semParTrim, 0, x);
        this.vetor = semParTrim;
    }

    public int getImparCount(byte[] vetor) {
        int x = 0;
        for (int i = 0; i < vetor.length; i++) {
            if ((vetor[i] % 2) != 0) {
                x++;
            }
        }
        return x;
    }

    public int setProdutoEscalar(byte[] vetor) {
        byte[] vetor1 = new byte[(int) vetor[vetor.length - 1]];
        byte[] vetor2 = new byte[vetor.length - (1 + vetor1.length)];
        System.arraycopy(vetor, 0, vetor1, 0, vetor1.length);
        System.arraycopy(vetor, vetor1.length, vetor2, 0, vetor2.length);
        int x = 0;
        if (vetor1.length <= vetor2.length) {
            for (int i = 0; i < vetor1.length; i++) {
                x += vetor1[i] * vetor2[i];
            }
        } else {
            for (int i = 0; i < vetor2.length; i++) {
                x += vetor1[i] * vetor2[i];
            }
        }

        return x;

    }

    public static void main(String[] args) throws IOException {

    }

    @Override
    public void run() {
        try {
            DataOutputStream out = new DataOutputStream(cliente.getOutputStream());
            DataInputStream in = new DataInputStream(cliente.getInputStream());

            byte op = in.readByte();
            int lengt = in.read();

            byte[] vet = new byte[lengt];

            in.read(vet, 0, lengt);

            switch (op) {
                case 1:
                    this.setArrumarPilha(vet);
                    out.write(this.getVetor().length);
                    out.flush();
                    out.write(this.getVetor());
                    out.flush();
                    break;
                case 2:
                    this.setRemovePar(vet);
                    out.write(this.getVetor().length);
                    out.flush();
                    out.write(this.getVetor());
                    out.flush();
                    break;
                case 3:
                    out.write(this.getImparCount(vet));
                    out.flush();
                    break;
                case 4:
                    int resultado = setProdutoEscalar(vet);
                    out.write(resultado);
                    out.flush();
                    break;

            }
        } catch (IOException e) {
            System.out.print(e);
        }

    }

}
