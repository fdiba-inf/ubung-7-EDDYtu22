package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {

        for (int i = n; i >= 1; i--){
             if (isPrime(i)) {
                 System.out.println(i);
             }

         }
    }

    public static boolean isPrime(int n) {
        boolean flag = true;
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                flag = false;
                break;
            }
            i++;
        }
        return flag;


    }
}

