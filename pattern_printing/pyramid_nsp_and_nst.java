package pattern_printing;

public class pyramid_nsp_and_nst {
    public static void main(String[] args) {

        // trust rkh bhai

        int n=4;
        int nsp=n-1;
        int nst=1;

        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            nsp=nsp-1;
            nst=nst+2;
            System.out.println();
        }
    }
}
