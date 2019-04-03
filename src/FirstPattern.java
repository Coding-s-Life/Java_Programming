
public class FirstPattern {

	public static void main(String[] args) {

		System.out.println("Pattern A");
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
}
