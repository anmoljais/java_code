package pattern_printing;

public class Alphanumeric {
    public static void main(String[] args) {
        int n = 5;
        // Odd rows → numbers
        for (int i = 1; i <= n; i++) {
        if (i % 2 != 0) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
        }
        // Even rows → alphabets
        else {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
        }

        System.out.println();
        //bhk


    }}}




