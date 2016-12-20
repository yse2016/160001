import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainFrameMan2{
	public static void main(String[] args) {
		FrameMan fm = new FrameMan();
	}
}
class FrameMan implements ActionListener{
	JTextField text = new JTextField(20);
	JFrame frame   = new JFrame();
	JLabel label   = new JLabel("<html><body>ラベル：<br/>ラベル！！！！</body></html>");
	JButton button = new JButton("押してね");
	
	public FrameMan(){

		
	 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300,250,300,300);
		frame.getContentPane().setLayout(new FlowLayout());
		button.addActionListener(this);
		
		Container ctnr = frame.getContentPane();
		
		ctnr.add(text);
		ctnr.add(button,"");
		ctnr.add(label);


		frame.setVisible(true);


	}
	public void actionPerformed(ActionEvent e){
			String data = text.getText();
			label.setText(data);			


	}
}