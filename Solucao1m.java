import javax.swing.JOptionPane;

public class Solucao1m {
    public static void main(String[] args) {
        String sa = JOptionPane.showInputDialog("Digite valor de a:");
        String sb = JOptionPane.showInputDialog("Digite valor de b:");
        String sc = JOptionPane.showInputDialog("Digite valor de c:");

        double a = Double.parseDouble(sa);
        double b = Double.parseDouble(sb);
        double c = Double.parseDouble(sc);

        double x = 2 * ((a - c) / 8) - b * 5;
        JOptionPane.showMessageDialog(null, "O valor de x é: " + x);
    }
}