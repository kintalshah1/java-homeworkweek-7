/*
3. Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
_______________________________
| |
| Mark Sheet |
|_______________________________|
| Name : Jay |
| Roll No: 08 |
|_______________________________|
| Subjects : Marks |
|_______________________________|
| Math : 98 |
| Science : 90 |
| English : 85 |
|_______________________________|
| Total : 273 |
|_______________________________|
| Percentage : 91.0 |
| Result : Pass |
| Grade : A+ |
|_______________________________
 */


package homeworkweek7;

import java.util.Scanner;

public class AnswerThree {

    public static void main(String[] args) {
        String result, grade = null;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String Stuname = sc.next();

        System.out.println("Enter Student roll no:");
        int rollno = sc.nextInt();

        System.out.println("Enter marks for Maths:");
        int Maths = sc.nextInt();
        while (Maths > 100 || Maths < 0) {

            System.out.println("Invalid input,Maths marks should be between 0 to 100");
            Maths = sc.nextInt();

        }

        System.out.println("Enter marks for Science:");
        int Science = sc.nextInt();
        while (Science > 100 || Science < 0) {
            System.out.println("Invalid input,Maths marks should be between 0 to 100");
            Science = sc.nextInt();

        }

        System.out.println("Enter marks for English:");
        int English = sc.nextInt();
        while (English > 100 || English < 0) {
            System.out.println("Invalid input,Maths marks should be between 0 to 100");
            English = sc.nextInt();

        }

        float total = Maths + Science + English;
        System.out.println( "Total maeks for Maths + Science +English is +total");

        float percentage = total /300 * 100;
        System.out.println("Percentage of all three subject is:"+ percentage);
        if (percentage >=35){
            result = "Pass";

        }else{
            result = "Fail";

        }
        System.out.println(result);
        if (percentage >= 80) {
            grade = "A+";
            System.out.println("Grade: " + grade);
        } else if (percentage >= 60 && percentage <80) {
            grade = "A";
            System.out.println("Grade: " + grade);
        }else if (percentage >= 50 && percentage <60) {
            grade = "B";
            System.out.println("Grade:" + grade);
        }else if (percentage >= 35 && percentage <50) {
            grade = "C";
            System.out.println("Grade;" + grade);
        }else{
            grade ="";

            }
        System.out.println("|---------------------------------|");
        System.out.println("|         Mark Sheet              |");
        System.out.println("|---------------------------------|");
        System.out.println("| Name:       " + Stuname + "                |");
        System.out.println("| Roll No:    " + rollno + "                  |");
        System.out.println("|---------------------------------|");
        System.out.println("|  Subjects        Marks          |");
        System.out.println("|---------------------------------|");
        System.out.println("|  Maths           " + Maths + "            |");
        System.out.println("|  Science         " + Science + "            |");
        System.out.println("|  English         " + English + "            |");
        System.out.println("|---------------------------------|");
        System.out.println("|  Total:          " + total + "          |");
        System.out.println("|---------------------------------|");
        System.out.println("|  Percentage:     " + percentage + "           |");
        System.out.println("|  Result:         " + result + "          |");
        System.out.println("|  Grade:          " + grade + "            |");
        System.out.println("|--------------------------------- |");



        }

    }


