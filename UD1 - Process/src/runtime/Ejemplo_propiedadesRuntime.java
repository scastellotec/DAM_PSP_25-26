package runtime;

public class Ejemplo_propiedadesRuntime {

    // Referencia al entorno de ejecución actual
    Runtime r=Runtime.getRuntime();

    void mostrarInfo(){
        // r.availableProcessors() processadores disponibles
        System.out.println(this.r.availableProcessors());
    }

    void mostraEntorno() {
        // r.totalMemory() cantidad memoria reservada para JVM
        System.out.println("Mem Total: " + this.r.totalMemory());

        // r.freeMemory() indica memoria libre en la JVM
        System.out.println("Mem Libre: " + this.r.freeMemory());
    }

    void NetejaFem () {
        this.r.gc();
    }

    public static void main(String[] args) throws Exception {

        Ejemplo_propiedadesRuntime rd=new Ejemplo_propiedadesRuntime();

        // Procesadores disponibles
        System.out.print("Processadores disponibles: ");
        rd.mostrarInfo();

        // Muestro
        System.out.println("\nEstado inicial..");
        rd.mostraEntorno();

        //Llenamos la memoria
        for(int i=0;i<=10000;i++){
            new Object();
        }

        System.out.println("\nEstado después de crear 10.000 objects");
        rd.mostraEntorno();

        // Llamamos al colector de basura
        rd.NetejaFem();

        System.out.println("\nEstado colector de basura");
        rd.mostraEntorno();
    }

}
