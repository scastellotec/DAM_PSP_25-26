package Example_without_predicate;

import java.util.ArrayList;

public class Main_classic {

    public static void main(String[] args) {
        // EXAMPLE 1
        System.out.println("Languages which starts with J :");
        Implement1MyFunciontalInteface implemetacion = new Implement1MyFunciontalInteface();

        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Scala");
        languages.add("C++");
        languages.add("Haskell");
        languages.add("Lisp");

        // No he usado lambdas para nada hasta aqui
        aplicarFiltro(languages, implemetacion);

        // EXAMPLE 2
        // Usando lambdas
        System.out.println("Languages with a name longer than 5:");
        aplicarFiltro(languages, (s) -> s.length() > 5);
    }

    public static void aplicarFiltro(ArrayList<String> names, MyFunctionalInterface condition) {
        for(String name: names) {
            if(condition.filtrar(name)) {
                System.out.println(name + " ");
            }
        }
    }
}
