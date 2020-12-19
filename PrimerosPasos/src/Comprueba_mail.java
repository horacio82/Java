import javax.swing.JOptionPane;

public class Comprueba_mail {

	public static void main(String[] args) {
		/* Curso Java Bucles V. Vídeo 22
		 https://youtu.be/V1Wgi_FsehM*/
		
		int arroba=0;
		boolean punto=false;
		
		String email=JOptionPane.showInputDialog("Introduce tu email:");
		
		/*recorre el email ingresado caracter a caracter en busca de una "@".
		"length"devuelve la longitud del email.*/
		for(int i=0; i<email.length(); i++) {
			
			if(email.charAt(i)=='@') {//
				
				arroba++;
			}
			
			if(email.charAt(i)=='.') {
				punto=true;
			}
		}

		if(arroba==1 && punto==true) {
			
			System.out.println("Es correcto");
		}
		
		else {
			System.out.println("No es correcto");
		}
	}
	

}

