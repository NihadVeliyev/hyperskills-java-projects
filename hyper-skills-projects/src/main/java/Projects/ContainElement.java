package Projects;

public class ContainElement {
    public static void main(String[] args) {
        int a=5;
        int[] nums={1,2,3,4,5};
        System.out.println(checkElement(nums,a));


        }
    public static boolean checkElement(int[] numbers,int number){
        if(numbers.length>0){
            for(int i = 0; i<numbers.length; i++){
                if(number==numbers[i]){
                    return true;
                }

                }

            }
        return false;
    }

}

