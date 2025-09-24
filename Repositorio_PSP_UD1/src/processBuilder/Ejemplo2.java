package processBuilder;

import java.util.Map;

public class Ejemplo2 {
    public static void main(String[] args) {
        ProcessBuilder pBuilder = new ProcessBuilder("Notepad.exe", "datos.txt");
        Map<String, String> env = pBuilder.environment();
        System.out.println("Num procesadores: " + env.get("NUMBER_OF_PROCESSORS"));
    }
}
