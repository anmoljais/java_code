package loops;
import java.util.Scanner;

public class AP_series_print {
    public static void main(String[] args) {
        //ap= 2,5,8,11......
        // a=2; d=3 ;  An= a+(n_1)d=>  3n-1

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=3*n-1;i=i+3)
        {
            System.out.print(i+" ");
        }}}