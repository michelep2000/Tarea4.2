import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca Calificacion: ");
		int calificacion = (int) (sc.nextDouble());
		String respuesta1 = "";
		String respuesta2 = "";

		if (calificacion >= 0 && calificacion < 30) {
			respuesta1 = "Muy deficiente";
		} else if (calificacion >= 0 && calificacion < 50) {
			respuesta1 = "Insuficiente";
		} else if (calificacion >= 0 && calificacion < 75) {
			respuesta1 = "Bien";
		} else if (calificacion >= 0 && calificacion < 90) {
			respuesta1 = "Notable";
		} else if (calificacion >= 0 && calificacion <= 100) {
			respuesta1 = "Sobresaliente";
		} else {
			respuesta2 = "Por favor introduzca un valor entre 0% y 100%.";
		}
		System.out.println("Su calificacion es: " + respuesta1);
		System.err.println(respuesta2);

	}

}
