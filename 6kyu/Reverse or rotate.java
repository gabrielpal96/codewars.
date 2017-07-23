/*
https://www.codewars.com/kata/56b5afb4ed1f6d5fb0000991
The input is a string str of digits. Cut the string into chunks (a chunk here is a substring of the initial string) of size sz (ignore the last chunk if its size is less than sz).

If a chunk represents an integer such as the sum of the cubes of its digits is divisible by 2, reverse that chunk; otherwise rotate it to the left by one position. Put together these modified chunks and return the result as a string.

If

sz is <= 0 or if str is empty return ""
sz is greater (>) than the length of str it is impossible to take a chunk of size sz hence return "".
Examples:
revrot("123456987654", 6) --> "234561876549"
revrot("123456987653", 6) --> "234561356789"
revrot("66443875", 4) --> "44668753"
revrot("66443875", 8) --> "64438756"
revrot("664438769", 8) --> "67834466"
revrot("123456779", 8) --> "23456771"
revrot("", 8) --> ""
revrot("123456779", 0) --> "" 
revrot("563000655734469485", 4) --> "0365065073456944"
*/
class RevRot {
    
    public static String revRot(String str, int sz) {
        String tmp=new String();
        String f=new String();
        int sum=0;
        int first=0;
        int end=sz;
        if (sz<=0)return "";
        for (int i1 = 0; i1 < str.length()/sz; i1++,sum=0,end+=sz, first+=sz) {
            for (int i =first; i <end ; i++) {
                sum+=Math.pow(str.charAt(i)-48,2);
            }
            if (sum%2==0){
                for (int i = end-1; i >=first ; i--) {
                    f+=str.charAt(i);
                }
            }else {
                tmp=str.substring(first+1,end);
                f+=tmp+""+str.charAt(first);
                //  System.out.println(f);
            }
        }
        return f;
    }
}