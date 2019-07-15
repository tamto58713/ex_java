
public class GCD {

	/**
	 * @param args
	 */
	public static int GCD(int a, int b ) {
		while (b != 0) {
			a = a % b;
			int temp = b;
			b = a;
			a = temp;
		}
		
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GCD(12, 15));

	}

}
