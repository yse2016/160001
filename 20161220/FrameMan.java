import java.awt.FlowLayout;
import javax.swing.*;
class FrameMan{
	JFrame frame   = new JFrame();
	JLabel label   = new JLabel("aloha.");
	JButton button = new JButton("押してね");
	public FrameMan(){

		frame.getContentPane().add(label);
		frame.getContentPane().add(button);
		frame.getContentPane().setLayout(new FlowLayout());
		
	 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300,250,300,300);
		frame.setVisible(true);
				
	}
}