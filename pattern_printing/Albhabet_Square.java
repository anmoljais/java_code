package pattern_printing;

public class Albhabet_Square {
    public static void main(String[] args) {
         int n=4;


         for(int i=97;i<100;i++){
             for(int j=1;j<=n;j++){
                 System.out.print((char)i);
             }
             System.out.println();
         }
        for(int i=1;i<5;i++) {
            for (int k = 68; k <= 68; k++) {
                System.out.print((char) k);
            }
        }
    }
}
