package org.fasttrack.curs16.Recursivitate;

public class RecursiveObjects {

    private static int n;
    public int sumOfFirstNEvenInt(int n) {


        if (n == 0) {
            return 0;
        }
        if (n % 2 != 0) {
            return sumOfFirstNEvenInt(n - 1);
        }
        else {
            return n + sumOfFirstNEvenInt(n - 2);
        }
    }

    public int sumOfDigits(int n) {

        if (n == 0) {
            return 0;
        }
        else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }

    public int FibbArray(int n) {

        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return FibbArray(n - 1) + FibbArray(n - 2);
        }
    }


}
