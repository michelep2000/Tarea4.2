import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var= 0, contain = 0,suma=0;
		for(int i = 1; i <11; i++) {
			var= sc.nextInt();
			if(i>5) {
				contain+=var;
			}
		}
		System.out.println(contain);
	}

}
