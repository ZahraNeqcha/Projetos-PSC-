import javax.swing.JOptionPane;

public class Solucao1h {
    public static void main(String[] args) {
        String sNumero = JOptionPane.showInputDialog("Digite algum número:");
        double numero = Double.parseDouble(sNumero);
        double logaritmo = Math.log10(numero);
        JOptionPane.showMessageDialog(null, "O logaritmo na base 10 do número vai ser:" + logaritmo);
    }
}