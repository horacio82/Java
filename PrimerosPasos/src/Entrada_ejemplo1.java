import java.util.*;

public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		//Píldoras informáticas; Curso Java. Entrada Salida datos I. Video 14
		//https://youtu.be/Ng0_7uZyIoA
		
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre por favor");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce tu edad por favor");
		
		int edad=entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + ", el año que viene tendrás " + (edad+1) + " años.");

	}

}



