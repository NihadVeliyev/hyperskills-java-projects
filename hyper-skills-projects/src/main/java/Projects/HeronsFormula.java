package Projects;

import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a= scanner.nextDouble();
        double b=scanner.nextDouble();
        double c= scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            double p= (a+b+c)/2;
            double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            if(area%1==0){
                System.out.println((int)area);
            }
            else {
                System.out.printf("%.2",area);
            }

        } else {
            System.out.println("Invalid triangle");
        }

    }
}
