import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MostrarDados {

    public static void mostrar(int[] dados, int intento) {

        ImageIcon[] iconos = new ImageIcon[5];

        for (int i = 0; i < dados.length; i++) {
            iconos[i] = new ImageIcon(dados[i] + ".png");
        }

        String mensaje = "Resultados del Lanzamiento " + intento + " de 3:\n\n"
                       + "Dado 1: [" + dados[0] + "]\n"
                       + "Dado 2: [" + dados[1] + "]\n"
                       + "Dado 3: [" + dados[2] + "]\n"
                       + "Dado 4: [" + dados[3] + "]\n"
                       + "Dado 5: [" + dados[4] + "]\n";

        JOptionPane.showMessageDialog(null, mensaje, "Tus Dados",
            JOptionPane.INFORMATION_MESSAGE, iconos[0]);
    }
}
