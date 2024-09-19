import javax.swing.JOptionPane;

public class Solucao1d {
    public static void main(String[] args) {
        String str01 = JOptionPane.showInputDialog("Digite a primeira string:");
        String str02 = JOptionPane.showInputDialog("Digite a segunda string:");
        String str03 = JOptionPane.showInputDialog("Digite a terceira string:");
        int somaComprimento = str01.length() + str02.length() + str03.length();
        JOptionPane.showMessageDialog(null, "A soma do comprimento das três strings são: " + somaComprimento);
    }
}