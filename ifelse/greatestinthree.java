package modevalue;

import java.util.Scanner;

public class greatestinthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number a= ");
        double a = sc.nextDouble();

        System.out.println("enter number b= ");
        double b = sc.nextDouble();

        System.out.println("enter number c= ");
        double c= sc.nextDouble();
        if(a>b){
            if(a>c){
                System.out.println(a);
            }
            else {
                System.out.println(c);
            }
        }
        else //mtlb b>a
        {
            if(b>c)
            {
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }

        // By Ternary Operator
        double greatest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("Greatest number is: " + greatest);
    }
}

