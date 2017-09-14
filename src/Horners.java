// Java program for implementation of Horner Method
// for Polynomial Evaluation

import java.io.*;
import java.util.Scanner;

class HornerPolynomial {

    static int horner(int poly[], int n, int x) {
        int result = poly[0];

        for (int i = 1; i < n; i++)
            result = result * x + poly[i];

        return result;
    }

    public static void main(String[] args) {
        // Let us evaluate value of 3 + 11x - 17x^2 + 2x^3
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();


        int[] poly = {2, -17, 11, 3};


        int n = poly.length;
        System.out.println("Value of polynomial is "
                + horner(poly, n, x));
    }
}
