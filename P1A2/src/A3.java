import java.util.Arrays;
import java.util.Scanner;

public class A3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Wie viele Brüche sollen eingelesen werden: ");
		int size = in.nextInt();
		Bruch[] a = new Bruch[size];
		for(int i=0;i<size;i++) {
			System.out.print(i+1 + ". Bruch eingeben (zB 1/2): ");
			a[i] = Bruch.parseBruch(in.next());
		}
		Arrays.sort(a);
		System.out.println("Eingelesene Brüche: " + Arrays.toString(a));
		Bruch summe = new Bruch(0);
		for (Bruch b: a) {
			summe = summe.addiere(b);
		}
		Bruch mittel = summe.dividiere(new Bruch(a.length));
		System.out.println("Mittelwert aller Brüche: " + mittel.toString() + " = " + mittel.doubleValue());
		
		//System.out.println(summe.toString());
		//for(int i=0;i<a.length;i++) {
		//	System.out.println(a[i].toString());
		//}
		
	}

}
