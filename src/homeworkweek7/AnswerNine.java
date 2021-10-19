/*
9. Same as above program-8 using switch statement

 */



package homeworkweek7;

import java.util.Scanner;

public class AnswerNine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any character from A to F: ");
        char c = scanner.next().charAt(0);

        switch (c) {

            case 'A':
                System.out.println("America");
                break;
            case 'B':
                System.out.println("Brazil");
                break;
            case 'C':
                System.out.println("Chile");
                break;
            case 'D':
                System.out.println("Denmark");
                break;
            case 'E':
                System.out.println("Egypt");
                break;
            case 'F':
                System.out.println("France");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
