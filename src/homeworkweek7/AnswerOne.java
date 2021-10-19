package homeworkweek7;
/*
1. Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class AnswerOne {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int num =scan.nextInt();

        String result = (num % 2 == 0) ? "Even" : "odd";
        System.out.println("Number is :" + result);


    }

}
