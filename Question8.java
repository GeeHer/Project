package Project;
/*Maximum and minimum number in the array?*/

public class Question8 {
    public static void main(String[] args) {

        int [] number={12,34,53,11,9,93,2,36};
        int min=number[0];
        int max=number[1];

        for (int i = 0; i < number.length; i++) {
            if(number[i]>max)
                max=number[i];
            if(number[i]<min)
                min=number[i];

        }
        System.out.println("The max number in the array is "+max);
        System.out.println("The minimum number in the array is "+min);

    }
}
