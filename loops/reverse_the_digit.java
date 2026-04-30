package loops;

import java.util.Scanner;

public class reverse_the_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter terms :");
        int n=sc.nextInt();
        int rev= 0;
        while(n>0){
            int digit =n%10;
            rev=10*rev+digit;
            n=n/10;

        }
        System.out.println(rev);
    }
}
