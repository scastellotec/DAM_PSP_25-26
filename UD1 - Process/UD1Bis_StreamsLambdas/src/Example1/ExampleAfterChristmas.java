package Example1;

import java.util.*;

public class ExampleAfterChristmas {
    public static void main(String[] args) {
        // transform the list so that each number is squared and collect the result into a new list.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

       /* numbers.stream()
                .map(e -> e*e)
                .forEach(System.out::println);*/

        //  find the length of the longest name.
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        /*Optional<Integer> lengthMax = names.stream()
                .map(e -> e.length())
                .max(Integer::compare);
        System.out.println("Max: " + lengthMax);*/

        // concatenation of the first two words that have even lengths.
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        /*Optional<String> result = words.stream()
                .filter( e -> e.length() % 2 == 0)
                .limit(2)
                .reduce((a,b) -> a+b);
        System.out.println(result);*/

        // To uppercas
        List<String> words2 = List.of("java", "streams", "api");
        /*words2.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);*/

        // Filter String by length greater than 4
        List<String> names2 = List.of("Tom", "Alice", "Jonathan", "Eva");
        /*names2.stream()
                .filter(e -> e.length() > 4)
                .forEach(System.out::println);*/


    }
}
