package poo;
import javax.swing.*;

public class Uso_Coche {//Esta es la clase principal.

	public static void main(String[] args) {
		
		Coche micoche=new Coche();//Instancia
		micoche.establece_color(JOptionPane.showInputDialog("Introduce un color: "));
		System.out.println(micoche.dime_datos_generales());
		System.out.println(micoche.dime_color());
		
		micoche.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?: "));
		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?: "));
		System.out.println(micoche.dime_climatizador());
		System.out.println(micoche.dime_peso_coche());
		System.out.println("El precio del coche es " + micoche.precio_coche());

		//Coche Renault = new Coche(); //INTANCIAR UNA CLASE. EJEMPLAR DE CLASE.
		
		//System.out.println(Renault.dime_largo());
		
		
	}

}
