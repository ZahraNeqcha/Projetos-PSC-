import javax.swing.JOptionPane;

public class Solucao1n {
    public static void main(String[] args) {
        String sRaio = JOptionPane.showInputDialog("Digitar o raio do círculo:");
        double raio = Double.parseDouble(sRaio);
        double area = Math.PI * Math.pow(raio, 2);
        JOptionPane.showMessageDialog(null, "A área do círculo vai ser: " + area);
    }
}

