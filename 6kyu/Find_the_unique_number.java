/*
https://www.codewars.com/kata/585d7d5adb20cf33cb000235
There is an array with some numbers. All numbers are equal except for one. Try to find it!

Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
It’s guaranteed that array contains more than 3 numbers.
*/
// Make sure your class is public
 public class Kata {
    public static double findUniq(double arr[]) {
      if (arr[0]!=arr[1]&&arr[0]!=arr[2])return arr[0];
        for (int i= 0; i < arr.length-1; i++) {
            if (arr[i]!=arr[i+1]) {
               return arr[i+1];
            }
        }
       return 0;
    }
}