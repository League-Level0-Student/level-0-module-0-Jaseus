import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("Greetings, fellow user! Who, if I may ask, am I speaking to?"); 
		if(name.equals("Jason")) {
			JOptionPane.showMessageDialog(null, "What a wonderful name! Looks like we had parents of great taste!");
		}else {
			JOptionPane.showMessageDialog(null, "Pleasure to meet you, " + name + "! That's an alright name. My name's Jason! :D");
		}
	String hobby = JOptionPane.showInputDialog("May I ask, what's your main hobby as of right now?");
	JOptionPane.showMessageDialog(null, "Ah. So that's how you roll... Interesting! For me, I like to just breathe for a 'living.' Heh. Literally. Just like how humans do. ;)");
	String YesNo = JOptionPane.showInputDialog("Now, if you don't mind me asking, do you know how to code?");
		if(YesNo.equals("Yes")) {
			JOptionPane.showMessageDialog(null,  "Fantastic! :D You have the potential of ruling the world!");
		}
		if(YesNo.equals("No")) {
			JOptionPane.showMessageDialog(null, "Well. That's unfortunate D: Go back to mopping the floors!");
		}
}
}
