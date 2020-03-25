import javax.swing.JOptionPane;
/**
 * 2) Imprimir na tela os 100 primeiros números pares.
 */
public class Exec02 {
    public static void main(String[] args) {
        int[] pares = new int[100];
        String resp = "";

        resp += "Todos os 100 primeiros pares:\n";

        for (int i = 0; i < pares.length; i++) {
            pares[i] = i * 2;

            if (i % 20 == 0) {
                resp += "\n" + pares[i] + " ";
            } else {
                resp += pares[i] + " ";
            }
            
        }
        JOptionPane.showMessageDialog(null, resp, "Resposta", JOptionPane.INFORMATION_MESSAGE);
    }    
}