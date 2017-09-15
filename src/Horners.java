// Java program for implementation of Horner Method
// for Polynomial Evaluation

import java.util.Scanner;

class HornerPolynomial {

    static int horner(int poly[], int n, int x) {
        int result = poly[0];

        for (int i = 1; i < n; i++)
            result = result * x + poly[i];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();


        int[] poly = {4, 8, 0, 1, 2};


        int n = poly.length;
        System.out.println("Value of polynomial is "
                + horner(poly, n, x));
    }
}
