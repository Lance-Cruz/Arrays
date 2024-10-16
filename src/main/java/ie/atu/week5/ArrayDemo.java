package ie.atu.week5;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] anArray;

        anArray = new int[10];

        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = (i + 1) * 100;
        }

        printArray(anArray);

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a new number: ");

        int newValue = sc.nextInt();

        try{
            anArray[10] = newValue;
            System.out.println("Element at index 10 : " + anArray[10]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Attempted to catch an array that is out of bounds");
        }

    }

    public static void printArray(int[] array) {
        int index = 0;
        for (int element : array){
            System.out.println("The element at index " + index + " : " + element);
            index++;
        }
    }
}
