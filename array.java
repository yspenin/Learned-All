import java.util.Arrays;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = (int)(Math.random()*10)+1;
		int[] ar = new int[n];
		String A = Arrays.toString(ar);
		System.out.println("ar(n)="+n);
		
		for(int i=0; i<ar.length;i++) {
			System.out.println("ar["+i+"]="+ar[i]);
		}
	}
}
