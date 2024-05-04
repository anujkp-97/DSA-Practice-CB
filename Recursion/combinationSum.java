package Recursion;
import java.util.*;
public class combinationSum {

    public static void Combination(int[] coin, int amount, String ans, int idx, List ll) {
		if (amount == 0) {
			// System.out.println(ans);
			ll.add(ans);
			return;
		}
		for (int i = idx; i < coin.length; i++) {

			if (amount >= coin[i]) {
//						amount -= coin[i];
				Combination(coin, amount - coin[i], ans + coin[i], i,ll);
				// amount += coin[i];
			}
		}

	}
    public static void main(String[] args) {
        
        int[] coin = { 2, 3, 5 };
		int amount = 7;
		List ll = new ArrayList<>();
		Combination(coin, amount, "", 0, ll);
		
		System.out.println(ll);

    }

}
