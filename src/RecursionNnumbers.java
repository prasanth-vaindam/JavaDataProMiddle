
public class RecursionNnumbers {

	static void printN(int n) {
		if(n>5) {
			return;
		}
		System.out.println(n);
		printN(n+1);		
	}
	public static void main(String[] args) {
		printN(1);
	}
}
