package dp;

public class leetcode115 {

	public static void main(String[] args) {
		String s1="rabbbit";
		String s2="rabbit";
		System.out.println(subseq(s1,s2,0,0));

	} 
	public static int subseq(String s1,String s2,int i,int j) {
		if(j==s2.length()) {
			return 1;
		}
		if(i==s1.length()) {
			return 0;
		}
		int inc=0;
		
		if(s1.charAt(i)==s2.charAt(j)) {
			inc=subseq(s1,s2,i+1,j+1);
		}
		int exc=subseq(s1,s2,i+1,j);
		return inc+exc;
	}

}
