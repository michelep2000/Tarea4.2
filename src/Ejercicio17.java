import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = 1, count = 1, cuenta = 0, cuenta2 = 0;
		while (count <= 5) {
			System.out.println("Sueldo " + count + ":");
			value = sc.nextInt();
			if (value < 501 && value > 99) {
				if (value > 99 && value < 301) {
					cuenta++;
				} else {
					cuenta2++;
				}
				count++;
			}else {
				System.err.println("Ese salario no existe");
			}
		}
		System.out.println("Cobran entre 100 y 300 = " + cuenta + "\n" + "Cobran mas de 300 = " + cuenta2);

	}
}