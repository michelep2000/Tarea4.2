import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double value = 1, suma=0;
		int count = 1;
		while (count <= 5) {
			System.out.println("Altura " + count + ":");
			value = sc.nextDouble();
			suma= suma+ value;
			count++;
		}
		System.out.println(suma/5);

	}

}
