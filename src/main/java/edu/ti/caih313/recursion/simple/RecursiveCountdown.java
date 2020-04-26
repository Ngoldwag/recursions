package edu.ti.caih313.recursion.simple;
import java.util.Scanner;

import static edu.ti.caih313.recursion.simple.RecursionDemo2.getNumberOfZeros;

public class RecursiveCountdown {
    public static void main(String[] args) {
        countDown(3, " ");
    }

    public static void countDown(int num, String prefix) {
        System.out.println(prefix + "Entering countdown with " +num);
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println(number + " contains " + getNumberOfZeros(number,"> "));
        if (num == 0) {
            System.out.println("That's all, folks!");
        } else {
            System.out.print(prefix + "calling countdown with " + (num-1));
            countDown(num - 1, "-" +prefix);
        }
        System.out.println("Exiting countdown with " + num);
    }

}
}

