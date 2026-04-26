package modevalue;

import java.util.Scanner;

public class findTheQuadrents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number x = ");
        double x = sc.nextDouble();
        System.out.print("enter number y = ");
        double y = sc.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("1st quadrent");
        } else if (x < 0 && y > 0) {
            System.out.println("2nd quadrent");
        } else if (x < 0 && y < 0) {
            System.out.println("3rd quadrent");
        } else if (x > 0 && y < 0) {
            System.out.println("4th quadrent");
        } else {
            System.out.println("at oeigin");
        }
    }
}
