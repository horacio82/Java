import javax.swing.*;
public class Entrada_Numeros {

	public static void main(String[] args) {
		//Píldoras informáticas; Curso Java. Entrada Salida datos II. Video 15
		//https://youtu.be/F_48qh3BcDs
		
		
		
		double x=10000.0;
		
		//System.out.printf("%1.2f",x/3); intruccion para imprimir con formato(dos decimales).
		
		String num1=JOptionPane.showInputDialog("Introduce un número");
		//JOptionpane.showInputDialog devuelve un String, lo guarda en num1.
		
		double num2=Double.parseDouble(num1);
		//Double.parseDouble convierte ese String de num1 a un número de tipo double y lo guarda en num2.
		
		System.out.print("La raíz de " +num2+ " es ");
		
		System.out.printf("%1.2f", Math.sqrt(num2));
		//Math.sqrt muestra la raíz cuadrada de un número (tiene que ser de tipo double).
		
	}

}

