import javax.swing.JOptionPane;

public class Solucao1f {
    public static void main(String[] args) {
        String sNumero = JOptionPane.showInputDialog("Digite um número inteiro de 3 dígitos:");
        int numero = Integer.parseInt(sNumero);
        int dezenas = (numero / 10) % 10;
        JOptionPane.showMessageDialog(null, "O numero da casa das dezenas vai ser :" + dezenas);
    }
}