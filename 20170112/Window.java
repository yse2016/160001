import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Window{
	public static void main(String[] args) {
		AlohaWindowMan awm = new AlohaWindowMan();
	}
}


class AlohaWindowMan{
	// field
	JFrame frame;
	MyButton button;
	JPanel panel;		// ボタンとフィールドを載せる
	JTextField fileNameField;

	// method
	public AlohaWindowMan() {
		// フレームをつくる
		frame = new JFrame("AlohaWindow");
		frame.setLocation(400, 400);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ボタンとフィールドを、パネルにのせる
		button = new MyButton("Click Me!");
		fileNameField = new JTextField("ALOHA", 20);

		panel = new JPanel();
		panel.add(fileNameField);
		panel.add(button);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(panel);

		// 表示する
		frame.setVisible(true);
	}
	// ↓クリックされたとき実行する処理
	public void ActionPerformed(ActionEvent ae) {
		// フィールドを書き換える。
		fileNameField.setText("Hello");
	}
	class Mybutton extends JButton  implements ActionListener{
		public Mybutton(String str){
			super(str);
			addActionListener(this);
		}
		public void ActionPerformed(ActionEvent ae){
			fileNameField.setText("Hello");
		}
	}
}
