package modevalue;

import java.util.Scanner;

public class profitloss {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost price=");
        double cp = sc.nextDouble();
        System.out.println("enter sell price=");
        double sp = sc.nextDouble();
        if(cp>sp){
            System.out.println("loss ="+(cp-sp));
        }
        else if(cp<sp){
            System.out.println("profit ="+(sp-cp));
        }
        else if(cp==sp){
            System.out.println("kaddu");
        }

    }
}