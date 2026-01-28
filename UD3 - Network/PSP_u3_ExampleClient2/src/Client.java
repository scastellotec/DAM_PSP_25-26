import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            // Abro conexión
            Socket socket = new Socket("localhost", 6666);


            // Con este buffer leo los datos que me envia el servidor
            BufferedReader bufferEntrada = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            // Con este buffer escribo y envío al servidor
            /* true indica autoflush => cada println envia servidor (sin flush())*/
            PrintWriter bufferSalida = new PrintWriter(socket.getOutputStream(),
                    true);


            Scanner sc = new Scanner(System.in);

            // Step 1
            System.out.println("Write the first number");
            int number1 = sc.nextInt();
            bufferSalida.println(number1);

            // Step 2
            System.out.println("Write the second number");
            int number2 = sc.nextInt();
            bufferSalida.println(number2);

            // Step 3
            System.out.println(bufferEntrada.readLine());

            // Cierro el conexión
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}