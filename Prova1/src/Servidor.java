import java.net.ServerSocket;
import java.net.Socket;

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
