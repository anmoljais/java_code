package divisiblebyfiveornot;

import java.util.Scanner;

public class divisiblebyfive {
    public static void main(String[] args) {
        // divisible by 5 or not
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number=");
        int n= sc.nextInt();
        if(n%5==0)
        {
            System.out.println("number is divisble by 5");
        }
        else {
            System.out.println("not divisible by 5");
        }
    }
}
