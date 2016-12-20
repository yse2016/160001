import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainFrameMan{
	public static void main(String[] args) {
		FrameMan fm = new FrameMan();
	}
}
class FrameMan implements ActionListener{
	JFrame frame   = new JFrame();
	JLabel label   = new JLabel("aloha.");
	JButton button = new JButton("押してね");
	
	public FrameMan(){

		frame.getContentPane().add(label);
		frame.getContentPane().add(button);
		frame.getContentPane().setLayout(new FlowLayout());
		
	 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300,250,300,300);
		button.addActionListener(this);
		Container ctnr = frame.getContentPane();
		ctnr.add(label);
		ctnr.add(button);

		frame.setVisible(true);


	}
	public void actionPerformed(ActionEvent e){
		label.setText("アロハ");
	}
}