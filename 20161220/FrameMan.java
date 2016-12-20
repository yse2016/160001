import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FrameMan implements ActionListener{
	JFrame frame   = new JFrame();
	JLabel label   = new JLabel("aloha.");
	JButton button = new JButton("押してね");
	button.addActionListener(this);
	public FrameMan(){

		frame.getContentPane().add(label);
		frame.getContentPane().add(button);
		frame.getContentPane().setLayout(new FlowLayout());
		
	 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300,250,300,300);
		frame.setVisible(true);
		
		frame.set

	}
	public void actionPerformed(ActionEvent e){
		label.setText("アロハ");
	}
}