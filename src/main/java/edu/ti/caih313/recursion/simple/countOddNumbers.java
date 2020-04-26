package edu.ti.caih313.recursion.simple;

import java.util.Scanner;


public class countOddNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a nonnegative number:");
    Scanner keyboard = new Scanner(System.in);
    int number = keyboard.nextInt();
        System.out.println(number +" contains "+
    getAmountOfOddDigits(number) +" amount of odd digits");
}

        public static void getAmountOfOddDigits(int n) {
            int counter = 0;
            System.out.println(" Entering getAmountOfOddDigits with " + n);
            int result;
            if (n == 0) {
                System.out.println("setting result to 0 because n=0 an 0 is even");
                result = 0;//n is o and that is even
            }else if (n < 10) {
                if(n%2==0){
                System.out.println("setting result to 0 there are no odd digits." );
                result = 0; //n has one digit that is not odd
                }else{
                    System.out.println("setting result to 1 since an odd digit was found.");
                    result = 1; //n has one digit that is odd
                }
            }else if (n % 10 == 0) {
                System.out.println("calling getAmountOfOddDigits with "+ (n / 10));
                result = getAmountOfOddDigits((n / 10) +1);
            }else {//n % 10 != 0
                System.out.println("calling getAmountOfOddDigits with " + (n / 10));
                result = getAmountOfOddDigits(n / 10);
            }
            System.out.println("Exiting getAmountOfOddDigits with " +n )
            return result;
        }

    }
