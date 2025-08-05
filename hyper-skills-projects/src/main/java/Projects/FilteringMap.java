package Projects;

import java.util.*;
import java.util.stream.Collectors;

public class FilteringMap {
    public static void main(String[] args) {


        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Frank");
       List<String> fileteredNames= names.stream()
               .sorted(Comparator.naturalOrder())
               .limit(3)
                .collect(Collectors.toList());

        System.out.println(fileteredNames);





        // Step 4: Reverse that new list
        // Step 5: Print result
    }
}
