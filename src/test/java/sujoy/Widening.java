package sujoy;

public class Widening {
	public static void main(String[] args) {
		byte b = 9;
		call(b, b, b);
	}

	private static void call(int x,int y,int z) {

		System.out.println("int");

	}

	private static void call(byte... z) {

		System.out.println("int1");
	}
}
