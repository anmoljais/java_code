package pattern_printing;

public class Bridge {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1;i==1;i++){
            for(int j=1;j<=9;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
//            //first pattern
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            //second space pattern
            for(int j = 1;j <=2*i-1;j++) {
                System.out.print(" ");
            }
            //third pattern
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
           System.out.println();

        }
    }}
