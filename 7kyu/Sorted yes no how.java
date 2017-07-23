/*
https://www.codewars.com/kata/580a4734d6df748060000045
Implement the method isSortedAndHow, which accepts an array of integers, and returns one of the following:

'yes, ascending' - if the numbers in the array are sorted in an ascending way
'yes, descending' - if the numbers in the array are sorted in a descending way
'no'
You can assume the array will always be valid, and there will always be one correct answer.
*/
class Solution {
  
    public static String isSortedAndHow(int[] arr) {
        String s=new String();
        boolean b=false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]<=arr[i+1]){
                b=true;
            }else {
                b = false;
                break;
            }
        }
        if(b) return "yes, ascending";
        else {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]>=arr[i+1]){
                    b=true;
                }else
                {b=false;
                break;}
            }
            if(b) return "yes, descending";
        }
        return "no";
    }
}