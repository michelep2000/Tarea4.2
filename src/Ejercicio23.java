import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cuenta = 0, saldo = 0, count = 1, contain = 0;
		String respuesta = "";
		System.out.println("Un numero negativo de cuenta para terminar.");
		do {

			System.out.print("Cuenta " + count + ": ");
			cuenta = sc.nextInt();
			System.out.print("saldo " + count + ": ");
			saldo = sc.nextInt();
			
			if (saldo > 0) {
				respuesta = "Acreedor";
			} else if (saldo < 0) {
				respuesta = "Deudor";
			} else {
				respuesta = "Nulo";
			}
			System.out.println(respuesta);
			System.out.println("---------------");
			contain += saldo;
			count++;
		} while (cuenta > 0);

		System.out.println("La suma de todos los sueldos es: " + contain);

	}

}
