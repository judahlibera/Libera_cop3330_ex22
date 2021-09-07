/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Judah Libera
 */
import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.printf("Enter the second number: ");
        int n2 = sc.nextInt();
        System.out.printf("Enter the third number: ");
        int n3 = sc.nextInt();

        if (n1 == n2 || n1 == n3 || n2 == n3)
            return;

        int l = n1;
        if (n2 > l)
            l = n2;
        if(n3 > l)
            l = n3;

        System.out.printf("The largest number is %d", l);
    }
}