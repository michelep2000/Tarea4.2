import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums = 0, neg = 0, posi = 0, m15 = 0, par = 0;
		System.out.println("Ingrese 10 numeros.");

		for (int i = 1; i < 11; i++) {

			nums = sc.nextInt();

			if (nums > 0) 
				posi++;
			if (nums < 0) 
				neg++;
			if (nums % 15 == 0)
				m15++;
			if (nums % 2 == 0) 
				par += nums;

		}
		System.out.println("Valores negativos: " + neg + "\nValores positivos: " + posi + "\nMultiplos de 15: " + m15
				+ "\nValor acumulado de los pares: " + par);
	}

}
