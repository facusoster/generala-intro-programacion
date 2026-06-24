import javax.swing.JOptionPane;

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
            if (freq[v] > maxRep) maxRep = freq[v];
            if (freq[v] == 3) trio = true;
            if (freq[v] == 2) par = true;
        }

        boolean escalera =
            (freq[1]==1 && freq[2]==1 && freq[3]==1 && freq[4]==1 && freq[5]==1) ||
            (freq[2]==1 && freq[3]==1 && freq[4]==1 && freq[5]==1 && freq[6]==1);

        int codigo = 0;

        if (maxRep == 5) codigo = 5;
        else if (maxRep == 4) codigo = 4;
        else if (trio && par) codigo = 3;
        else if (escalera) codigo = 2;

        String resultado;

        switch (codigo) {
            case 5: resultado = "¡¡GENERALA!!"; break;
            case 4: resultado = "PÓKER"; break;
            case 3: resultado = "FULL"; break;
            case 2: resultado = "ESCALERA"; break;
            default: resultado = "Sin combinaciones mayores"; break;
        }

        JOptionPane.showMessageDialog(null,
            "Dados finales: ["+dados[0]+"] ["+dados[1]+"] ["+dados[2]+"] ["+dados[3]+"] ["+dados[4]+"]\n"
            + "Resultado: " + resultado,
            "Puntuación Final",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
