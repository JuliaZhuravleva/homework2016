package classwork160404;

public class ShortCircuitOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 3;

		boolean r = x < y & (x = 10) < y;
		System.out.println(x);
	}

}
