import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero de triangulos: ");
		int b = 0, h = 0, cantidad = sc.nextInt(), count = 0;
		double sup = 0;
		for (int i = 1; i <= cantidad; i++) {
			System.out.println("Triangulo " + i + ": ");
			System.out.println("Altura: ");
			h = sc.nextInt();
			System.out.println("base: ");
			b = sc.nextInt();
			sup = (b * h) / 2d;
			if (sup > 12) {
				count++;
			}
			System.out.println("Altura " + h + "\n" + "Base " + b + "\n" + "Superficie " + sup);
			System.out.println("-------------");
		}
		System.out.println("Triángulos cuya superficie es mayor a 12: " + count);

	}

}
