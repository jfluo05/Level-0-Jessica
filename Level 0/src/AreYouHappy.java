import java.security.PublicKey;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {

		String Answer = JOptionPane.showInputDialog("Are you happy?");
		if (Answer.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		} else if (Answer.equalsIgnoreCase("no")) {
			Answer = JOptionPane.showInputDialog("Do you want to be happy?");
			{
				if(Answer.equalsIgnoreCase("yes")){
					JOptionPane.showMessageDialog(null, "Change something.");
				}else if(Answer.equalsIgnoreCase("no")){
					JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
				}
			}
		}

	}
}