package sessions.sessionone;

import java.util.Scanner;

public class HelloUser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// un obiect numit scaner care
													// stie sa introduca de la
													// tastatura

		String name = scanner.nextLine();
		System.out.println("Hello, " + name + "! ");

		scanner.close();
	}
}
