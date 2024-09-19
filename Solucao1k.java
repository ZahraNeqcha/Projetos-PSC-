import javax.swing.JOptionPane;

public class Solucao1k {
    public static void main(String[] args) {
        String data = JOptionPane.showInputDialog("Digite alguma data no formato de ddmmaa:");
        String dia = data.substring(0, 2);
        String mes = data.substring(2, 4);
        String ano = data.substring(4, 6);
        JOptionPane.showMessageDialog(null, "Dia: " + dia + "\nMês: " + mes + "\nAno: " + ano);
    }
}
