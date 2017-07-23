/*
https://www.codewars.com/kata/5656b6906de340bd1b0000ac
Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible, containing distinct letters,

each taken only once - coming from s1 or s2. #Examples: ``` a = "xyaabbbccccdefww" b = "xxxxyyyyabklmopq" longest(a, b) -> "abcdefklmopqwxy"
a = "abcdefghijklmnopqrstuvwxyz" longest(a, a) -> "abcdefghijklmnopqrstuvwxyz" ```
*/
public class TwoToOne {
 public static String longest (String s1, String s2) {
        String s3=s1+s2;
        String f=new String();
        char[] arr=s3.toCharArray();
         java.util.Arrays.sort(arr);
        String sort=new String(arr);
        for (int i = 0; i <s3.length()-1 ; i++) {
            if (sort.charAt(i)==sort.charAt(i+1)){

            }else {
                f+=sort.charAt(i);
            }
        }
        f+=sort.charAt(sort.length()-1);
	return f;
    }
}