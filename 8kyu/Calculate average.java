//Write function avg which calculates average of numbers in given list.

public class Kata{
  public static double find_average(int[] array){
        double av=0;
        for (int i = 0; i <array.length ; i++) {
            av+=array[i];
        }
        return av/array.length;
    }
}