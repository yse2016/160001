import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JPanelTest extends JFrame { // extends : 継承・拡張
	public JPanelTest(){ //コンストラクター（特別なメソッド　：　初期化）
		setSize(400,300);
		setTitle("JPanelのテスト");

		MyJPanel Myjp = new MyJPanel();
		Container c = getContentPane();
		c.add(Myjp);

	}
	public static void main(String[] args) {
		JFrame w =  new JPanelTest();
		w.show();
	}
}

class MyJPanel extends JPanel{
	public void paintComponent(Graphics g){
		for (int i=0; i<10; i++) {
		super.paintComponent(g);

			g.drawString("Aloha",20,40);				
		}
		
	}
}
