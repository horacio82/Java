import java.util.*;
public class Adivina_numero {

	public static void main(String[] args) {
		/*Píldoras informáticas; Curso Java. Bucles ||video 19
		https://youtu.be/TMIoxn4nMtA*/
		

		int aleatorio=(int)(Math.random()*100);/*el sistema genera un número aleatorio 
		y lo guarda en la variable <<aleatorio>>*/
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		
		do{
			
			intentos++;
			System.out.println("Introduce un número");
			
			numero=entrada.nextInt();
			
			if(aleatorio<numero) {
				
				System.out.println("Más bajo");
			}
			
			else if(aleatorio>numero) {
				
				System.out.println("Más alto");
			}
			
		}while(numero!=aleatorio); //mientras número sea diferente a aleatorio...
		
		System.out.println("Correcto, lo has conseguido en " + intentos + " intentos.");
	}

}

