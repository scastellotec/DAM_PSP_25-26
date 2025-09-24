package runtime;

import java.io.IOException;

public class Ejemplo2_gestionproc {
    public static void main(String[] args) throws IOException, InterruptedException {

        // Creo el proceso y lo lanzo
        String[] infoProceso = {"Notepad.exe","notas.txt"};
        Process proceso = Runtime.getRuntime().exec(infoProceso);

        // Espero a recibir la respuesta de finalizacion de ejecucion
        int codigoRetorno = proceso.waitFor();
        // Muestro el resultado de la ejecución
        System.out.println("Fin de la ejecución: " + codigoRetorno);
    }
}
