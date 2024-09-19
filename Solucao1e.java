import javax.swing.JOptionPane;

public class Solucao1e {
    public static void main(String[] args) {
        double valorInicial = 100.00;
        double juros = 11;
        int meses = 7;
        double valorFinal = valorInicial * Math.pow((1 + juros / 100), meses);
        JOptionPane.showMessageDialog(null, "O valor final da dívida após 7 meses é: R$" + valorFinal);
    }
}