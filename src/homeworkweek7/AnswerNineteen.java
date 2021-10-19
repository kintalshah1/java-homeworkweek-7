package homeworkweek7;

import java.util.Scanner;

public class AnswerNineteen {

    public static void main(String[] args) {

        // Define array size
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int size = s.nextInt();
        int[] array = new int[size];

        // Reading Value from user
        System.out.println("Enter array values: ");
        for (int i = 0; i < size; i++) {
            int value = s.nextInt();
            array[i] = value;
        }

        // Getting array length
        int length = array.length;

        // default sum value
        int sum = 0;

        // Sum of all values in array using for loop
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = sum/length;
        System.out.println("Average of array: " + average);

    }

}

