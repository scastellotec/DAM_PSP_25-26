package Example1;

import java.util.*;

import static java.util.Arrays.asList;

public class ExampleToDoClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Peter");
        list.add("Gerhard");
        list.add("Philip");
        list.add("John");

        // Given the following list print each of the items
        System.out.println("Example 2.0.1");
        list.stream()
                .forEach(System.out::println);

        List<String> names = asList("John", "Jack", "Jacob");
        //2.1.1 Print “Hello name” for each element on the list.
        System.out.println("Example 2.1.1");
        names.stream()
                .forEach(n -> System.out.println("Hello "+n));

        //2.1.2 Return a List that contains the same elements but with “Captain name” for each element.
        System.out.println("Example 2.1.2");
        names.stream()
                .map(x -> "Captain " + x)
                .toList()
                .forEach(System.out::println);

        //2.1.3 Print the name that begin with ‘Ja’
        System.out.println("Example 2.1.3");
        names.stream()
                .filter(x -> x.startsWith("Ja"))
                .forEach(System.out::println);


        List<Integer> numbers = asList(1, 2, 3, 4);
        //2.1.4 List only the even (different from odd) numbers.
        System.out.println("Example 2.1.4");
        numbers.stream()
                .filter(a -> a % 2 ==0)
                .forEach(System.out::println);

        //2.1.5 Calculate the sum, avg, max, and min for all the numbers in the list.
        System.out.println("Example 2.1.5");
        Optional<Integer> result = numbers.stream()
                .reduce(Integer::sum);
        System.out.println("Resultado "+result);

        Long countResult = numbers.stream()
                                    .count();
        System.out.println("Cuantos: "+countResult);

        Optional<Integer> maxResult = numbers.stream()
                .max(Integer::compareTo);
        System.out.println("Max: "+countResult);

        //For this exercise a conversion from Integer to int needs to be carried out.
        //In order to do so, use the function mapToInt(x -> x)
        int resultadoNuevo = numbers.stream()
                                .mapToInt(x->x)
                                //.average()
                                .sum();
        System.out.println("Resulatado nuevo: "+resultadoNuevo);

    }
}
