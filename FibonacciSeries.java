package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// to find fibonacci series for a given range=8
		int range = 7;
		int f1 = 0;
		int f2 = 1;
		System.out.println(f1);
		System.out.println(f2);
		for (int i = 1; i < range; i++) {
			int sum = f1 + f2;
			f1 = f2;
			f2 = sum;
			System.out.println(sum);

		}
	}

}
