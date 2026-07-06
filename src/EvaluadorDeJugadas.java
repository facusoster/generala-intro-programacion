import javax.swing.*;
import java.awt.*;

public class EvaluadorDeJugadas {

    public static void evaluar(int[] dados) {

        int[] freq = new int[7];

        for (int d : dados) {
            freq[d]++;
        }

        int maxRep = 0;
        boolean trio = false;
        boolean par = false;

        for (int v = 1; v <= 6; v++) {
            if (freq[v] > maxRep)
                maxRep = freq[v];
            if (freq[v] == 3)
                trio = true;
            if (freq[v] == 2)
                par = true;
        }

        boolean escalera = (freq[1] == 1 && freq[2] == 1 && freq[3] == 1 && freq[4] == 1 && freq[5] == 1) ||
                (freq[2] == 1 && freq[3] == 1 && freq[4] == 1 && freq[5] == 1 && freq[6] == 1);

        int codigo = 0;

        if (maxRep == 5)
            codigo = 5;
        else if (maxRep == 4)
            codigo = 4;
        else if (trio && par)
            codigo = 3;
        else if (escalera)
            codigo = 2;

        String resultado;

        switch (codigo) {
            case 5:
                resultado = "¡¡GENERALA!!";
                break;
            case 4:
                resultado = "PÓKER";
                break;
            case 3:
                resultado = "FULL";
                break;
            case 2:
                resultado = "ESCALERA";
                break;
            default:
                resultado = "Sin combinaciones mayores";
                break;
        }

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Panel para las imágenes
        JPanel imagenes = new JPanel(new FlowLayout());

        for (int i = 0; i < dados.length; i++) {
            String ruta = "images/0" + dados[i] + ".jpg";
            ImageIcon icono = new ImageIcon(ruta);
            imagenes.add(new JLabel(icono));
        }

        // Agregar imágenes arriba
        panel.add(imagenes, BorderLayout.CENTER);

        // Texto abajo
        panel.add(new JLabel("<html><center><b>" + resultado + "</b></center></html>"), BorderLayout.SOUTH);

        // Mostrar ventana
        JOptionPane.showMessageDialog(
                null,
                panel,
                "Dados finales",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
