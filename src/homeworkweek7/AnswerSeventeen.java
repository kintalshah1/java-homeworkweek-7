/*

17. Write a Java program to sort a numeric array and a string array.

 */



package homeworkweek7;

import java.util.Arrays;
import java.util.Collections;

public class AnswerSeventeen {


    public static void main(String[] args) {
        //array type numbers
        Integer[] numarray ={
                93,13,25,28,22,48,72,65,1,9};
        //array type string

        String[]stringarray ={
                "India","UK","US","Germany","France","Spain","Dubai","Africa","Turkey","Portugal"};
        System.out.println(("Original numeric array:" + Arrays.toString(numarray)));
        Arrays.sort(numarray); //sort numeric array in Ascending order
        System.out.println("Sorted numeric array in Ascending order:"+Arrays.toString(numarray));
        Arrays.sort(numarray, Collections.reverseOrder());  //Sort array in descending array
        System.out.println("Sorted numeric array in Descending order:"+ Arrays.toString(numarray));


        System.out.println("");
        System.out.println("Original string array:"+Arrays.toString(stringarray));
        Arrays.sort(stringarray);   //sort string array i nAscending order
        System.out.println("Sorted string array in Ascending order:"+Arrays.toString(stringarray));
        Arrays.sort(stringarray,Collections.reverseOrder());   //sort array in descending order
        System.out.println("Sorted strign array in Descending order: "+Arrays.toString(stringarray));



    }

}
