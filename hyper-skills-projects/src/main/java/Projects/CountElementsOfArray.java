package Projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountElementsOfArray {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final int[] second = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final String result = countOccurrences(first, second).toString()
                .replace(", ", " ")
                .replace("[", "")
                .replace("]", "");
        System.out.println(result);




    }
    public static ArrayList<Integer> countOccurrences(int[] first, int[] second) {

        ArrayList<Integer> result = new ArrayList<>(first.length);

        for(int i=0;i<first.length;i++){
            int count=0;
            for(int j=0;j< second.length;j++){
                if(first[i]==second[j]){
                    count++;



                }
            }
            result.add(count);



        }






        return result;
    }

}
