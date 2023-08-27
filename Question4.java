package Project;
/*Create a 2D array of integers. Develop a program which will calculate the sum of even and odd
numbers for that array*/

public class Question4 {
    public static void main(String[] args) {
        int[][] numbers={{25,84,74,67,93,47,},{46,77,31,97,34,3,20}};
        int totalEven=0;
        int totalOdd=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    totalEven+=1;
                }
                if(numbers[i][j]%2==1){
                    totalOdd+=1;
                }

            }

        }
        System.out.println("Total numbers of even are "+totalEven);
        System.out.println("Total numbers of odd are "+totalOdd);
    }
}
