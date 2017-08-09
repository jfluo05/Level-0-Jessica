import javax.swing.JOptionPane;

public class SimpleNumberSorter {
	public static void main(String[] args) {
		int biggestNumber = 0;
		int smallestNumber = 0;
		String Answer1 = JOptionPane.showInputDialog("Write a random number");
		int one = Integer.parseInt(Answer1);
		String Answer2 = JOptionPane.showInputDialog("Write another random number");
		int two = Integer.parseInt(Answer2);
		String Answer3 = JOptionPane.showInputDialog("Write another random number");
		int three = Integer.parseInt(Answer3);
		System.out.println("Your numbers were " + one + " ," + two + " ," + three + ".");
		
		if (one > two && one > three) {
			biggestNumber = one;
		}
		if (two > one && two > three) {
			biggestNumber = two;
		}
		if (three > two && three > one) {
			biggestNumber = three;
		}System.out.println("The biggest number was "+biggestNumber+".");
		
		
		if (one < two && one < three) {
			smallestNumber = one;
		}
		if (two < one && two < three) {
			smallestNumber = two;
		}
		if (three < two && three < one) {
			smallestNumber = three;
		}System.out.println("The smallest number was "+smallestNumber+".");
	}
	// Write a program that asks the user for 3 numbers. Then print the Numbers
	// in ascending order.
	// Print the numbers in descending order.

}