package sujoy;

public class StaticConcept {
	static int a = m1();

	static {

		System.out.println("static block");
	}

	{

		System.out.println("nsb");
	}

	public static void main(String[] args) {
		// StaticConcept ref = new StaticConcept();
	}

	private static int m1() {
		System.out.println("inside m1");
		return 100;
	}
}
