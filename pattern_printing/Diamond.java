package pattern_printing;

public class Diamond {
    public static void main(String[] args) {
        int n = 4;
        //part 1

        int nsp = n - 1;
        int nst = 1;

        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            nsp = nsp - 1;
            nst = nst + 2;
            System.out.println();
        }

        //Part 2
        nsp = 1;
        nst = n + 1;
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            nsp = nsp + 1;
            nst = nst - 2;
            System.out.println();
        }

    }

}
