package Projects;

import java.util.*;
import java.util.stream.Collectors;

public class FindNearestNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> intArrList = readArrayList(scanner);
        int n = scanner.nextInt();


        ArrayList<Integer> diffs = new ArrayList<>();

        int min=Integer.MAX_VALUE;
        for (Integer numbers : intArrList) {

            int a = Math.abs(numbers - n);
            if(a<min){
                min=a;
            }

        }

        for (Integer numbers : intArrList) {

            int a = Math.abs(numbers - n);
            if(a==min){
                diffs.add(numbers);
            }

        }

        diffs.sort(Comparator.naturalOrder());
        System.out.println(diffs);









    }
    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
