import javax.swing.JOptionPane;

public class Arrays_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] paises=new String[8];
		
		for(int i=0;i<8;i++) {
			
			paises[i]=JOptionPane.showInputDialog("Introduce país " + (i+1));
		}

		for(String elemento:paises) {
			
			System.out.println("País: " + elemento);
		}
	}

}
