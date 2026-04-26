package modevalue;

import java.util.Scanner;

public class areaAndRactangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length =");
        double l = sc.nextDouble();
        System.out.println("enter bredth price=");
        double b = sc.nextDouble();
        double area = l * b;
        double persmeter = 2.0 * (l + b);

        if (area > persmeter) {
            System.out.println("Area is greatest =" + (area - persmeter));
        } else if (area < persmeter) {
            System.out.println("perameter is greatest =" + (persmeter - area));
        } else if (area == persmeter) {
            System.out.println("kaddu");
        }
        System.out.println("area =" + area +"Perameter =" +persmeter );
    }
}
