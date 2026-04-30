package loops;

import java.util.Scanner;

public class lowest_highst_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter terms :");
        int n=sc.nextInt();
        for(int i=1,j=n;i<=j;i++,j--){
            System.out.println(i+" ");
            if(i!=j){
                System.out.println(j+" ");
            }
        }
    }
}
