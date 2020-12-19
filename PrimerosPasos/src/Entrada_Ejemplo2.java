import javax.swing.*;
public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		//Píldoras informáticas; Curso Java. Entrada Salida datos II. Video 15
		//https://youtu.be/F_48qh3BcDs
		
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre");
		
		String edad=JOptionPane.showInputDialog("Introduce tu edad");
		
		int edad_usuario=Integer.parseInt(edad);
		
		edad_usuario++;
		
		System.out.println("Hola " + nombre_usuario + ", el año que viene tendrás " + edad_usuario + " años.");

	}

}


