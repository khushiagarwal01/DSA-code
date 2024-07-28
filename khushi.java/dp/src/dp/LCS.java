package dp;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="abecd";
        String b="aecd";
        int n=a.length();
        int m=b.length();
        
        int res=LCS(a.toCharArray(),b.toCharArray(),n,m);
        System.out.print(res);
    }
    public static int LCS( char[] a,char [] b,int n,int m){
        if(n==0 || m==0){
            
            return 0;
        }
        if(a[n-1]==b[m-1]){
           return 1+LCS(a,b,n-1,m-1);
        }
        return Math.max(LCS(a,b,n-1,m),LCS(a,b,n,m-1));
    }
}
