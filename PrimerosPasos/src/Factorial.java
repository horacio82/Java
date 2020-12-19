import javax.swing.*;
public class Factorial {

	public static void main(String[] args) {
		//Curso Java Bucles V. Vídeo 22
		//https://youtu.be/V1Wgi_FsehM
		
		long resultado=1L;
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		
		for(int i=numero; i>0; i--) {
			
			resultado=resultado*i;
		}

		System.out.println("El factorial de "+numero+" es "+resultado);
	}

}

