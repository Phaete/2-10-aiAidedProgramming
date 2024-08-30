package com.phaete;

public class Main {
    public static void main(String[] args) {
        String hello = "Hello, World!";
        String elloh = reverseString(hello);
        System.out.println(elloh);

        String anna = "anna";
        System.out.println("anna is palindrome: " + isPalindrome(anna));
        System.out.println("Hello, World! is palindrome: " + isPalindrome(hello));

        int[] primes = generatePrimes(10);
        for (int prime : primes) {
            System.out.println(prime);
        }
    }

    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }


    public static boolean isPalindrome(String s) {
        String reversed = reverseString(s);
        return s.equals(reversed);
    }


    public static int[] generatePrimes(int n) {
        int[] primes = new int[n];
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                primes[count] = num;
                count++;
            }
            num++;
        }

        return primes;
    }


    private static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}