import javax.swing.JOptionPane;

public class Solucao1r {
    public static void main(String[] args) {
        String sDiagonalMaior = JOptionPane.showInputDialog("Digite a maior diagonal do losango:");
        String sDiagonalMenor = JOptionPane.showInputDialog("Digite a menor diagonal do losango:");

        double diagonalMaior = Double.parseDouble(sDiagonalMaior);
        double diagonalMenor = Double.parseDouble(sDiagonalMenor);

        double area = (diagonalMaior * diagonalMenor) / 2;

        JOptionPane.showMessageDialog(null, "A área do losango vai ser: " + area);
    }
}