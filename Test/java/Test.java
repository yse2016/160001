import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Test{
	public static void main(String[] args){
		TestMan ta = new TestMan();
	}
}

class TestMan implements ActionListener{
	// field
	JFrame frame;
	JButton btnOpen;
	JButton btnSave;
	JPanel panel;
	JPanel panel2;
	JTextField field;
	JTextArea area;
	JScrollPane scrollPane;
	String filedata;
	String textdata;

	public TestMan(){

		frame = new JFrame("Atokei");
		frame.setLocation(500,250);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnOpen = new JButton("なんじ？");
		btnSave = new JButton("メモ保存");

		field = new JTextField(20);
		area = new JTextArea(10,30);
		area.setLineWrap(true);

		panel = new JPanel();
		// panel.add(field);
		panel.add(btnOpen);
		panel.add(btnSave);

		scrollPane = new JScrollPane(area);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2,1));
		con.add(panel);
		con.add(scrollPane);

		frame.setVisible(true);

		btnOpen.addActionListener(this);
		btnOpen.setActionCommand("time");

		btnSave.addActionListener(this);
		btnSave.setActionCommand("save");
	}

	public void actionPerformed(ActionEvent ae) {
		String cmd = ae.getActionCommand();
		if(cmd.equals("time")){

			Calendar now = Calendar.getInstance();
    		int h = now.get(now.HOUR_OF_DAY);//時を取得
    		int m = now.get(now.MINUTE);     //分を取得
    		int s = now.get(now.SECOND);      //秒
    		String time = h+"時"+m+"分"+s+"秒";
    		String msg = "aloha:";

    		area.append("[テキストを入力]"+"\n");	
    		for(int i=0; i<h; i++){
    			area.append(msg);    			
    		}
    		area.append("\n"+"[時]"+"\n");
    		for (int j=0; j<m; j++){
				area.append(msg);    			
    		}
    		area.append("\n"+"[分]"+"\n");
    		for (int k=0;k<s; k++) {
    			area.append(msg);
    		}
    		area.append("\n"+"[秒]"+"\n");
			// area.append(time);

			// num = (int)(Math.random()*co);
			// area.append(datas[num]);
			// // System.out.println(num);
		}else if(cmd.equals("save")){
			textdata = area.getText();
			try{
				File outFile			= new File("result.txt");
				FileWriter fw			= new FileWriter(outFile,true);
				BufferedWriter bw		= new BufferedWriter(fw);
				PrintWriter pw			= new PrintWriter(bw);

				pw.println(textdata);

				pw.close();

			}catch(IOException e){
				System.out.println("error");
			}
		}
	}
}