package pattern_printing;

public class horizental_floyed_Alphabet_triangle {
    public static void main(String[] args) {


        int n = 4;
        for (int i= 0; i <= n-1; i++) {
            //spaces
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            int ch=('A'+i);
            for (int j = 0; j<=i; j++) {

                System.out.print((char)ch);





            }

            System.out.println();
        }
    }
}
