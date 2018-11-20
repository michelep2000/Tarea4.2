import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese 3 numeros iguales:" + "\n" + "Numero 1: ");
		int num1 = sc.nextInt();
		System.out.println("Numero 2: ");
		int num2 = sc.nextInt();
		System.out.println("Numero 3: ");
		int num3 = sc.nextInt();

		if (num1 == num2 && num2 == num3 && num1 == num3) {
			int suma = num1 + num2;
			int producto = suma * num3;
			System.out.println("la suma de los primeros dos numeros = " + suma + "\n"
					+ "El resultado multiplicado por el numero 3 = " + producto);
		}

	}

}
