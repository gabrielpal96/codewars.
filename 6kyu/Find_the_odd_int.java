/*
https://www.codewars.com/kata/54da5a58ea159efa38000836
Given an array, find the int that appears an odd number of times.

There will always be only one integer that appears an odd number of times.
*/
import java.util.Arrays;
public class FindOdd {
 public static int findIt(int[] arr) {
        int cnt=0;
        int pos=0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = pos; j < arr.length; j++) {
                if (arr[i]==arr[j])cnt++;
                else{
                    pos=j;
                    break;
                }
            }
                if (cnt%2!=0)return arr[i];
            else cnt=0;
        }
        return 0;
    }
}