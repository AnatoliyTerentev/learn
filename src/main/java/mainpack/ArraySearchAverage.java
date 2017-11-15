package mainpack;

public class ArraySearchAverage {
    public static void main(String[] args)
    {
        int[] arr = {2, 1, 2};
        double sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }

        double av = sum/arr.length;
        System.out.println(av);
    };
}
