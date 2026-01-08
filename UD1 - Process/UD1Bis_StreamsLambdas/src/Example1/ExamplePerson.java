package Example1;

import java.util.*;

public class ExamplePerson {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("John", 50));
        people.add(new Person("May", 12));
        people.add(new Person("Tiff", 23));
        people.add(new Person("Azul", 15));
        people.add(new Person("Samantha", 67));

        //2.2.1 Convert names to uppercase and print them on the screen
        /*people.stream()
                .map(p -> p.getName().toUpperCase())
                .forEach(System.out::println);*/

        //2.2.2 Obtain people's names with length less than 4
        people.stream()
                .filter(p -> p.getName().length() < 4)
                .forEach(p -> System.out.println(p.getName()));

        //2.2.3 Obtain the age of the oldest person
        Optional<Person> person = people.stream()
                .max((p,b) -> Integer.compare(p.getAge(),b.getAge()));
        System.out.println(person);

        //2.2.4 Create a people summary (average age, min age, max age, amount of people)
        OptionalDouble avg = people.stream()
                .mapToInt(p -> p.getAge())
                .average();
        System.out.println("AVG: "+avg);

        IntSummaryStatistics summary = people.stream()
                .mapToInt(Person::getAge)
                .summaryStatistics();

        System.out.println("AVG "+summary.getAverage()+" MAX "+summary.getMax()+" MIN "+summary.getMin()+" COUNT "+summary.getCount());

    }
}
