import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int a = 1; a <= t; a++) {
			for (int b = 1; b <= t; b++) {
				if (b == 1 || b == t || a == 1 || a == t) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
