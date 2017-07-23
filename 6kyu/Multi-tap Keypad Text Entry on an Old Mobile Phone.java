/*
https://www.codewars.com/kata/54a2e93b22d236498400134b
Prior to having fancy iPhones, teenagers would wear out their thumbs sending SMS messages on candybar-shaped feature phones with 3x4 numeric keypads.

------- ------- -------
|     | | ABC | | DEF |
|  1  | |  2  | |  3  |
------- ------- -------
------- ------- -------
| GHI | | JKL | | MNO |
|  4  | |  5  | |  6  |
------- ------- -------
------- ------- -------
|PQRS | | TUV | | WXYZ|
|  7  | |  8  | |  9  |
------- ------- -------
------- ------- -------
|     | |space| |     |
|  *  | |  0  | |  #  |
------- ------- -------
Prior to the development of T9 (predictive text entry) systems, the method to type words was called "multi-tap" and involved pressing a button repeatedly to cycle through the possible values.

For example, to type a letter "R" you would press the 7 key three times (as the screen display for the current character cycles through P->Q->R->S->7). A character is "locked in" once the user presses a different key or pauses for a short period of time (thus, no extra button presses are required beyond what is needed for each letter individually). The zero key handles spaces, with one press of the key producing a space and two presses producing a zero.

In order to send the message "WHERE DO U WANT 2 MEET L8R" a teen would have to actually do 47 button presses. No wonder they abbreviated.

For this assignment, write a module that can calculate the amount of button presses required for any phrase. Punctuation can be ignored for this exercise. Likewise, you can assume the phone doesn't distinguish between upper/lowercase characters (but you should allow your module to accept input in either for convenience).

Hint: While it wouldn't take too long to hard code the amount of keypresses for all 26 letters by hand, try to avoid doing so! (Imagine you work at a phone manufacturer who might be testing out different keyboard layouts, and you want to be able to test new ones rapidly.)
*/
public class Keypad {
    public static int presses(String phrase) {
        int sum=0;
                phrase=phrase.toUpperCase();
        for (int i = 0; i <phrase.length() ; i++) {
            if(phrase.charAt(i)=='A'||phrase.charAt(i)=='D'||phrase.charAt(i)=='G'||phrase.charAt(i)=='J'||phrase.charAt(i)=='M'||phrase.charAt(i)=='P'||phrase.charAt(i)=='T'
                    ||phrase.charAt(i)=='W'||phrase.charAt(i)=='*'||phrase.charAt(i)=='#'||phrase.charAt(i)==' '||phrase.charAt(i)=='1') sum+=1;
            else if(phrase.charAt(i)=='B'||phrase.charAt(i)=='E'||phrase.charAt(i)=='H'||phrase.charAt(i)=='K'||phrase.charAt(i)=='N'||phrase.charAt(i)=='Q'||phrase.charAt(i)=='U'
                    ||phrase.charAt(i)=='X'||phrase.charAt(i)=='0') sum+=2;
            else if(phrase.charAt(i)=='C'||phrase.charAt(i)=='F'||phrase.charAt(i)=='I'||phrase.charAt(i)=='L'||phrase.charAt(i)=='O'||phrase.charAt(i)=='R'||phrase.charAt(i)=='V'
                    ||phrase.charAt(i)=='Y') sum+=3;
            else if(phrase.charAt(i)=='S'||phrase.charAt(i)=='Z'||phrase.charAt(i)=='2'||phrase.charAt(i)=='3'||phrase.charAt(i)=='4'||phrase.charAt(i)=='5'||phrase.charAt(i)=='6'||phrase.charAt(i)=='8') sum+=4;
            else  if(phrase.charAt(i)=='7'||phrase.charAt(i)=='8') sum+=5;

        }
        return sum;
    }
}