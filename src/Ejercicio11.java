import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese 3 numeros < 10:" + "\n" + "Numero 1: ");
		int num1 = sc.nextInt();
		System.out.println("Numero 2: ");
		int num2 = sc.nextInt();
		System.out.println("Numero 3: ");
		int num3 = sc.nextInt();
		
		if(num1<10||num2<10||num3<10) {
			System.out.println("Alguno de los numeros es menor a 10");
		}
	}

}
