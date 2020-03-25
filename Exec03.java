import javax.swing.JOptionPane;

/**
 * 3) Entrar com vários números positivos e imprimir a média dos números digitados.
 */
public class Exec03 {
    public static void main(String[] args) {
        int qtd, soma = 0;
        qtd = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Digite quantos valores sera inserido:")
        );

        int[] vetor = new int[qtd];
        String resp = "A media dos valores digitados:\n";

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Digite o " + (i+1) + "º valor:")
            );
            soma += vetor[i];
        }

        double media = (double) soma/qtd; 
        
        resp += "É igual a: " + media ;
        JOptionPane.showMessageDialog(null, resp, "Média", JOptionPane.INFORMATION_MESSAGE);       
    }
    
}