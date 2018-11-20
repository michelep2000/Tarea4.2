import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese 3 notas." + "\n" + "Nota 1: ");
		int nota1 = sc.nextInt();
		System.out.println("Nota 2: ");
		int nota2 = sc.nextInt();
		System.out.println("Nota 3: ");
		int nota3 = sc.nextInt();

		double promedio = (nota1 + nota2 + nota3) / 3;

		if (promedio >= 7) {
			System.out.println("Promocionado");
		} else {
			System.out.println("Deberias estudiar mas");
		}
	}

}
