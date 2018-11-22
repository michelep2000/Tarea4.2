import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el mes: ");
		int mes = sc.nextInt();
		System.out.println("Introduce un dia: ");
		int dia = sc.nextInt();
		String respuesta= "";
		
		if(mes==12&&dia==25) {
			respuesta= "Es navidaaaad";
		}
		System.out.println(respuesta);

	}

}
