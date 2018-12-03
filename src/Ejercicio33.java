import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums = sc.nextInt(), count = 0;
		boolean primos = true;
		for (int i = nums - 1; i > 1; i--) {
			primos = true;
			for (int j = i - 1; j > 1; j--) {
				if (i % j == 0)
					primos = false;
			}

			if (primos) {
				count++;
			}
		}
		System.out.println(count);
	}

}
