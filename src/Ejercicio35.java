import java.util.Scanner;

public class Ejercicio35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca altura: ");
		int c = sc.nextInt(), count = c;
		for (int a = 0; a < 5; a++) {
			for (int b = 0; b < 5; b++) {
				if (count < 10) {
					System.out.print(" ");
				}
				System.out.print(" " + count);
				count++;
			}
			System.out.println();
		}
	}
}
