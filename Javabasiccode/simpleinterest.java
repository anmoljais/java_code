package basics;

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter muldhan number :");
        int muldhan =sc.nextInt();
        System.out.println("ENter dar number :");
        float dar =sc.nextFloat();
        System.out.println("ENter time number :");
        int time =sc.nextInt();
        System.out.println("simple interest ="+(muldhan*dar*time)/100);

    }
}


