import javax.swing.JOptionPane;

    public class Solucao1i {
        public static void main(String[] args) {
            String sNumero = JOptionPane.showInputDialog("Digite algum número:");
            String sBase = JOptionPane.showInputDialog("Digite a base para o logaritmo:");
            double numero = Double.parseDouble(sNumero);
            double base = Double.parseDouble(sBase);
            double logaritmo = Math.log(numero) / Math.log(base);
            JOptionPane.showMessageDialog(null, "O logaritmo na base " + base + " do número vai ser: " + logaritmo);
        }
    }