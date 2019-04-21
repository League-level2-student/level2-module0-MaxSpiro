package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	
	int winner = 0;
	//2. create an array of 5 robots.
	Robot[] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
	for(int i=0;i<robots.length;i++) {
		robots[i]= new Robot("mini");
		robots[i].penDown();
		robots[i].setRandomPenColor();
	}
	
		//4. make each robot start at the bottom of the screen, side by side, facing up
	for(int i=0;i<robots.length;i++) {
		robots[i].setY(500);
		robots[i].setX(150+(i*150));
	}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	int y1 = robots[0].getY();
	int y2 = robots[1].getY();
	int y3 = robots[2].getY();
	int y4 = robots[3].getY();
	int y5 = robots[4].getY();
	while(y1>0 && y2>0 && y3>0 && y4>0 && y5>0) {
		y1 = robots[0].getY();
		 y2 = robots[1].getY();
		 y3 = robots[2].getY();
		 y4 = robots[3].getY();
		 y5 = robots[4].getY();
		
	
	for(int i=0;i<robots.length;i++) {
		robots[i].setSpeed(50);
		robots[i].move(new Random().nextInt(51));
	}
	}
	if(y1<0) {
		winner=1;	
		}
	if(y2<0) {
			winner=2;	
			}
	if(y3<0) {
			winner=3;	
			}
	if(y4<0) {
			winner=4;	
			}
	if(y5<0) {
			winner=5;	
			}
	JOptionPane.showMessageDialog(null, "Robot "+winner+" has won!");
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
	
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}