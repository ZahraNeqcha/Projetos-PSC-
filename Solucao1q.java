import javax.swing.JOptionPane;

public class Solucao1q {
    public static void main(String[] args) {
        String sBase = JOptionPane.showInputDialog("Digite a base do triangulo:");
        String sAltura = JOptionPane.showInputDialog("Digite a altura do triangulo:");

        double base = Double.parseDouble(sBase);
        double altura = Double.parseDouble(sAltura);

        double area = (base * altura) / 2;

        JOptionPane.showMessageDialog(null, "A área do triangulo vai ser: " + area);
    }
}