import javax.swing.JOptionPane;
/**
 * 1) Imprimir na tela todos os números de 100 a 1 (contagem regressiva).
 */
public class Exec01 {
    public static void main(String[] args) {
        int[] contagem = new int[100];
        String resp = "";

        for (int i = 99; i >= 0; i--) {
            contagem[i] = i + 1; 
            if (i % 20 == 0) {
                resp += contagem[i] + "\n";
            } else {
                resp += contagem[i] + " ";
            }
        }
        JOptionPane.showMessageDialog(null, resp, "Resposta", JOptionPane.INFORMATION_MESSAGE);
    }   
}