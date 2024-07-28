/**
 * 
 */
package dp;

import java.util.Arrays;

/**
 * @author hp
 *
 */
public class valentine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] boys= {2,11,3};
      int [] girls= {5,7,3,2};
      Arrays.sort(boys);
      Arrays.sort(girls);
      System.out.println(solve(boys,girls,0,0));
	}
	public static int solve(int [] boys,int [] girls,int i,int j) {
		if(i==boys.length) {
			return 0;
		}
		if(j==girls.length) {
			return 999999;
		}
		int pair=Math.abs(boys[i]-girls[j])+solve(boys,girls,i+1,j+1);
		int nopair=solve(boys,girls,i,j+1);
		return Math.min(pair, nopair);
	}

}
