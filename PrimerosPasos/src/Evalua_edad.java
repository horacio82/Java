import java.util.Scanner;

public class Evalua_edad {

	public static void main(String[] args) {
		//Píldoras informáticas; Curso Java. Condicionales I. Video 16
		//https://youtu.be/b2ZtZndiT1Y
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce tu edad:");
		
		int edad=entrada.nextInt();
		
		if(edad>=18) {//Si edad es mayor o igual a 18-->
			System.out.println("Eres mayor de edad");//-->imprime "Eres mayor de edad
		}
		else {//Y si no-->
			System.out.println("Eres menor de edad");//-->Imprime "Eres menor de edad.
		}
	}

}


