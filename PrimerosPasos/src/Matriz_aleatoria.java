
public class Matriz_aleatoria {

	public static void main(String[] args) {
		//Curso Java Arrays II. Vídeo 24
		//https://youtu.be/NwztwM_xGgU

		int[] matriz_aleatorios=new int[150];
		
		for(int i=0; i<matriz_aleatorios.length;i++) {
			
			matriz_aleatorios[i]=(int)Math.round(Math.random()*100);//GENERA NUMEROS ALEATORIOS ENTRE 0 Y 100.
			
		}
		
		for(int numeros:matriz_aleatorios) {
			
			System.out.print(numeros + "-");
		}
	}

}

