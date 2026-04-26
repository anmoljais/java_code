package pattern_printing;

public class reversealphaTriangle {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <n; i++) {
            for (int j = n; j > i; j--) {
                int ch=65+i;
                System.out.print((char)ch);

            }
            System.out.println();
        }
    }}


