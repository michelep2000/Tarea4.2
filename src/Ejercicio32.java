import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ma�ana = new int [5];
		int [] tarde = new int [6];
		int [] noche = new int [11];
		int[]promedio=new int [3];
		
		for (int i = 0; i < ma�ana.length; i++) {
			ma�ana[i]=sc.nextInt();
			promedio[0]+=ma�ana[i];
		}
		System.out.println(promedio[0]/ma�ana.length);
		
		for (int i = 0; i < tarde.length; i++) {
			tarde[i]=sc.nextInt();
			promedio[1]+=tarde[i];
		}
		System.out.println(promedio[1]/tarde.length);
		
		for (int i = 0; i < noche.length; i++) {
			noche[i]=sc.nextInt();
			promedio[2]+=noche[i];
		}
		System.out.println(promedio[2]/noche.length);
		
		if(promedio[0]>promedio[1]&&promedio[0]>promedio[2]) {
			System.out.println("El promedio de edades de los estudiantes de la ma�ana es mayor.");
		}else if(promedio[1]>promedio[0]&&promedio[1]>promedio[2]) {
			System.out.println("El promedio de edades de los estudiantes de la tarde es mayor.");
		}else {
			System.out.println("El promedio de edades de los estudiantes de la noche es mayor.");

		}
	
		
		

}
}
