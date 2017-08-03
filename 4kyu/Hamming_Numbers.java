/*
https://www.codewars.com/kata/526d84b98f428f14a60008da
A Hamming number is a positive integer of the form 2i3j5k, for some non-negative integers i, j, and k.

Write a function that computes the nth smallest Hamming number.

Specifically:

The first smallest Hamming number is 1 = 203050
The second smallest Hamming number is 2 = 213050
The third smallest Hamming number is 3 = 203150
The fourth smallest Hamming number is 4 = 223050
The fifth smallest Hamming number is 5 = 203051
The 20 smallest Hamming numbers are given in example test fixture.

Your code should be able to compute all of the smallest 5,000 (Clojure: 2000) Hamming numbers without timing out.
*/
public class Hamming {

   public static long hamming(int k){

        int two = 0;
       int three = 0;
        int five = 0;
        long[] A=new long[k];
        A[0] = 1;
        for (int i=1; i<k; i++){
            long min = (A[two] * 2 <= A[three] * 3)? A[two] * 2: A[three] * 3;
            min = (min <= A[five] * 5)? min: A[five] * 5;
            A[i] = min;
            if (min == A[two] * 2)
                two++;
            if (min == A[three] * 3)
                three++;
            if (min == A[five] * 5)
                five++;
        }
        return A[k-1];
    }
}