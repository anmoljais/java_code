package agrmgr;
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        //odd or even
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number=");
        int n= sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
        }
    }
}
