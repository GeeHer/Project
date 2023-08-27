package Project;
/*Create a program that uses an array to store a list of temperatures for a week, and then uses a loop to find the
highest and lowest temperature for the week*/

public class Question1 {
    public static void main(String[] args) {
        int [] temp={76,93,86,88,92,81,72};
        int highestTemp=temp[0];
        int lowestTemp=temp[1];

        for (int i = 0; i < temp.length; i++) {
            if(temp[i]>highestTemp){
                highestTemp=temp[i];
            }
            if(temp[i]<lowestTemp){
                lowestTemp=temp[i];

            }

        }
        System.out.println("The hottest temperature of the week is "+highestTemp);
        System.out.println("The lowest temperature of the week is "+lowestTemp);
    }
}
