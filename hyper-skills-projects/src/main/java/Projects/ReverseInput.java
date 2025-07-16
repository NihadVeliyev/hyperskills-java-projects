package Projects;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseInput {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            StringBuilder stringBuilder= new StringBuilder(reader.readLine());
            System.out.println(stringBuilder.reverse());
        }
    }
}