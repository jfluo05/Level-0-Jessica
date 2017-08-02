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
					if (Answer.equalsIgnoreCase("cut apple")) {
						Answer = JOptionPane.showInputDialog(
								"You finally eat the apple after a long day. You are now ready for more adventure. Would you like to continue?");
					}
					if (Answer.equalsIgnoreCase("yes")) {
						Answer = JOptionPane.showInputDialog(
								"You see a door leading to a dark basement would you like to go down?");
						if(Answer.equalsIgnoreCase("yes")){
							Answer = JOptionPane.showInputDialog(
									"When you go down the stairs, you find a room with 2 doors one leading to paradise, and one leading to death. Do you choose the door to the left of you or the right of you?");
						if (Answer.equalsIgnoreCase("right")){
							JOptionPane.showMessageDialog(null, "You chose the door to heaven. You have lived a very peaceful life in paradise.");
						}else if(Answer.equalsIgnoreCase("left")){
							JOptionPane.showMessageDialog(null, "You have been led to the door to death.");
						}else{
							JOptionPane.showMessageDialog(null,"This is not a valid command. Please try again");
						}
					
						}
					} else {
						JOptionPane.showMessageDialog(null,
								"You don't have enough energy to last for the rest of the day. Unfortunately, you get heat stroke and don't make it through the day, you are exhausted and thirsty. You passed away in the heat.");
					}

				} else {
					JOptionPane.showMessageDialog(null,
							"You are not comfortable with using a knife. Unfortuneatley you bled to death.");
				}
			} else if (Answer.equalsIgnoreCase("south")) {

				JOptionPane.showInputDialog("You are now standing in front of the back door and it is locked");
			} else if (Answer.equalsIgnoreCase("east")) {

				JOptionPane.showMessageDialog(null,
						"You were wandering in the trap door. You fell through a hole and you were never seen again.");
			} else if (Answer.equalsIgnoreCase("west")) {

				JOptionPane.showMessageDialog(null, "A hunter accidentally mistakened you for a deer.");

			} else {
				JOptionPane.showMessageDialog(null, "That is not a valid command please try again.");
			}

		}
	}
}