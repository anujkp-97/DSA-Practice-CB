package StackAndQueue;

import java.util.Stack;

public class construct_DI_String {
    public static String Construct_Smallest_Number(String str) {
		int[] ans = new int[str.length() + 1];
		Stack<Integer> st = new Stack<>();
		int c = 1;
		for (int i = 0; i <= str.length(); i++) {
			if (i == str.length() || str.charAt(i) == 'I') {
				ans[i] = c++;
				while (!st.isEmpty()) {
					ans[st.pop()] = c++;
				}

			} else {
				st.push(i);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ans.length; i++) {
			sb.append(ans[i]);
		}
		return sb.toString();

    }
    
    public static void main(String[] args) {
        String s ="IIIDIDDD";

        String ans =  Construct_Smallest_Number(s);
        System.out.println(ans);
    }
}
