package loops;

import java.util.Scanner;

public class Prime_Number_Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Digit :");
        int n=sc.nextInt();
        boolean flag = true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                flag=false;
            }
        }
        if(flag==true){
            System.out.println("prime number");
        } else{
            System.out.println("Composite number");
        }
    }
}
