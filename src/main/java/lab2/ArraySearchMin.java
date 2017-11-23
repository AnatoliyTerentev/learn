package lab2;

public class ArraySearchMin
{
    public static void main (String[] args){
        int[]arr = {1,3,4,5,7,8};
        int min = arr[0];
                for (int i = 0; i < arr.length; i++)
                {
                    if (min > arr [i]) min = arr[i] ;
                }
        System.out.println (min);
    }

}
