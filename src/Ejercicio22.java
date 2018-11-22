import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = 0, cuenta = 0;
		System.out.println("El programa finaliza con el numero 9999." + "\n");
		System.out.println("Introduzca cualquier numero: ");
		do {
			value = sc.nextInt();
			if (value != 9999) {
				cuenta += value;
			}
		} while (value != 9999);
		System.out.println("La suma de todos los digitos que introdujo es: " + cuenta);

	}
}
