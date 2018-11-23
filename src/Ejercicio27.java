import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero entre 1 y 10.");
		int num = sc.nextInt(), tabla = 0, count = 0;
		if (num > 0 && num < 13) {

			for (count = 1; count < 13; count++) {
				tabla = num * count;
				System.out.println(num + " x " + count + " = " + tabla);
			}
		} else {
			System.out.println("Ingrese un valor entre 1 y 10.");
		}

	}

}
