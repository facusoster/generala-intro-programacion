import javax.swing.*;
import java.awt.*;

public class MostrarDados {

    public static void mostrar(int[] dados, int intento) {

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); // Muestra las imágenes en fila

        for (int i = 0; i < dados.length; i++) {

            String ruta = "images/0" + dados[i] + ".jpg";
            ImageIcon icono = new ImageIcon(ruta);

            JLabel etiqueta = new JLabel(icono);
            panel.add(etiqueta);
        }

        String mensaje = "Resultados del Lanzamiento " + intento + " de 3:\n\n"
                + "Dado 1: [" + dados[0] + "]\n"
                + "Dado 2: [" + dados[1] + "]\n"
                + "Dado 3: [" + dados[2] + "]\n"
                + "Dado 4: [" + dados[3] + "]\n"
                + "Dado 5: [" + dados[4] + "]\n";

        JOptionPane.showMessageDialog(
                null,
                panel,
                mensaje,
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
