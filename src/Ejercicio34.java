import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca altura: ");
		int t = sc.nextInt();
		
		for (int a = 1; a <= t; a++) {
			System.out.println();

			for (int b = 1; b <= a; b++) {
				System.out.print(" *");
			}
		}
	}

}
