package sessions.sessiontwo;

public class OperatorsThings {
	public static void main(String[] args) {
		int n = 7;
		System.out.println(n);
		n++;
		System.out.println(n++);
		System.out.println(n);
		System.out.println(++n);

		n = 0;
		n = n++ + 5;

		System.out.println(10 * 3);
		System.out.println(10 / 3.0);
		System.out.println(10 % 3);

		System.out.println(10 >> 2);
		System.out.println(10 >>> 2);

		System.out.println(-10 >> 2); // pastreaza semnul pe pozitia lui
		System.out.println(-10 >>> 2);// se shifteaza bitul de semn

		int n2 = 7;
		System.out.println(n2 = 10);// valoarea expresiei
		System.out.println(n2 == 10);// verificare conditie
		System.out.println(n2 != 10);

		System.out.println(10 & 5);

		System.out.println(n2 > 1 && n2 < 11);

	}
}
