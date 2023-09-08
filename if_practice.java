
public class if_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int A = (int)(Math.random()*10000);
	System.out.println("Power="+A);
	
	if(A<1000){
		System.out.print("Rank=C");
	}
	if(A>1000&&A<5000){
		System.out.print("Rank=B");
	}if(A>5000){
		System.out.print("Rank=A");
	}
	
	}
}
