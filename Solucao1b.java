import javax.swing.JOptionPane;

public class Solucao1b {
    public static void main(String[] args) {
        String sBase = JOptionPane.showInputDialog("Digita a base do retangulo:");
        String sAltura = JOptionPane.showInputDialog("Digite a altura do retangulo:");
        double base = Double.parseDouble(sBase);
        double altura = Double.parseDouble(sAltura);
        double area = base * altura;
        JOptionPane.showMessageDialog(null, "A área do retangulo é: " + area);
    }
}
