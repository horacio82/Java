package poo;
//Curso Java. POO II. Vídeo 28, 29, 30
	//https://youtu.be/ZY5pwm92cWQ

public class Coche {
	//Encapsulación de datos:
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	String color;
	int peso_total;
	boolean asientos_cuero, climatizador;
	
	public Coche() {
		//Método constructor (Propiedad = valor;)
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}
	
	//Métodos getters:
	public String dime_largo() {
		return "El largo del coche es: "+largo;
	}
	
	//Métodos setters:
	public void establece_color() {
		color = "Azul";
	}
	
	public String dime_color() {//Getter
		return "El color del coche es: "+color;
	}
}
