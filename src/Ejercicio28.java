import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de coordenadas.");
		int coor = sc.nextInt(), I = 0, II = 0, III = 0, IV = 0;
		String respuesta = "";
		for (int i = 0; i < coor; i++) {
			System.out.print("Ingrese coordenadas:" + "\n" + "x: ");
			int x = sc.nextInt();
			System.out.print("y: ");
			int y = sc.nextInt();

			if (x > 0 && y > 0) {
				I++;
				respuesta = "I Cuadrante ";
			} else if (x < 0 && y > 0) {
				II++;
				respuesta = "II Cuadrante ";
			} else if (x < 0 && y < 0) {
				III++;
				respuesta = "III Cuadrante ";
			} else {
				IV++;
				respuesta = "IV Cuadrante ";
			}
			System.out.println(respuesta);
		}
		System.out.println("-------------------");
		System.out.println("I Cuadrante = " + I + "\n" + "II Cuadrante = " + II + "\n" + "III Cuadrante = " + III + "\n"
				+ "IV Cuadrante = " + IV);

	}
}
