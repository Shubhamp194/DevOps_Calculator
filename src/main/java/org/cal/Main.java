package org.cal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number to start the program\n");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        while(true) {
            System.out.println("***********************************CALCULATOR***********************************");
            System.out.println("What do you want to do ?");
            System.out.println("1.Square root \n2.Factorial  \n3.Natural Log \n4.Power \nAny other integer to Quit");
            System.out.print("\n Enter your choice : ");
            int ch = sc.nextInt();
            int res = 0;
            switch (ch) {
                case (1):
                    res = squareroot();
                    break;
                case (2):
                    res = factorial();
                    break;
                case (3):
                    res = log();
                    break;
                case (4):
                    res = power();
                    break;
                default:
                    System.out.println("Closing the application");
                    return;
            }
            System.out.println("Result : " + res);
        }
    }

    static int factorial(){
        int res = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            res *= i;
        }
        return res;
    }

    static int power(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n = sc.nextInt();
        System.out.print("Enter power : ");
        int p = sc.nextInt();
        return (int)Math.pow(n, p);
    }

    static int log(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n = sc.nextInt();
        return (int)Math.log(n);
    }

    static int squareroot(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        double n = sc.nextInt();
        return (int)Math.sqrt(n);
    }

}
