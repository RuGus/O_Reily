public class Loopy {
	public static void main (String[] args){
		int x=1;
		System.out.println("Before cycle");
		while (x<=4) {
			System.out.println("Inside cycle");
			System.out.println("X is "+x);
			x=x+1;
		}
		System.out.println("After cycle X is "+x);
	}
}