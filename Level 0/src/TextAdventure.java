import javax.swing.JOptionPane;

public class TextAdventure {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {

			String Answer = JOptionPane.showInputDialog(
					"You are in an abandon house.You can use the directions of a compass to tell where you are going to go next.");
			if (Answer.equalsIgnoreCase("north")) {

				Answer = JOptionPane.showInputDialog(
						"You are now standing in front of the front door and the door is slightly ajar.");
				if (Answer.equalsIgnoreCase("open door")) {
					Answer = JOptionPane.showInputDialog(
							"You are now standing in the kitchen where there is a knife and an apple. What do you do next?");
					if(Answer.equalsIgnoreCase("cut apple")){
						Answer=JOptionPane.showInputDialog("You finally eat the apple after a long day. You are now ready for more adventure. Would you like to continue?");
					}
					if(Answer.equalsIgnoreCase("yes"));

				} else {
JOptionPane.showMessageDialog(null, "You are not comfortable with using a knife. Unfortuneatley you bled to death.");
				}
			} else if (Answer.equalsIgnoreCase("south")) {

				JOptionPane.showInputDialog("You are now standing in front of the back door and it is locked");
			} else if (Answer.equalsIgnoreCase("east")) {

				JOptionPane.showMessageDialog(null,
						"You were wandering in the trap door. You fell through a hole and was never seen again.");
			} else if (Answer.equalsIgnoreCase("west")) {

				JOptionPane.showMessageDialog(null, "A hunter accidentally mistakened you for a deer.");

			} else {
				JOptionPane.showMessageDialog(null, "That is not a valid command please try again.");
			}

		}
	}
}