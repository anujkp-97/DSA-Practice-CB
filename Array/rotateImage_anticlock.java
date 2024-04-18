package Array;
/*
 * Sample Input                   output                                          
    4                               4 8 12 16 
    1 2 3 4                         3 7 11 15 
    5 6 7 8                         2 6 10 14 
    9 10 11 12                      1 5 9  13 
    13 14 15 16

 */

public class rotateImage_anticlock {
    public static void print(int arr[][])
    {
        int n = arr.length;
        int ans[][] = new int[n][n];
        int j=0,k=3;
        for(int i=0; i<n; i++)
        {
            j=0; k=3;
            while(j<n && k>=0){
                ans[k][i] = arr[i][j];
                k--;
                j++;
            }
        }
        // print the matrix
        for(int i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = { 
                        { 1, 2, 3 ,4},
                         {5, 6, 7 ,8},
                        {9 ,10 ,11 ,12},
                        {13, 14 ,15 ,16}

                        };

            print(arr);
    }
    
}
