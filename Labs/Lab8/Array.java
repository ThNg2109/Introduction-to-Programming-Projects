package Labs.Lab8;

import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        String[] tokens = args[0].split(",");
        String[] customerName = new String[8];
        for(int i = 0; i < tokens.length; i++){
            customerName[i] = tokens[i];
        }
        displayNames(customerName);
        //move elements from indexes 4 & 5 to 6 & 7
        String temp = customerName[4];
        customerName[4] = customerName[6];
        customerName[6] = temp;
        temp = customerName[5];
        customerName[5] = customerName[7];
        customerName[7] = temp;
        // add "Rick" and "Jessica" into index 4, 5
        customerName[4] = "Rick";
        customerName[5] = "Jessica";
        displayNames(customerName);
        // use reverseNames method to pass array customerName
        customerName = reverseNames(customerName);
        displayNames(customerName);
        // use for loop to check for "Rick" and remove it
        for(int i = 0; i < customerName.length; i++) {
            if (customerName[i] != null && customerName[i].equals("Rick")) {
               // customerName[i] = null;
                for(int j = i; j + 1 < customerName.length; j++) {
                    customerName[j] = customerName[j + 1];
                }
                customerName[customerName.length - 1] = null;
                i--;
            }
        }
        displayNames(customerName);

    }
    public static void displayNames(String[] names){
        for(String i : names){
            System.out.println(i);
        }
        System.out.println();
    }
    public static String[] reverseNames(String[] names){
        String[] temp = new String[names.length];
        for(int i = 0; i < names.length; i++){
            temp[i] = names[names.length-i-1];
        }
        names = temp;
        return names;
    }

}


