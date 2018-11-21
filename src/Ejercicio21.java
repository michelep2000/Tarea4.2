import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = 0,count = 1,pares=1,impares=1;
		String respuesta = "",respuesta2="";
		System.out.println("Lista 1: ");
		while (count <= 10) {
			value = sc.nextInt();
			if(value%2==0) {
				respuesta= "Pares= "+pares++;
			}else{
				respuesta2= "Impares= "+impares++;
			}
			count++;
		}
		System.out.println(respuesta+" "+respuesta2);
	}
		
	}

