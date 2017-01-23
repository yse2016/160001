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
        textArea = new JTextArea(10, 30);

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
		if(cmd.equals("open")){
			try {
				// 1. ファイルを準備する
				File inFile = new File("data.txt");
				FileReader fr = new FileReader(inFile);
				BufferedReader br = new BufferedReader(fr);
				// 2. ファイルからデータを読み取って表示する
				String line ;
				while ((line=br.readLine()) != null) {
				 	textArea.append(line);
				 	textArea.append("\n");
				} 			
				// 3. ファイルを閉じる
				br.close();
			} catch (IOException e) {
				System.out.println("ファイル読み取りエラー");
				e.printStackTrace();
			}
		}else if (cmd.equals("save")){ 
			try {
				// 1. ファイルを準備する
				File f = new File("result.txt");
				FileWriter fw = new FileWriter(f);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				String  data = textArea.getText();

				pw.println(data);

				// 3. ファイルを閉じる
				pw.close();

				} catch (IOException e) {
					System.out.println("ファイル書き込みエラー");
					e.printStackTrace();
				}
		}
	}
}