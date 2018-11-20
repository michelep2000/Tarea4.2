import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su sueldo:"+"\n"+"Numero 1: ");
		int num1 = sc.nextInt();
		System.out.println("Numero 2: ");
		int num2 = sc.nextInt();
		String respuesta = "";

		if (num1 > num2) {
			respuesta = "Suma = " + (num1 + num2) + "\n" + "Resta = " + (num1 - num2);
		} else {
			respuesta = "Producto = " + (num1 * num2) + "\n" + "Division = " +((num1 / (double)num2));
		}
		System.out.println(respuesta);
	}

}
