import javax.swing.JOptionPane;

/**
 * 3) Entrar com vários números positivos e imprimir a média dos números digitados.
 */
public class Exec03 {
    public static void main(String[] args) {
        int qtd = 0;
        int x,soma = 0;
        String resp = "A media dos valores digitados:\n";
        String sQuest = "Se quiser finalizar para saber a media,\ndigite um valor negativo\n";
        sQuest += "Caso contrario, digite o valor desejado:";

        do {
            x = Integer.parseInt(
                JOptionPane.showInputDialog(null, sQuest)
            );
            soma += x;
            qtd++;
        } while (x >= 0);

        double media = (double) soma/qtd; 
        
        resp += "É igual a: " + media ;
        JOptionPane.showMessageDialog(null, resp, "Média", JOptionPane.INFORMATION_MESSAGE);       
    }
    
}