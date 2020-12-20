
public class Uso_arrays {

	
	public static void main(String[] args) {
	//Píldoras informáticas; Curso Java Arrays I. Video 23
		//https://youtu.be/UID_EKKfpcE
		
		int mi_matriz[] = new int [5];
		
		mi_matriz[0]=15;
		mi_matriz[1]=25;
		mi_matriz[2]=8;
		mi_matriz[3]=-7;
		mi_matriz[4]=92;
		
		//int mi_matriz[]= {15,25,8,-7,91}; (Otra forma de declarar la matriz)
		
		//for (int i=0; i<mi_matriz.length; i++) { (Método para que recorra toda la longitud de la matriz)
		
		for (int i=0;i<5;i++) {
			
			System.out.println("Valor del indice " + i + "="+mi_matriz[i]);
		}

	}

}
