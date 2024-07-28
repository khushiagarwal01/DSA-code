package dp;

public class russiondoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {10,9,2,5,3,7,101,18};
		System.out.println(LIS(arr));
		

	}
	public static int LIS(int  arr[]) {
		int [] dp=new int[arr.length];
		dp[0]=arr[0];
		int len=1;
		for(int i=1;i<arr.length;i++) {
			if(dp[len-1]<arr[i]) {
				len++;
			}
			else {
				int idx=BinarySearch(dp,0,len,arr[i]);
				dp[idx]=arr[i];
			}
		}
		return len;
	}
	public static int BinarySearch(int [] dp,int lo,int hi,int item) {
		int ans=-1;
		int mid=lo+(hi-lo)/2;

		while(lo<=hi) {
			if(dp[mid]>item) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
			mid=lo+(hi-lo)/2;
		}
		return ans;
	}

}
