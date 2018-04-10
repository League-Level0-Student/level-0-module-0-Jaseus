import javax.swing.JOptionPane;

public class IntroToInputOutput {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "TACOS");
		String numTacos = JOptionPane.showInputDialog("Enter how many tacos you can eat:");
		JOptionPane.showMessageDialog(null, "WOW! " + numTacos + " is a lot! But I can eat more!!!");
		System.out.println(numTacos);
	}
}
