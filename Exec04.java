import javax.swing.JOptionPane;
/**
 * 4) Ler vários números e informar quantos números entre 100 e 200 foram digitados.
 * Quando o valor 0 (zero) for lido o algoritmo deverá cessar sua execução. 
 */
public class Exec04 {
    public static void main(String[] args) {
        int qtd = 0;
        int x;
        String resp = "Quantidade de valores entre 100 e 200:\n";

        do {
            x = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Digite os valores aleatórios:")
            );
            if ( x >= 100 &&  x <= 200) 
                qtd++;

        } while (x != 0);

        resp += qtd;
        JOptionPane.showMessageDialog(null, resp, "Resposta", JOptionPane.INFORMATION_MESSAGE);
    }
    
}