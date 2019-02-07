package sessions.sessiontwo;

public class PrimitivesThings {
	public static void main(String[] args) {
		byte b = 100;
		System.out.println(b);
		byte b2 = (byte) 20000; // cast
		int n = (int) 13.7;

		System.out.println(b2);
		System.out.println(n);

		char ch = 'A';
		ch++;
		System.out.println(ch);
		int n2 = ch;
		System.out.println(n2);

		char ch2 = '\\';
		System.out.println(ch2);
		ch2 = '\'';
		System.out.println(ch2);
		ch2 = '\"';
		System.out.println(ch2);
		System.out.println("\n\r");

		boolean boo1 = true;
		boolean boo2 = false;
		System.out.println(boo1);
		System.out.println(boo2);
	}

}
