package pattern_printing;

public class space_then_vertical_rotated_star_triangle {
    public static void main(String[] args) {
        int n=4;
//        //extra line
        for(int i=1;i<=n+1;i++) {

                System.out.print("*");

        }
        System.out.println();
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();


        }
    }}

