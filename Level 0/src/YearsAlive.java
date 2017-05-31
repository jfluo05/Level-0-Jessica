import javax.swing.JOptionPane;

public class YearsAlive {
	public static void main(String[] args) {

		String year = JOptionPane.showInputDialog(null, "What year is it?");
		int yearInt = Integer.parseInt(year);
		String born = JOptionPane.showInputDialog(null, "What year were you born?");
		int yearBorn = Integer.parseInt(born);
		int age = yearInt - yearBorn;

		System.out.println("You are " + age + " years old.");

		for (int i = 0; i <= age; i++) {
			System.out.println("In " + (i + yearBorn) + " you were " + i + " years old.");

		}

	}
}