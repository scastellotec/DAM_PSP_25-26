package processBuilder;

import java.io.IOException;

public class Ejemplo1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Create ProcessBuilder.
        ProcessBuilder pBuilder = new ProcessBuilder();

        // Use command "notepad.exe" and open the file.
        //p.command("notepad.exe");
        pBuilder.command("notepad.exe", "notas.txt");
        Process p = pBuilder.start();

        // Muestro la salida
        System.out.println("Valor salida: " + p.waitFor());
    }
}
