import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public  class Idean{
	public static void main(String[] args) {
		Ideaman im = new Ideaman();	
	}
}
class Ideaman implements ActionListener{
	JFrame frame;
    JPanel panel;
    JButton btnOpen;
    JButton btnSave;
    JTextArea textArea;
	JScrollPane scrollPane;

	public Ideaman(){
		frame = new JFrame("あいでぃあん");
        frame.setBounds(100,100,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();//パネル
         //ボタン（開く）
        btnOpen = new JButton("求める！！");
        btnOpen.addActionListener(this);
        btnOpen.setActionCommand("open");
		//ボタン（保存）
        btnSave = new JButton("おぼえさせる");
        btnSave.addActionListener(this);
        btnSave.setActionCommand("save"); 


        panel.add(btnOpen);
        panel.add(btnSave);
        frame.add(panel);

        scrollPane = new JScrollPane(textArea);
       	Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(panel);
       	con.add(scrollPane);

       	frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();
	}
}