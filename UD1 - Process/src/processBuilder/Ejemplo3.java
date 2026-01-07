package processBuilder;

import java.io.File;
import java.io.IOException;

public class Ejemplo3 {
    public static void main(String[] args) throws IOException {

        // Create ProcessBuilder
        ProcessBuilder b = new ProcessBuilder();
        b.command("cmd.exe");

        // Redirect output to this file.
        b.redirectOutput(new File("test.txt"));
        b.start();

    }
}
