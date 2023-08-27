package Project;
/*Create an array of integer values. After the array is created, calculate the sum of all stored
elements in that array.
*/

public class Question2 {
    public static void main(String[] args) {
        int [] numbers={64,82,37,65,12,8,54,27};
        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        System.out.println(sum);
    }
}
