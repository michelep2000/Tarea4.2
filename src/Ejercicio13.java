import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su sueldo: ");
		double sueldo = sc.nextDouble();
		System.out.println("Años de trabajo: ");
		int años = sc.nextInt();
		String respuesta = "";

		if (sueldo < 500 && años > 10) {
			double cuenta = sueldo * 1.2;
			respuesta = "Ahora su sueldo es de: " + cuenta;
		} else if (sueldo < 500 && años < 10) {
			double cuenta2 = sueldo * 1.05;
			respuesta = "Ahora su sueldo es de: " + cuenta2;
		} else if (sueldo >= 500) {
			respuesta = "Su sueldo no tuvo cambios sorry: " + sueldo;
		}
		System.out.println(respuesta);

	}

}
