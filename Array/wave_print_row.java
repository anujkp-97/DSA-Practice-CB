package Array;
/*
 * input =  11 12 13 14
            21 22 23 24
            31 32 33 34
            41 42 43 44
    
    output= 11, 12, 13, 14, 24, 23, 22, 21, 31, 32, 33, 34, 44, 43, 42, 41, END
       index     00, 01, 02, 03, 13, 12, 11, 10, 20, 21, 22, 23, 33, 32, 31, 30
 */

import java.util.Scanner;

public class wave_print_row {
    public static void print(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;

        int ans[] = new int[n*m];
        int k =0;
        for(int i=0; i<n; i++)
        {
            if(i%2 ==0)
            {
                for(int j=0; j<m; j++)
                {
                    ans[k] = arr[i][j];
                    k++;
                }
            }else{
                for(int j=n-1; j>=0; j--)
                {
                    ans[k] = arr[i][j];
                    k++;
                }
            }
        }

        for(int i =0; i<ans.length; i++)
        {
            System.out.print(ans[i]+ ", ");
        }
        System.out.println("END");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // row
        int m = sc.nextInt();    //col
        int arr[][] = new int[n][m];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        print(arr);
        sc.close();
    }
    
}
