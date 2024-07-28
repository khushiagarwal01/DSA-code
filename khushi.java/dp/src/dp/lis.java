package dp;

import java.util.Arrays;

public class lis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int [] arr= {10,9,2,5,3,7,101,18};
          System.out.println(LIS(arr));
	}
	public static int LIS(int [] arr) {
		int [] dp=new int[arr.length];
		Arrays.fill(dp, 1);
		for(int i=1;i<dp.length;i++) {
			for(int j=i-1;j>=0;j--) {
				if(arr[j]<arr[i]) {
					int x=dp[j] + 1;
					dp[i]=Math.max(dp[i], x);
				}
			}
		}
		int max= Arrays.stream(dp).max().getAsInt();
		return max;
	}

}
