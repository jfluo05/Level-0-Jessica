import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	
	Robot batman = new Robot();
	batman.penDown();
	batman.setPenColor(Color.BLACK);
	batman.setSpeed(10);
	batman.setPenWidth(10);
	batman.turn(90);
	batman.move(200);
	batman.turn(180);
	batman.move(100);
	batman.turn(270);
	batman.move(150);
	batman.setAngle(180);
	for (int m = 0; m < 180; m++) {
		batman.move(1);
		batman.turn(1);
	}
	batman.hide();
}
	
	
}
