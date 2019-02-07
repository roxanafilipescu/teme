package sessions.sessiontwo;

public class LiteralThing {
	public static void main(String[] args) {
		int n = 100;
		n = 0xFFFF;
		n = 0b01110110;
		long l = 100000000000L;

		double db1 = 3.14d;
		float f = 3.14F;
		System.out.println(n);
		System.out.println(l);
		System.out.println("\u0035");

		String s = null;// un obiect este neinitializat
		// System.out.println(s.length());//eroare pentru ca obiectul s este nul

	}

}
