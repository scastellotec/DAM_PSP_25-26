package Example0;

import java.util.Arrays;
import java.util.List;

public class Example0 {
    public static void main(String[] args) {
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");

        System.out.println("# Using old fashion way");
        for (Object feature : features) {
            System.out.println(feature);
        }

        System.out.println("# Using lambdas");
        features.forEach(n -> System.out.println(n));

        System.out.println("# Using static-reference");
        features.forEach(System.out::println);
    }
}
