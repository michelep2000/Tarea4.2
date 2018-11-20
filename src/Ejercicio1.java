
public class Ejercicio1 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		String respuesta = "";

		if (num1 > num2) {
			respuesta = "Suma = " + (num1 + num2) + "\n" + "Resta = " + (num1 - num2);
		} else {
			respuesta = "Producto = " + (num1 * num2) + "\n" + "Division = " +((num1 / (double)num2));
		}
		System.out.println(respuesta);
	}

}
