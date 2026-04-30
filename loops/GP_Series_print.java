package loops;

import java.util.Scanner;

public class GP_Series_print {
    public static void main(String[] args) {
        //GP= 1,2,4,8,16
        //a=2 r=2
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1,r=2;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a=a*r;
        }
        }
}
