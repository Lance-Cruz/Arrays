package ie.atu.week5;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] anArray;

        anArray = new int[10];

        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = (i + 1) * 100;
        }

        for (int i = 0; i < anArray.length; i++) {
            System.out.println("Element at index " + i + ": " + anArray[i]);
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a new number: ");

        int newValue = sc.nextInt();

        anArray[10] = newValue;

        System.out.println("Element at index 10 : " + anArray[10]);

    }
}
