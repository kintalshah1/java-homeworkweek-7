package homeworkweek7;
/*
2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
 */
// A year divisible by 400 or year divisible by 4 and not divisible by 100

import java.util.Scanner;

public class AnswerTwo {

    public static void main(String[] args) {
        Scanner sc =new Scanner((System.in));
        System.out.println("Enter the year");
        int year =sc.nextInt();
        if (year%400==0)
        {
            System.out.println("Leap year");
        }
        else if (year %4==0 && year %100!=0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}
