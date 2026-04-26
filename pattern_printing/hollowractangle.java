package pattern_printing;

public class hollowractangle {
    public static void main(String[] args) {
        int n=5;
        int col=7;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==n||j==1||j==col){
                    System.out.print("*" + " ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}


