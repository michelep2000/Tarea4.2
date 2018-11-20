import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero entre 1 y 99.");
		int num = sc.nextInt();
		String respuesta="";
		
		if(num>0&&num<100) {
			if(num<10) {
				respuesta= "Tiene un digito";
			}else {
				respuesta="tiene dos digitos";
			}
		}
		System.out.println(respuesta);
	}

}
