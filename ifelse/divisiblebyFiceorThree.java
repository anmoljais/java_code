package modevalue;

import java.util.Scanner;

public class divisiblebyFiceorThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number=");
        double n = sc.nextDouble();
        if (n % 5 == 0 && n % 3 == 0) {
            System.out.println("by both");
        } else if (n % 5 == 0) {
            System.out.println("by 5");
        } else if (n%3==0) {
            System.out.println("BY 3");
        }
        else {
            System.out.println("kisi se nhi");
    }}}

