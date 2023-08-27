package Project;
/*Write a program to swap 2 numbers without a temporary variable*/

public class Question5 {
    public static void main(String[] args) {
        int x=63;
        int y=25;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x="+x+" y="+y);

    }
}
