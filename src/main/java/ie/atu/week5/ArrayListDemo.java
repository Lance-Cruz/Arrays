package ie.atu.week5;

import java.util.ArrayList;

import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> anArray = new ArrayList<>();

        anArray.add(100);
        anArray.add(200);
        anArray.add(300);
        anArray.add(400);
        anArray.add(500);
        anArray.add(600);
        anArray.add(700);
        anArray.add(800);
        anArray.add(900);
        anArray.add(1000);

        printArray(anArray);

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a new number:");

        int newValue = sc.nextInt();

        anArray.add(newValue);

        printArray(anArray);



    }

    public static void printArray(ArrayList<Integer> array) {
        int index = 0;
        for (int element : array){
            System.out.println("The element at index " + index + " : " + element);
            index++;
        }
    }
}
