
public class Arrays_bidimensionales {

	public static void main(String[] args) {
		/*Píldoras informáticas; Curso Java Arrays III. Arrays bidimensionales Video 25.
		https://youtu.be/_tUncS0AsNE*/
		
		/*int [][] matrix=new int[4][5];//Dos dimensiones
		
		matrix[0][0]=15;
		matrix[0][1]=21;
		matrix[0][2]=18;
		matrix[0][3]=9;
		matrix[0][4]=15;
		
		matrix[1][0]=10;
		matrix[1][1]=52;
		matrix[1][2]=17;
		matrix[1][3]=19;
		matrix[1][4]=7;
		
		matrix[2][0]=19;
		matrix[2][1]=2;
		matrix[2][2]=19;
		matrix[2][3]=17;
		matrix[2][4]=7;
		
		matrix[3][0]=92;
		matrix[3][1]=13;
		matrix[3][2]=13;
		matrix[3][3]=32;
		matrix[3][4]=41;
		*/
		int [][] matrix= {//método más corto
				{10,15,18,19,21},
				{5,25,37,41,15},
				{7,19,32,14,90},
				{85,2,7,40,27}
		}; 
		
		for(int[]fila:matrix) {//Bucle for each
			System.out.println();
			
			for(int z: fila) {
				System.out.print(z + " ");
		
		/*for (int i=0;i<4;i++) {//Recorre toda la matriz
			System.out.println();
			for (int j=0;j<5;j++) {
				
				System.out.print(matrix[i][j]+"-");*/
			}
		}
	}

}

