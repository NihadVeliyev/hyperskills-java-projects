package Projects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountWords {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String input= reader.readLine();
            if(input.trim().length()==0){
                System.out.println(0);
            }else{
                String[] input1= input.trim().split("\\s+");
                System.out.println(input1.length);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
