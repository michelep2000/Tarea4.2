import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese coordenadas:" + "\n" + "x: ");
		int x = sc.nextInt();
		System.out.print("y: ");
		int y = sc.nextInt();
		String respuesta= "";
		
		if (x>0&&y>0) {
			respuesta= "I Cuadrante";
		}else if(x<0&&y>0) {
			respuesta="II Cuadrante";
		}else if(x<0&&y<0) {
			respuesta="III Cuadrante";
		}else {
			respuesta= "IV Cuadrante";
		}
		System.out.println(respuesta);
	}

}
