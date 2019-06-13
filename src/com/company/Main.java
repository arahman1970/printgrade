package com.company;
 // print grades of the entered scores
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int grade = 0;
        String prompt;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print("Enter an exam grade: ");
            grade = keyboard.nextInt();
            if (grade < 60) {
                System.out.print("Go Back to School");
            } else if (grade <= 69) {
                System.out.print("Your Grade is: D");
            } else if (grade <= 73) {
                System.out.print("Your Grade is: C-");
            } else if (grade <= 76) {
                System.out.print("Your Grade is: C");
            } else if (grade <= 79) {
                System.out.print("Your Grade is: C+");
            } else if (grade <= 83) {
                System.out.print("Your Grade is: B-");
            } else if (grade <= 86) {
                System.out.print("Your Grade is: B");
            } else if (grade <= 89) {
                System.out.print("Your Grade is: B+");
            } else if (grade <= 93) {
                System.out.print("Your Grade is: A-");
            } else if (grade <= 96) {
                System.out.print("Your Grade is: A");
            } else {
                System.out.print("Your Grade is: A+");
            }

        System.out.println(" \n Would you like to continue? (yes or no");
        prompt = keyboard.next();
    }
    while(prompt.equalsIgnoreCase("yes"));}}
