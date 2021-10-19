/*
16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO

 */


package homeworkweek7;

import java.util.Scanner;

public class AnswerSixteen {

    public static void positiveNegative(int num){
        if (num > 0 ) {   //we need to check the number is greater than zero or not
            System.out.println("This number is Positive");
        }else if (num <0) {  //less than zero or not
            System.out.println("This number is Negative");
        }else {   // Execute when above two conditions are false
            System.out.println("Number is Zero");
        }


    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num =sc.nextInt();
        positiveNegative(num);

    }
}
