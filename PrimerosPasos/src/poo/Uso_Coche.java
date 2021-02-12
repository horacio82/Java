package poo;

public class Uso_Coche {//Esta es la clase principal.

	public static void main(String[] args) {
		
		Coche micoche=new Coche();
		micoche.establece_color("verde");
		System.out.println(micoche.dime_color());

		//Coche Renault = new Coche(); //INTANCIAR UNA CLASE. EJEMPLAR DE CLASE.
		
		//System.out.println(Renault.dime_largo());
		
		
	}

}
