/*
18. Write a Java program to sum values of an array.
 */


package homeworkweek7;

public class AnswerEighteen {

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9};
        int sum =0;
        for (int i : array)
            sum += i;
        System.out.println("The sum of array is "+sum);

    }
}
