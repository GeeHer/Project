package Project;
/*Write a program to print out duplicate elements from an Array of
Strings?
*/

public class Question10 {
    public static void main(String[] args) {
        String[] elements = {"Cat", "Dog", "Dog", "Bird", "Lion", "Tiger","Fish","Shark","Tiger"};

        for (int i = 0; i < elements.length; i++) {
            for (int j =i+1; j < elements.length ; j++) {
                if(elements[i]==elements[j]){
                    System.out.println("Duplicate element is "+elements[i]);
                }
            }}
    }
}
