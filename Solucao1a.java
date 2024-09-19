import javax.swing.JOptionPane;

public class Solucao1a {
        public static void main(String[] args) {
            String sIdade = JOptionPane.showInputDialog("Digite sua idade em anos:");
            int idade = Integer.parseInt(sIdade);
            int diasVividos = idade * 365;
            JOptionPane.showMessageDialog(null, "Você viveu aproximadamente " + diasVividos + " dias.");
        }
    }
