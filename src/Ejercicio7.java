import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca Calificacion: ");
		int calificacion = (int) (sc.nextDouble());
		String respuesta1 = "";
		String respuesta2 = "";

		 if (calificacion >= 0 && calificacion < 50) {
			respuesta1 = "Fuera de nivel";
		} else if (calificacion >= 0 && calificacion < 75) {
			respuesta1 = "Nivel regular";
		} else if (calificacion >= 0 && calificacion < 90) {
			respuesta1 = "Nivel medio";
		} else if (calificacion >= 0 && calificacion <= 100) {
			respuesta1 = "Nivel maximo";
		} else {
			respuesta2 = "Por favor introduzca un valor entre 0% y 100%.";
		}
		System.out.println("Su calificacion es: " + respuesta1);
		System.err.println(respuesta2);

	}

}
