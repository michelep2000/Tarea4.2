import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = 1, suma1=0,suma2=0;
		int count1 = 1, count2=1;
		System.out.println("Lista 1: ");
		while (count1 <= 15) {
			value = sc.nextInt();
			suma1+= value;
			count1++;
		}
		System.out.println("-----------------");
		System.out.println("Lista 2: ");
		while (count2 <= 15) {
			value = sc.nextInt();
			suma2+= value;
			count2++;
		}
		if (suma1>suma2) {
			System.out.println("Lista 1 mayor");
		}else if(suma2>suma1) {
			System.out.println("Lista 2 mayor");
		}else {
			System.out.println("Listas iguales");
		}
		
		
	}

}
