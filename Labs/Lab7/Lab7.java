package Labs.Lab7;

import java.util.Scanner;

public class Lab7{

    public static void main(String[] args) {
        System.out.println("Địt mẹ mày");
    }
        // variable declarations for part 1
        /*String title;
        String firstName;
        String lastName;
        Scanner in = new Scanner(System.in);

        // prompt for input for part 1
        System.out.print("Enter a title:");
        title = in.next();
        System.out.print("Enter your first name:");
        firstName = in.next();
        System.out.print("Enter a your last name:");
        lastName = in.next();

        // call the method for part 1
        greeting(title, firstName, lastName);

        // variable declarations for part 2
        int number1;
        int number2;

        // user prompts for part 2
        System.out.print("Enter first number:");
        number1 = in.nextInt();
        System.out.print("Enter second number:");
        number2 = in.nextInt();

        // call the methods max and sumTo inside the println statement
        System.out.println("The largest number is " + max(number1, number2));
        System.out.println("The sum of the numbers is " + sumTo(number1, number2));
    }// end of main method
*/
    /******************** greeting method goes here*********************/
    public static void greeting(String s1, String s2, String s3) {
        System.out.println();
        System.out.println("Dear " + s1 + " " + s2 + " " + s3 + ",");
        System.out.println();
    }

    /***********************end of method*************************/

    /******************** max method goes here*********************/
    public static int max(int num1, int num2){
        int max = 0;
        if (num1 > num2) {
            max = num1;
        }
        else if (num2 > num1){
            max = num2;
        }
        else {
            max = num1;
        }
        return max;
    }


    /***********************end of method*************************/

    /******************** sumTo method goes here*********************/

    public static int sumTo(int num1, int num2){
        int total = 0;
        if (num1<num2){
            for(int i = num1; i <= num2; i++){
                total = total + i;
            }
        }
        else {
            for(int i = num2; i <= num1; i++){
                total = total + i;
            }
        }
        return total;
    }


    /***********************end of method*************************/
}
