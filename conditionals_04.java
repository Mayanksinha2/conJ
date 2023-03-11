package com.company;

import java.util.Scanner;

public class conditionals_04 {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        switch (age){
            case 18:
                System.out.println("Your Matriculation is completed!");
                break;
            case 23:
                System.out.println("Your B-tech is complected!");
                break;
            case 26:
                System.out.println("Your Phd is complected!");
                break;
            case 30:
                System.out.println("You are married!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        System.out.println("Thanking you for connecting us!");
    }
}
