package processBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo4 {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("cmd.exe");
        Process p = pb.start();

        BufferedReader br=new BufferedReader(
                new InputStreamReader(
                        p.getInputStream()));

        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
}
