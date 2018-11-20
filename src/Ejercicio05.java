import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int num = sc.nextInt();
		String respuesta= "";
		
		if(num>0) {
			respuesta= num + " es positivo";
		}else if(num<0) {
			respuesta= num + " es negativo";
		}else {
			respuesta= num + " es nulo";
		}
		System.out.println(respuesta);
	}

}
