package sessions.sessiontwo;

public class Variables {
	int variabilaMembru;
	static int variabilaStatica;
	static final double CONSTANTA_PI = 3.14;

	public static void main(String[] args) {
		int variabilaLocala = 7;
		metoda(5);
		System.out.println(variabilaLocala);
		System.out.println(variabilaStatica);
		// System.out.println(variabilaMembru);// variabila membru nestatica nu
		// poate fi accesata dintr-o metoda statica
		// CONSTANTA_PI=2.14; // necompilabil atata timp cat e final
		metoda(variabilaLocala);
	}

	private static void metoda(int parametru) {
		System.out.println(parametru);
	}

}
