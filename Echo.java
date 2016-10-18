/**
 * @author John Tyler Gafford
 * September 13th 2016
 * jtg2246@email.vccs.edu
 * This program is used to find the average of 10 numbers 
 * from user input with delimited by comma ","
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import java.util.regex.Pattern;


public class Echo {
	public static void main(String[] args) {
		byte byte1;
		short short1;
		int int1;
		long long1;
		float float1;
		double double1;
		char char1;
		boolean boolean1;
		String input;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input a byte, short, int, long, float, double, char, and boolean values with only a , between them");
		input = keyboard.next();
		
		Scanner set = new Scanner(input);
		set.useDelimiter(Pattern.compile(","));
		byte1 = set.nextByte();
		short1 = set.nextShort();
		int1 = set.nextInt();
		long1 = set.nextLong();
		float1 = set.nextFloat();
		double1 = set.nextDouble();
		char1 = set.next().charAt(0);
		boolean1 = set.nextBoolean();
		
		
//Using JOption to output the user inputs at set bounds on top of windows using different windows for each input
		
		JOptionPane output1 = new JOptionPane("Your inputed byte is " + byte1);
		JDialog result1 = output1.createDialog(null, "Your BYTE Input");
		result1.setBounds(120, 130, 300, 300);
		result1.setAlwaysOnTop(true);
		result1.setVisible(true);
		
		JOptionPane output2 = new JOptionPane("Your inputed short is " + short1);
		JDialog result2 = output2.createDialog(null, "Your SHORT Input");
		result2.setBounds(120, 130, 300, 300);
		result2.setVisible(true);
		result2.setAlwaysOnTop(true);
		
		JOptionPane output3 = new JOptionPane("Your inputed int is " + int1);
		JDialog result3 = output3.createDialog(null, "Your INT Input");
		result3.setBounds(120, 130, 300, 300);
		result3.setVisible(true);
		result3.setAlwaysOnTop(true);
		
		JOptionPane output4 = new JOptionPane("Your inputed long is " + long1);
		JDialog result4 = output4.createDialog(null, "Your LONG Input");
		result4.setBounds(120, 130, 300, 300);
		result4.setVisible(true);
		result4.setAlwaysOnTop(true);
		
		JOptionPane output5 = new JOptionPane("Your inputed float is " + float1);
		JDialog result5 = output5.createDialog(null, "Your FLOAT Input");
		result5.setBounds(120, 130, 300, 300);
		result5.setVisible(true);
		result5.setAlwaysOnTop(true);
		
		JOptionPane output6 = new JOptionPane("Your inputed double is " + double1);
		JDialog result6 = output6.createDialog(null, "Your DOUBLE Input");
		result6.setBounds(120, 130, 300, 300);
		result6.setVisible(true);
		result6.setAlwaysOnTop(true);
		
		JOptionPane output7 = new JOptionPane("Your inputed char is " + char1);
		JDialog result7 = output7.createDialog(null, "Your CHAR Input");
		result7.setBounds(120, 130, 300, 300);
		result7.setVisible(true);
		result7.setAlwaysOnTop(true);
		
		JOptionPane output8 = new JOptionPane("Your inputed boolean is " + boolean1);
		JDialog result8 = output8.createDialog(null, "Your BOOLEAN Input");
		result8.setBounds(120, 130, 300, 300);
		result8.setVisible(true);
		result8.setAlwaysOnTop(true);
		keyboard.close();
		set.close();
	}
}
