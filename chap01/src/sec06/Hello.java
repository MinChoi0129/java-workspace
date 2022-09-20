package sec06;

public class Hello {
	public static void main(String[] args) {
		int a = 1, b = 2;
		switch (a++) {
			case 1: b += a;
			case 2: b += 5;
		}
		System.out.println(b);

		int c = 1, d = 2;
		switch (c++) {
			case 1 -> d += c;
			case 2 -> d += 5;
		}
		System.out.println(d);
	}
}