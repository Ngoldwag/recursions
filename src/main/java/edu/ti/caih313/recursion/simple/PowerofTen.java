package edu.ti.caih313.recursion.simple;

import java.util.Scanner;

public class PowerOfTen {
    public static void main(String[] args) {

        System.out.println("Enter a nonnegative number:");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println(number + " to the power of ten is " +
         getPowerOfTen(number));
    }

    public static int getPowerOfTen(int n){
        int result;
        if(n==0){
            result =1;
        }else if(n==1){
            result =10;
        }else if (n==2){
            result = 100;
        }else if (n%2==0){
            int resultHalf = getPowerOfTen(n/2);
            result = resultHalf * resultHalf;
        }else{
            int resultKindaHalf = getPowerOfTen((n-1)/2);
            result = 10 * resultKindaHalf*resultKindaHalf
        }
        return result;

    }

}

