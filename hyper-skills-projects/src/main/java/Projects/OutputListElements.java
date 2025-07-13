package Projects;

import java.util.ArrayList;

public class OutputListElements {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Mr Green");
        names.add("Mr Yellow");
        names.add("Mr Red");
        for(String name : names){
            System.out.println(names);
        }

    }
}
