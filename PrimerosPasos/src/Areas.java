import java.util.*;
import javax.swing.*;
public class Areas {

	public static void main(String[] args) {
		/* Curso Java. Condicionales II. Vídeo 17
		https://youtu.be/8t5-D5dZu5Y*/
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Elige una opción: \n1: cuadrado \n2: rectánuglo \n3: triángulo \n4: círculo");
		
		int figura=entrada.nextInt();
		
		switch(figura) {
		
		case 1:
			
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
            /*JOptionPane... es un método estático y no necesita crear un objeto, 
			se utiliza el nomre de la clase (JOptionPane).*/
			
			System.out.println("El área del cuadrado es: " + Math.pow(lado, 2));
			
			break;
			
		case 2:
			
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El área del rectángulo es: " + base*altura);
			
			break;
			
		case 3:
			
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El área del triángulo es: " +(base*altura)/2);
			
			break;
			
		case 4:
			
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			System.out.print("El área del círculo es: ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			
			break;
			
		default:
		System.out.println("La opción no es correcta");

		}

	}

}

