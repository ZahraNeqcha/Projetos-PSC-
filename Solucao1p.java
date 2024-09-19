import javax.swing.JOptionPane;

public class Solucao1p {
    public static void main(String[] args) {
        String sNumero = JOptionPane.showInputDialog("Digite algum número:");
        double numero = Double.parseDouble(sNumero);

        double quadrado = Math.pow(numero, 2);
        double raizQuadrada = Math.sqrt(numero);

        String mensagem = String.format("Número: %f\nQuadrado: %f\nRaiz Quadrada: %f", numero, quadrado, raizQuadrada);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}