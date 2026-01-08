package Example_with_Predicate;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args){

        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Scala");
        languages.add("C++");
        languages.add("Haskell");
        languages.add("Lisp");

        System.out.println("Languages which starts with J :");
        aplicarFiltro(languages, (str)->str.startsWith("J"));

        System.out.println("Languages which ends with a ");
        aplicarFiltro(languages, (str)->str.endsWith("a"));

        System.out.println("Print all languages :");
        aplicarFiltro(languages, (str)->true);

        System.out.println("Print no language : ");
        aplicarFiltro(languages, (str)->false);

        System.out.println("Print language whose length greater than 4:");
        aplicarFiltro(languages, (str)->str.length() > 4);

    }

    public static void aplicarFiltro(ArrayList<String> names, Predicate<String> condition) {
        for(String name: names) {
            if(condition.test(name)) {
                System.out.println(name + " ");
            }
        }
    }
}
