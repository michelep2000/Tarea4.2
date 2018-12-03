import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Numero de triangulos:");
		int triangulo = sc.nextInt(), a = 0, b = 0, c = 0, t1 = 0, t2 = 0, t3 = 0;
		String respuesta1 = "", respuesta2 = "";

		for (int i = 1; i <= triangulo; i++) {
			System.out.println("Triangulo " + i + ":");
			System.out.print("lado a: ");
			a = sc.nextInt();
			System.out.print("Lado b: ");
			b = sc.nextInt();
			System.out.print("Lado c: ");
			c = sc.nextInt();
			if (a == b && a == c && b == c) {
				t1++;
				respuesta1 = "Es equilatero";
			} else if (a != b && a != c && b != c) {
				t2++;
				respuesta1 = "Es escaleno";
			} else {
				t3++;
				respuesta1 = "Es isoseles";
			}
			System.out.println(respuesta1);
		}
		System.out.println("----------------");
		System.out.println("Equilatero: " + t1 + "\n" + "Escaleno: " + t2 + "\n" + "Isoseles: " + t3);
		if (t1 < t2 && t1 < t3) {
			respuesta2 = "Equilatero";
		} else if (t2 < t1 && t2 < t3) {
			respuesta2 = "Escaleno";
		} else if (t3 < t1 && t3 < t2) {
			respuesta2 = "Isoseles";
		} else if (t1 == t2 && t1 < t3) {
			respuesta2 = "Equilatero y Escaleno.";
		} else if (t1 == t3 && t1 < t2) {
			respuesta2 = "Equilatero e Isoseles.";
		} else if (t2 == t3 && t2 < t1) {
			respuesta2 = "Escaleno e Isoseles.";
		} else {
			respuesta2 = "Hay la misma cantidad de triangulos.";
		}
		System.out.println("----------------");
		System.out.println("Menor cantidad: " + respuesta2);
	}

}
