package dp;

public class wine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] wine= {2,3,5,1,4};

	}
	public static int maximumprofit(int [] wine,int s,int e,int year) {
		if(s>e) {
			return 0;
		}
		int fs=wine[s]+year+maximumprofit(wine,s+1,e,year+1);
		int ls=wine[e] + year +maximumprofit(wine,s,e-1,year+1);
		return Math.max(fs, ls);
	}

}
