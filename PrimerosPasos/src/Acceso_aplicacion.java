import javax.swing.JOptionPane;

public class Acceso_aplicacion {
    public Acceso_aplicacion() {
    }

    public static void main(String[] args) {
        String clave = "Horacio";
        String contraseña = "";

        while(!clave.equals(contraseña)) {
            contraseña = JOptionPane.showInputDialog("introduce la contraseña");
            if (!clave.equals(contraseña)) {
                System.out.println("Contraseña incorrecta");
            }
        }

        System.out.println("Contraseña correcta. Acceso permitido");
    }
}
