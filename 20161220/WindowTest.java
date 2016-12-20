
import java.awt.FlowLayout;
import javax.swing.*;
public class WindowTest {
	public static void main(String[] args) {

		JFrame frame = new JFrame("");




		JLabel label = new JLabel("aloha.");	
		frame.getContentPane().add(label);

		JButton button = new JButton("押してね");
		frame.getContentPane().add(button);

		frame.getContentPane().setLayout(new FlowLayout());
		
		



	 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300,250,300,300);
		frame.setVisible(true);
	}
}
