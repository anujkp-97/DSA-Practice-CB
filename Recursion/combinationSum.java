package Recursion;
public class combinationSum {

    public static void Combination(int[] coin, int amount, String ans, int idx) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < coin.length; i++) {

			if (amount >= coin[i]) {
//						amount -= coin[i];
				Combination(coin, amount - coin[i], ans + coin[i], i);
				// amount += coin[i];
			}
		}

	}
    public static void main(String[] args) {
        
        int[] coin = { 2, 3, 5 };
		int amount = 7;
		Combination(coin, amount, "", 0);

    }

}
