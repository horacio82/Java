
public class Uso_arrays_2 {

	public static void main(String[] args) {
		//Curso Java Arrays II. Vídeo 24
		//https://youtu.be/NwztwM_xGgU
		
		/*String[] paises=new String[8];
		
		paises[0]="España";
		paises[1]="México";
		paises[2]="Colombia";
		paises[3]="Perú";			
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";*/
		
		String [] paises={"España, México, Colombia, Perú, Chile, Argentina, Ecuador, Venezuela"};//declaraci�n e iniciaci�n
		/*for(int i=0; i<paises.length;i++) {
			
			System.out.println("País " + (i+1) + " "+paises[i]);
		}*/

		for(String elemento:paises) {//bucle for each
			
			System.out.println("País: " + elemento);
		}
	}

}
