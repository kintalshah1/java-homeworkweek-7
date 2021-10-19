/*

20. Write a Java program to test if an array contains a specific value.
 */


package homeworkweek7;

public class AnswerTwenty {

    public static void main(String[] args) {

        int[] array ={
                1420,8888,2525,2424,8989,2021,2022,2023};

        System.out.println(contains(array, 2222));
        System.out.println(contains(array, 2424));

        }
        public static boolean contains(int[]arr,int item){

        for (int n : arr){
            if(item == n){
                return true;

            }
        }
        return false;
    }
}
