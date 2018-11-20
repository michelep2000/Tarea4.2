import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero del 1 al 999: ");
		int num = sc.nextInt();
		String respuesta = "";

		if (num > 0 && num < 1000) {
			if (num < 10) {
				respuesta = num + " tiene un digito";
			} else if (num > 9 && num < 100) {
				respuesta = num + " tiene dos digitos";
			} else {
				respuesta = num + " tiene tres digitos";
			}
		}
		System.out.println(respuesta);
	}

}
