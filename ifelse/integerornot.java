package integerornot;

import java.util.Scanner;

public class integerornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number=");
        double num = sc.nextDouble();
        //check integer
        if(num==(int)num){
            System.out.println("integer");
        }
        else {
            System.out.println("Not integer");
        }
    }
}
