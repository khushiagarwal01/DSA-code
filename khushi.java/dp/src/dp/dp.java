package dp;

public class dp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount=5;
		int coin[]= {1,2,5};
		System.out.println(coinChnage(coin,amount,0));
		
		System.out.println(bu(coin,amount));
	}
	
	public static int coinChnage(int coin[],int amount,int i) {
		if(amount==0) {
			return 1;
		}
		if(i==coin.length) {
			return 0;
		}
		
		int inc=0;
		if(amount>=coin[i]) {
			inc=coinChnage(coin,amount-coin[i],i);
		}
		int exc=coinChnage(coin,amount,i+1);
		return inc+exc;
	}
	
	public static int bu(int coin[],int amount) {
		int dp[][]=new int[coin.length+1][amount+1];
		
		for(int i=0;i<dp.length;i++) {
			
			dp[i][0]=1;
		}
		
		for(int i=1;i<dp.length;i++) {
			for(int am=1;am<dp[0].length;am++) {
				int inc=0;
				int exc=0;
				if(am>=coin[i-1]){
					inc=dp[i][am-coin[i-1]];
				}
				exc=dp[i-1][am];
				dp[i][am]=inc+exc;
			}
		}
		
		
		return dp[coin.length][amount];
		
	}



	}


