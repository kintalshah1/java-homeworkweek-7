/*
10.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else


 */


package homeworkweek7;

import java.util.Scanner;

public class AnswerTen {

    public static void calculation(char ch, int num1, int num2) {

        if (ch == '+') {
            System.out.println("\nAddition of " + num1 + " + " + num2 + "= " + (num1 + num2));
        } else if (ch == '-') {
            System.out.println("Subtraction of " + num1 + " - " + num2 + "= " + (num1 - num2));
        } else if (ch == '*') {
            System.out.println("Multiplication of " + num1 + " * " + num2 + "= " + (num1 * num2));
        } else if (ch == '/') {
            System.out.println("Division of " + num1 + " / " + num2 + "= " + (num1 / num2));
        } else {
            System.out.println("Operator is not available");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operator you want (+, -, *, /): ");
        char ch = sc.next().charAt(0);

        calculation(ch,num1,num2);
    }


}
