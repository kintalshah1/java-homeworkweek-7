/*
6. Write a java program to input any number and find out if it’s odd or even

 */

package homeworkweek7;

import java.util.Scanner;

public class AnswerSix {

    public static void main(String[] args) {


        int num;
        System.out.println("Enter an integer number: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        if (num % 2 == 0) {
        System.out.println("Entered number is Even");
    }
    else
            System.out.println("Entered number is Odd");



    }
    }



