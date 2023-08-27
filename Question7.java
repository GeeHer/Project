package Project;
/*Write a Java Program to print the first 10 numbers of Fibonacci series*/

public class Question7 {
    public static void main(String[] args) {
        int sum=0;

        for (int i = 0; i < 10; i++) {
            sum=i+sum;
            System.out.print(sum+" ");
        }

    }
}
