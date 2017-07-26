/*
https://www.codewars.com/kata/pure-odd-digits-primes/java
Primes that have only odd digits are pure odd digits primes, obvious but necessary definition. Examples of pure odd digit primes are: 11, 13, 17, 19, 31... If a prime has only one even digit does not belong to pure odd digits prime, no matter the amount of odd digits that may have.

Create a function, only_oddDigPrimes(), that receive any positive integer n, and output a list like the one bellow:

[number pure odd digit primes bellow n, largest pure odd digit prime smaller than n, smallest pure odd digit prime higher than n]

Let's see some cases:

only_oddDigPrimes(20) ----> [7, 19, 31]
///7, beacause we have seven pure odd digit primes bellow 20 and are 3, 5, 7, 11, 13, 17, 19
19, because is the nearest prime of this type to 20
31, is the first pure odd digit that we encounter after 20///

only_oddDigPrimes(40) ----> [9, 37, 53]
In the case that n, the given value, is a pure odd prime, should be counted it with the found primes and search for the inmediately bellow and the inmediately after.
*/
package com.company;
import java.util.*;

public class Main {
    public static boolean isPrime(long n){
        boolean f = false;
        boolean t = true;
        int cnt=0;
        if (n%2==0) return false;
        if (n != 0) {
            for (int j = 2; j <=Math.sqrt(n); j++) {
                if (n % j == 0) {
                    cnt++;
                    if (cnt>3)return false;
                    f = true;
                }
            }
        }
        if (!f && n != 0 && n != 1) {
            long tmp=n;
            while (tmp!=0&&n>10) {
                if ((tmp % 10) % 2 == 0)return false;
                tmp/=10;
            }
            if (t) return true;
        }
        return false;
    }
    public static long[] onlyOddDigPrimes(long nn) {
        List<Long> l=new ArrayList<>();
        for (long i = 3; i <nn ; i++) {
            if (isPrime(i)) l.add(i);
        }
        for (long i=nn+1;;i++){
            if (isPrime(i)){
                l.add(i);
                break;
            }
        }
        return new long[]{l.size()-1,l.get(l.size()-2),l.get(l.size()-1)};
    }
	
    public static void main(String[] args) {
        long nn=40;
        long[] arr=onlyOddDigPrimes(nn);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
