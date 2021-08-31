package lesson01;

public class homework1 {
	public static void main(String[] args) {

		boolean a = true;
		char b = 1;
		byte ñ = 2;
		short d = 3;
		int e = 4;
		long f = 5;
		float g = 6;
		double h = 7;

		System.out.println("boolean max = True");
		System.out.println("boolean min = False");
		System.out.println("char max = " + (Character.MAX_VALUE + 0));
		System.out.println("char min = " + (Character.MIN_VALUE - 0));
		System.out.println("byte max = " + Byte.MAX_VALUE);
		System.out.println("byte min = " + Byte.MIN_VALUE);
		System.out.println("short max = " + Short.MAX_VALUE);
		System.out.println("short max = " + Short.MIN_VALUE);
		System.out.println("int max = " + Integer.MAX_VALUE);
		System.out.println("int min = " + Integer.MIN_VALUE);
		System.out.println("long max = " + Long.MAX_VALUE);
		System.out.println("long max = " + Long.MIN_VALUE);
		System.out.println("float max = " + Float.MAX_VALUE);
		System.out.println("float min = " + Float.MIN_VALUE);
		System.out.println("double max = " + Double.MAX_VALUE);
		System.out.println("double max = " + Double.MAX_VALUE);

		int[] array = { 5, 5, 3, 2, 1, 6, 5, 4, 7, 12 };

		int max = array[0];
		int min = array[0];

		for (int i = 0; i != array.length; i++) {
			if (array[i] > max) { 
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Max value " + max + " Min value " + min);
	}
}

// first commit to my reposetory1
