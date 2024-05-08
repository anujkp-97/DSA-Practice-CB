package Miscellaneous;

import java.util.Stack;

public class next_greater {
     
    public static void nsg(int arr[]){
        Stack<Integer> st = new Stack<>();

        int ans[] = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()] =-1;
        }

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static void main(String[] args) {
        
        int arr[] ={50,5,3,2,8,7,9,11,3};

        nsg(arr);
    }
    
}
