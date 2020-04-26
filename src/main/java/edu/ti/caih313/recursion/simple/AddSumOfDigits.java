package edu.ti.caih313.recursion.simple;

import java.util.Scanner;


public class AddSumOfDigits{
    public static void main(String[] args) {
        System.out.println("Enter a nonnegative number:");
    Scanner keyboard = new Scanner(System.in);
    int number = keyboard.nextInt();
    if(n<0) {
        System.out.println("I'm sorry, that number is negative");
    } else{
        System.out.println(number + " when you add all the digits equals to " +
    AddSumOfDigits(number));
    }
}

        public static int AddSumOfDigits(int n) {
            int result = 0;
            System.out.println(" Entering AddSumOfDigits with " + n);
            if (n == 0) {
                System.out.println("setting result to 0 because n=0 ");
                result = 0;
            }else if (n < 10) {
                    System.out.println("setting result to n since there is only one digit");
                    result += n; //adding n to result
                }
            }else if (n % 10 == 0) { //if n is divisable by 10, then we just need to find the first digit
                System.out.println("calling AddSumOfDigits with "+ (n);
                int firstDigit=0;
                int temporary = n;
                while(temporary!=0) {
                    temporary-10;
                    firstDigit ++;
                }
                result = AddSumOfDigits(firstDigit);
            }else { //n is more than two digits and is not divisable by 10
            System.out.println("calling AddSumOfDigits with "+ (n);
            int firstDigit;
            int temporary = n;
            while(temporary>=10) {
                temporary-10;
                firstDigit ++;
            }
            int secondDigit = temporary%10;
            result = AddSumOfDigits(firstDigit);
            result = AddSumOfDigits(secondDigit);
            }
            System.out.println( "Exiting AddSumOfDigits with " +n )
            return result;
        }

