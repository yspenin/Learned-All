import java.util.Arrays;
public class max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final int n = (int)(Math.random()*100);
	int[] a = new int[n];
	for(int i = 1;i<=n;i++){
		a[i-1] = (int)(Math.random()*1000);
	}
	String A = Arrays.toString(a);
	System.out.print(A);
	}	
}		