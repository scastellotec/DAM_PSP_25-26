package runtime;

import java.io.IOException;

public class Ejemplo1 {

    public static void main(String[] args) throws IOException {

        // Distintas formas de lanzar un proceso
        // Opcion 1
        //Runtime.getRuntime().exec("Notepad.exe");

        // Opcion 2
        //Runtime.getRuntime().exec("Notepad.exe notas.txt");

        // Opcion 3
        /*String[] infoProceso = {"Notepad.exe","notas.txt"};
        Runtime.getRuntime().exec(infoProceso);*/

    }
}
