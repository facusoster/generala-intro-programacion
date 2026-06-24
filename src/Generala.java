import javax.swing.JOptionPane;

public class Generala {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
            "Bienvenido a la Generala\nObjetivo: Obtener la mejor combinación en un máximo de 3 intentos.",
            "Inicio del Juego",
            JOptionPane.INFORMATION_MESSAGE);

        int[] dados = new int[5];

        for (int i = 0; i < 5; i++) {
            dados[i] = (int)(Math.random() * 6) + 1;
        }

        boolean seQueda = false;
        int intento = 1;

        while (intento <= 3 && !seQueda) {

            MostrarDados.mostrar(dados, intento);

            if (intento == 3) break;

            int respuesta = JOptionPane.showConfirmDialog(null,
                "¿Deseas volver a lanzar algunos dados?",
                "Intento " + intento,
                JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {

                for (int i = 0; i < dados.length; i++) {
                    int cambiar = JOptionPane.showConfirmDialog(null,
                        "Dado " + (i + 1) + ": [" + dados[i] + "]\n¿Relanzar?",
                        "Selección",
                        JOptionPane.YES_NO_OPTION);

                    if (cambiar == JOptionPane.YES_OPTION) {
                        dados[i] = (int)(Math.random() * 6) + 1;
                    }
                }

                intento++;

            } else {
                seQueda = true;
            }
        }

        EvaluadorDeJugadas.evaluar(dados);
    }
}
