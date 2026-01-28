import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            // Abro puerto 666 y este proceso recogerá las peticiones
            ServerSocket servidorSocket = new ServerSocket(6666);
            while (true) {
                /* Cuando cliente se conecte me comunicaré con el a través del
                socket que devuelve el método accept() */
                Socket socket = servidorSocket.accept();

                // Abro los stream de comunicación
                PrintWriter salida = new PrintWriter(socket.getOutputStream(),true);
                BufferedReader entrada = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));

                // Step 1: read first number
                int number1 = Integer.parseInt(entrada.readLine());
                // Step 2: read second number
                int number2 = Integer.parseInt(entrada.readLine());
                // Step 3: Send the solution to client
                salida.println(number1+number2);

                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

