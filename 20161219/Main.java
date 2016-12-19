import java.awt.FlowLayout;
import javax.swing.*;
public class Main {
	public static void main(String[] args) {

		JFrame frame = new JFrame("");

		JButton button = new JButton("押してね");

		// for(int i=0;i<10000;i++) {
			// if(i==550){
			JLabel label = new JLabel("あ");	
			frame.getContentPane().add(label);
			JLabel label2 = new JLabel("あ");
			frame.getContentPane().add(label2);
			// }else{
			// JLabel label = new JLabel("A");	
			// frame.getContentPane().add(label);
			// }
		// }

		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(button);
		



	 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,600);
		frame.setVisible(true);
	}
}
