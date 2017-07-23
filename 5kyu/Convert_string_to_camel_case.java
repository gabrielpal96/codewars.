/*
https://www.codewars.com/kata/517abf86da9663f1d2000003
Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized.

Examples:

// returns "theStealthWarrior"
toCamelCase("the-stealth-warrior") 

// returns "TheStealthWarrior"
toCamelCase("The_Stealth_Warrior")
*/
import java.lang.StringBuilder;
import java.util.StringTokenizer;
class Solution{

      static String toCamelCase(String s){
        StringTokenizer st=new StringTokenizer(s);
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='-'){
                st=new StringTokenizer(s,"-");
            }else if (s.charAt(i)=='_'){
                st=new StringTokenizer(s,"_");
            }
        }
        String s1=new String();
        String f=new String();
        int i=1;
        while (st.hasMoreTokens()){
            s1=st.nextToken();
            if (i!=1) {
                s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
            }i++;
            f+=s1;
            s1=null;
        }
        return f;
    }
}