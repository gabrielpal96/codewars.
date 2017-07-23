/*
https://www.codewars.com/kata/5898b4b71d298e51b600014b
#Srot the inner ctnnoet in dsnnieedcg oredr

You have to sort the inner content of every word of a string in descending order.
The inner content is the content of a word without first and the last char.

Some examples:

"sort the inner content in descending order" -> "srot the inner ctonnet in dsnnieedcg oredr"
"wait for me" -> "wiat for me"
"this kata is easy" -> "tihs ktaa is esay"
The string will never be null and will never be empty.
It will contain only lowercase-letters and whitespaces.

In C++ the string is always 0-terminated. 


Have fun coding it and please don't forget to vote and rank this kata! :-)

I have also created other katas. Take a look if you enjoyed this kata!
*/
import java.util.*;
public class Kata
{
    public static String sortTheInnerContent(String w)
    {
        String s = new String();
        String tmp = new String();
        StringTokenizer st = new StringTokenizer(w," ",true);
        w="";
        while (st.hasMoreTokens()) {
            s = st.nextToken();
            char[] c = s.toCharArray();
            if (s.charAt(0)==' '){w+=" ";  continue;}
            if (s.length()>1) {
                Arrays.sort(c, 1, s.length() - 1);
                char ctmp;
                for (int i = 1, k = c.length - 2; i < c.length - 2; i++, k--) {
                    if (k <= i) break;
                    ctmp = c[i];
                    c[i] = c[k];
                    c[k] = ctmp;
                }
            }
            String f = new String(c);
            w+=f;
        }
        return w;
    }
}