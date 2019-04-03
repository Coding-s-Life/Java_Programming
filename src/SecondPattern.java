
public class SecondPattern {

	public static void main(String[] args) {
		System.out.println("Pattern B");
		int max = 6;
		for(int x=1; x<=6; x++) {
			for (int y=1; y<=max; y++) {
				System.out.print(y + " ");				
			}
			max--;
			System.out.println();
		}
	}

}
