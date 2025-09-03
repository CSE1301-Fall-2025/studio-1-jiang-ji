package studio1;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = in.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println(year+"is a Leap year: "+isLeapYear);
        }
    }