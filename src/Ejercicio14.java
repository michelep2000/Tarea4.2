import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su sueldo:"+"\n"+"Numero 1: ");
		int num1 = sc.nextInt();
		System.out.println("Numero 2: ");
		int num2 = sc.nextInt();
		System.out.println("Numero 3: ");
		int num3 = sc.nextInt();
		String respuesta= "";
		
		if(num1>num2&&num1>num3) {
			if(num2<num3) {
				respuesta = "Numero mayor= "+num1+"\n"+"Numero menor= "+num2;
			}else {
				respuesta = "Numero mayor= "+num1+"\n"+"Numero menor= "+num3;
			}
		}else if(num2>num1&&num2>num3) {
			if(num1<num3) {
				respuesta= "Numero mayor= "+num2+"\n"+"Numero menor= "+num1;
			}else {
				respuesta= "Numero mayor= "+num2+"\n"+"Numero menor= "+num3;
			}
		}else {
			if(num1<num2){
				respuesta= "Numero mayor= "+num3+"\n"+"Numero menor= "+num1;
			}else {
				respuesta= "Numero mayor= "+num3+"\n"+"Numero menor= "+num2;
			}
		}
		System.out.println(respuesta);
	}

}
