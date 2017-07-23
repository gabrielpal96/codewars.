/*
https://www.codewars.com/kata/5517fcb0236c8826940003c9
You will have a list of rationals in the form

m = [ [numer_1, denom_1] , ... , [numer_n, denom_n] ] or m = [ (numer_1, denom_1) , ... , (numer_n, denom_n) ]

where all numbers are positive integers. You have to produce the sum N/D of these rationals in an irreducible form ie N and D have only 1 for divisor.

The result will be written in the form

[N, D] in Ruby/Python/Clojure/JS/CS/PHP
Just "N D" in Haskell or Some "N D" in F#
Some((N, D)) in Rust
"[N, D]" in Java, CSharp, TS
{N, D} in C++
{N, D} in Elixir
#Example:

[ [1, 2], [1, 3], [1, 4] ] ----> 
[13, 12] or: Just "13 12" (Haskell) or: "[13, 12]" (Java, CSharp, TS) or: {13, 12} (C++, Elixir), (Some "13 12") Fsharp, (13, 12) Swift
#Notes:

If m is [] return

nil/None/null (Ruby/Elixir/Clojure/Python/JS/CS/TS/Java/CSharp/PHP/Swift)
Nothing (Haskell) None (F#, Rust)
{0, 1} (C++, C)
If D divise N return:

N/D as an integer: n (Ruby/Elixir/Clojure/Python/JS/CS/PHP)
Just "n" (Haskell), Some "n" (Haskell), "n" (Java, CSharp, TS), {n, 1} (C++, C)
Some((n, 1)) (Rust), (Some "n") Fsharp, (n, 1) Swift
See: Example Tests for more examples
*/
import java.util.*;

class SumFractions {
       public static int gcdi(int x, int y) {
        if (y==0)return x;
        else {
            return Math.abs(gcdi(y,x%y));
        }
    }
    public static int lcmu(int a, int b) {
        return Math.abs((a*b)/gcdi(a,b));
    }
    public static String sumFracts(int[][] l) {
    if (l.length==0)return null;
        int x=0,y=0,x1=0,y1=0;
        int lcm=0;
        List<Integer> lst=new ArrayList<>();
        x=l[0][0];
        y=l[0][1];
        if (y==0)return ""+0;
        for (int i = 0,j=0; i <l.length-1 ;i++) {
            x1 = l[i + 1][j];
            y1 = l[i + 1][j+1];
            if (y1==0)return ""+0;
            lcm=lcmu(y,y1);
            x=((lcm/y)*x)+((lcm/y1)*x1);
            y=lcm;
        }
         if (y/gcdi(x,y)==0) return ""+0;
        if (y/gcdi(x,y)==1) {
            return ""+(x/gcdi(x,y));
        }else {
            lst.add(x / gcdi(x, y));
            lst.add(y / gcdi(x, y));
            return lst.toString();
        }
    }
}