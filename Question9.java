package Project;
/*Write a java program to find the second largest number in the array?
 */

public class Question9 {
    public static void main(String[] args) {
        int [] numbers={34,94,65,2,35,84,21,73,26};
        int largestNumber=numbers[0];
        int secondLargest=numbers[1];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>largestNumber){
                secondLargest=largestNumber;
                largestNumber=numbers[i];
            }else if(numbers[i]>secondLargest){
                secondLargest=numbers[i];
            }
        }
        System.out.println(secondLargest);
    }
}
