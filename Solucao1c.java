import javax.swing.JOptionPane;

public class Solucao1c {
    public static void main(String[] args) {
        String sNumero = JOptionPane.showInputDialog("Digite um número inteiro:");
        int numero = Integer.parseInt(sNumero);
        double quadrado = Math.pow(numero, 2);
        JOptionPane.showMessageDialog(null, "O quadrado do número é:" + quadrado);
    }
}