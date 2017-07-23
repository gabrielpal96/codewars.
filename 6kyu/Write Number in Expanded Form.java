/*
https://www.codewars.com/kata/5842df8ccbd22792a4000245
Write Number in Expanded Form

You will be given a number and you will need to return it as a string in Expanded Form. For example:

Kata.expandedForm(12); # Should return "10 + 2"
Kata.expandedForm(42); # Should return "40 + 2"
Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
NOTE: All numbers will be whole numbers greater than 0.
*/
public class Kata
{

    public static String expandedForm(int num)
    {
        String s=new String();
        java.util.List<Integer> l=new java.util.ArrayList<>();
        while (num % 10!=0||num>=10) {
            l.add(num%10);
            num/=10;
        }
        for (int i =l.size()-1; i >=0 ; i--) {
            if(l.get(i)!=0) {
                s += (int) (l.get(i) * Math.pow(10, i))+" + ";
            }
        }
        return s.substring(0, s.length()-3);
    }
}