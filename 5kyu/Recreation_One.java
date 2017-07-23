/*
https://www.codewars.com/kata/55aa075506463dac6600010d
Divisors of 42 are : 1, 2, 3, 6, 7, 14, 21, 42. These divisors squared are: 1, 4, 9, 36, 49, 196, 441, 1764. The sum of the squared divisors is 2500 which is 50 * 50, a square!

Given two integers m, n (1 <= m <= n) we want to find all integers between m and n whose sum of squared divisors is itself a square. 42 is such a number.

The result will be an array of arrays(in C an array of Pair), each subarray having two elements, first the number whose squared divisors is a square and then the sum of the squared divisors.

#Examples:

list_squared(1, 250) --> [[1, 1], [42, 2500], [246, 84100]]
list_squared(42, 250) --> [[42, 2500], [246, 84100]]
The form of the examples may change according to the language, see Example Tests: for more details.
*/
import java.util.*;
public class SumSquaredDivisors {
  
    public static String listSquared(long m, long n) {

        long sum=0;
        List<Long> lst=new ArrayList<>();
        List<List> l=new ArrayList<>();
        for (long i = m; i <=n ; i++,sum=0) {
            for (long j = 1; j <=i ; j++) {
                if (i%j==0){
                    sum+=Math.pow(j,2);
                }
            }
            if (sum%Math.sqrt(sum)==0){
                System.out.println(i+" "+sum);
                lst.add(i);
                lst.add(sum);
                l.add(lst);
                lst=new ArrayList<>();
            }
        }
        return l.toString();
    }
}