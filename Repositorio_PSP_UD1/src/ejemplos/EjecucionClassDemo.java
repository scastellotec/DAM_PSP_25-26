package ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjecucionClassDemo {
    public static void main(String[] args) throws IOException {

        // Declaro ProcessBuilder
        ProcessBuilder pB = new ProcessBuilder();
        pB.command("java","Sumador","1","6");
        Process p = pB.start();

        // OPCION 1: La salida del programa la guardo en un TXT
        //pB.redirectOutput(new File("test.txt"));

        // OPCION 2: La salida del programa la muestro por pantalla
        BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }


    }
}
