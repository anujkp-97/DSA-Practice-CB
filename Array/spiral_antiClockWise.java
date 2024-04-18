package Array;
/*
 * Sample Input
    4 4
    11 12 13 14
    21 22 23 24
    31 32 33 34
    41 42 43 44
    Sample Output
                    11, 21, 31, 41, 42, 43, 44, 34, 24, 14, 13, 12, 22, 32, 33, 23,END
 */

import java.util.Scanner;

public class spiral_antiClockWise {
    public static void spiral(int arr[][])
    {
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        spiral(arr);
        
    }
}
