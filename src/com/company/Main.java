package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount");
        double amount = input.nextDouble();
        double tax = amount * 0.06;
        System.out.println("tax is" +  (int)(tax * 100) / 100.0);

    }
}
