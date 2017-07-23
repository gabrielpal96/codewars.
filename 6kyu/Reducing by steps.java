/*
https://www.codewars.com/kata/56efab15740d301ab40002ee
Data: an array of integers, a function f of two variables and an init value.

Example: a = [2, 4, 6, 8, 10, 20], f(x, y) = x + y; init = 0

Output: an array of integers, say r, such that

r = [r[0] = f(init, a[0]), r[1] = f(r[0], a[1]), r[2] = f(r[1], a[2]), ...]

With our example: r = [2, 6, 12, 20, 30, 50]

#Task: Write the following functions of two variables

som : (x, y) -> x + y
mini : (x, y) -> min(x, y)
maxi : (x, y) -> max(x, y)
lcmu : (x, y) -> lcm(abs(x), abs(y) (see note for lcm)
gcdi : (x, y) -> gcd(abs(x), abs(y) (see note for gcd)
and

function oper_array(fct, arr, init) (or operArray or oper-array) where

fct is the function of to variables to apply to the array arr (fct will be one of som, mini, maxi, lcmu or gcdi)
init is the initial value
#Examples:

a = [18, 69, -90, -78, 65, 40]
oper_array(gcd, a, a[0]) => [18, 3, 3, 3, 1, 1]
oper_array(lcm, a, a[0]) => [18, 414, 2070, 26910, 26910, 107640]
oper_array(sum, a, 0) => [18, 87, -3, -81, -16, 24]
oper_array(min, a, a[0]) => [18, 18, -90, -90, -90, -90]
oper_array(max, a, a[0]) => [18, 69, 69, 69, 69, 69]
Notes:

The form of the parameter fct in oper_array (or operArray or oper-array) changes according to the language. You can see each form according to the language in "Your test cases".
AFAIK there are no corner cases, everything is as nice as possible.
lcm and gcd see: https://en.wikipedia.org/wiki/Least_common_multiple https://en.wikipedia.org/wiki/Greatest_common_divisor
you could google "reduce function (your language)" to have a general view about the reduce functions.
*/
import java.util.*;
import java.util.function.LongBinaryOperator;
public class Operarray {
    public static long som(long a, long b) {
        return a+b;
    }
    public static long maxi(long a, long b) {
        return (a>=b)?a:b;
    }
    public static long mini(long a, long b) {
        return (a<=b)?a:b;
    }
    public static long gcdi(long x, long y) {
        if (y==0)return x;
        else {
       return Math.abs(gcdi(y,x%y));
        }
    }
public static long lcmu(long a, long b) {
        return (Math.abs(a*b)/gcdi(a,b));
    }


    public static long[] operArray(LongBinaryOperator myFunc, long[] a, long init) {
        long[] r=new long[a.length];
        r[0]=myFunc.applyAsLong(init,a[0]);
        System.out.print(r[0]+" ");

        for (int i = 1; i <r.length ; i++) {
            r[i]=myFunc.applyAsLong(r[i-1],a[i]);
            
            System.out.print(r[i]+" ");
        }
        return r;
    }
}