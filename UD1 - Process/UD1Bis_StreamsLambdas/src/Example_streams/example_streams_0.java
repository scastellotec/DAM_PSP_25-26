package Example_streams;


import java.util.*;
import java.util.Optional;
import java.util.stream.Collectors;

public class example_streams_0 {
    public static void main(String[] args) {
        ArrayList<String> memberNames = new ArrayList<String>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        System.out.println("Example 1");
        Optional<String> nombresNuevos = memberNames.stream()
                .reduce((s1, s2) -> s1+"-"+s2);

        nombresNuevos.ifPresent(System.out::println);
    }
}
