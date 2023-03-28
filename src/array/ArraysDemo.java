package array;

import java.lang.*;
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[]arr ;
        int arr2[];

        arr = new int[10];
//        System.out.println(arr.length );
        System.out.println(arr[0]);

        double[] arr3=new double[10];
//        System.out.println(arr3[0]);

        boolean[] arr4=new boolean[10];
//        System.out.println(arr4[0]);

//        System.out.println(arr4[10]);

        int[] arr5={3,2,1};
        int[][] matrix={  // int[] - este int array type si int[][] - array de int array type
                {1,2,3},
                {4,5,6}
        };

        System.out.println(matrix[0][2]); // aici indexul se poate identifica ca fiind [linia 1][elementul 3 de pe linia 1]

        int[][] matrix2= new int[10][];
        System.out.println(matrix2[0]);

        System.out.println(Arrays.toString(arr5));  // " "
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5));
    }
}
