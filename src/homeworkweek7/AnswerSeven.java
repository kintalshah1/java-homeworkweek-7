/*
7. Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */

package homeworkweek7;

import java.util.Scanner;

public class AnswerSeven {

    public static void main(String[] args) {
        int salesid, salary;
        double salesamt, commission;
        String sellername;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Sales ID: ");
        salesid = scan.nextInt();

        System.out.println("Enter seller name: ");
       sellername = scan.next();

        System.out.println("Enter sales amount: ");
        salesamt = scan.nextDouble();

        System.out.println("Enter employee salary");
        salary = scan.nextInt();
        scan.close();

        //To find the commission we are using if statement
        if (salesamt >=50000) {
            System.out.println("Sales commission is;" + (commission = salesamt * 0.35));
        }else if (salesamt>=30000  && salesamt<50000) {
            System.out.println("Sales commission is: " + (commission = salesamt * 0.20));
        }else if (salesamt>=20000  && salesamt<30000) {
            System.out.println("Sales commission is :" + (commission = salesamt * 0.10));
        }else if (salesamt >=10000  && salesamt<20000){
            System.out.println("Sales commission is:"+ (commission = salesamt * 0.05));
        }else if (salesamt<10000){
            System.out.println("Sales commission is:"+ (commission =salesamt * 0.02));

        }

    }

}