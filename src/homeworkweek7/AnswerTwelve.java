/*
12. Write a program that tells us input value is number or an alphabet or symbol

 */


package homeworkweek7;

import java.util.Scanner;

public class AnswerTwelve {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print(" Enter character:  ");

        String input = scan.next();
        if (input.length() > 1) {
            throw new Error("Input must be character");// error for input
        }
 char cha = input.charAt(0);
        if ((cha >= 'a'  && cha <= 'z' || (cha >= 'A' && cha <= 'Z'))) {
            System.out.println(cha + "  it's a Alphabet");
        }else if (cha >= '0'  && cha<= '9') {
            System.out.println(cha + " is a Number");
        }else{
            System.out.println(cha + " is a Symbol");


        }

    }
}