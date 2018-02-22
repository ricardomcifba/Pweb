import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Stack;

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
		
		Stack <Integer> pilha = new Stack<Integer>();
			for(int i = 0; i< vetor.length; i++ ) {
			pilha.add((int)vetor[i]);
				}
		for(int i = 0; i< pilha.size();i++) {
			if(pilha.elementAt(i)%2 == 1) {
				
			}
		}
		
	}
	
	public int getFatorial(int valor) {
		int total = 1;
		if (valor != 0) {
			for(int i = (int)valor; i >0; i--) {
			total = total*i;
			}
		}
		return total;
		
	}
	
	public void setFatPar(byte[] vetor) {
        byte[] semImpar = new byte[vetor.length];
        int x = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
            	semImpar[x] = vetor[i];
                x++;
            }
        }
        byte[] semImparTrim = new byte[x];
        System.arraycopy(semImpar, 0, semImparTrim, 0, x);
        for(int i = 0; i < semImparTrim.length; i++) {
        	semImparTrim[i] = (byte) getFatorial(semImparTrim[i])	;
        }
        this.vetor = semImparTrim;

    }
	
	public int getParCount(byte[] vetor) {        
        int x = 0;
        for (int i = 0; i < vetor.length; i++) {
            if ((vetor[i] % 2) == 0) {
                x++;
            }
        }        
        return x;
    }
	
	public int getProdutoEscalar(byte[] vetor) {
		byte [] vetor1 = new byte[(int)vetor[vetor.length-1]];
		byte [] vetor2 = new byte[vetor.length-(1+vetor1.length)];
		System.arraycopy(vetor, 0, vetor1, 0, vetor1.length);
		System.arraycopy(vetor, vetor1.length, vetor2, 0, vetor2.length);
		int x=0;
		if(vetor1.length <= vetor2.length) { 
			for(int i = 0; i<vetor1.length;i++) 
				x += vetor1[i]*vetor2[i];
		}
		else 
			for(int i = 0; i<vetor2.length;i++)
				x += vetor1[i]*vetor2[i];	

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
				this.setFatPar(vet);
				out.write(this.getVetor().length);
				out.flush();
				out.write(this.getVetor());
				out.flush();
                break;
			case 3:
                out.write(this.getParCount(vet));
                out.flush();
                break;
			case 4:
				out.write(this.getProdutoEscalar(vet));
                out.flush();
                break;				
				
			}
		} catch (IOException e) {
			System.out.print(e);
		}

	}


}
