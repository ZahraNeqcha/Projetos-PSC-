import javax.swing.JOptionPane;

public class Solucao1l {
    public static void main(String[] args) {
        String data = JOptionPane.showInputDialog("Digite alguma data no formato dd/mm/aa:");
        String[] partes = data.split("/");
        JOptionPane.showMessageDialog(null, "Dia: " + partes[0] + "\nMês: " + partes[1] + "\nAno: " + partes[2]);
    }
}
