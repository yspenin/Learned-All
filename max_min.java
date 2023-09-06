import java.util.Arrays;
public class max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int n = (int)(Math.random()*99)+1;
		int[] a = new int[n];
		for(int i = 0;i<n;i++){
			a[i] = (int)(Math.random()*1000);
		}
	String A = Arrays.toString(a);
	System.out.println(A);
		int max = 0;
		int min = 1000;
		for(int i = 0; i < n; i++){			
			 if(a[i]>max){
				 max=a[i];
			 }if(a[i]<min){
				 min=a[i];
			 }
		}
		System.out.println(max);
		System.out.println(min);
	}	
}		