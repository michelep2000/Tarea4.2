import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String respuesta = "";
		System.out.println("Ingrese 3 numeros." + "\n" + "Numero 1: ");
		int num1 = sc.nextInt();
		System.out.println("Numero 2: ");
		int num2 = sc.nextInt();
		System.out.println("Numero 3: ");
		int num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			respuesta = num1 + " es el mayor";
		} else if (num2 > num1 && num2 > num3) {
			respuesta = num2 + " es el mayor";
		} else {
			respuesta = num3 + " es el mayor";
		}
		System.out.println(respuesta);
	}

}
