import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 10 notas: ");
		int value = 1, count = 1, cuenta = 0, cuenta2 = 0;
		while (count <= 10) {
			System.out.println("Nota " + count + ":");
			value = sc.nextInt();

			if (value >= 7) {
				cuenta++;
			} else {
				cuenta2++;
			}
			count++;
		}
		System.out.println("Mayores o iguales a 7 = " + cuenta + "\n" + "Menores a 7 = " + cuenta2);

	}

}
