import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public  class TextEditor{
	public static void main(String[] args) {
		TextEditorman tem = new TextEditorman();	
	}
}
class TextEditorman implements ActionListener{
	JFrame frame;
    JPanel panel;
    JTextField fName;
    JButton btnOpen;
    JButton btnSave;
   	JTextArea textArea;
	JScrollPane scrollPane;
	String fN;
	public TextEditorman(){
		frame = new JFrame("てきすとえでぃた");
        frame.setBounds(100,100,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();//パネル

        //ボタン（開く）
        btnOpen = new JButton("ひらく");
        btnOpen.addActionListener(this);
        btnOpen.setActionCommand("open");
        //ボタン（保存）
        btnSave = new JButton("ほぞん");
        btnSave.addActionListener(this);
        btnSave.setActionCommand("save"); 
        //入力欄      
        fName = new JTextField("",15);

		textArea = new JTextArea(10, 30);
		

		

        frame.add(panel);
        panel.add(fName);
        panel.add(btnOpen);
        panel.add(btnSave);
       	
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
			String textFileName ="";
		// 「ファイルを開く」を開く
		JFileChooser fc = new JFileChooser();
		// 表示するdirをきめる
		fc.setCurrentDirectory(new File("."));
		// ダイアログをつくる
		int ret = fc.showOpenDialog(frame);
		// 選ばれたファイルを、しらべる
		if(ret == JFileChooser.APPROVE_OPTION) {
			// 選ばれたファイル
			File file = fc.getSelectedFile();
			// ファイル名、保存場所をしらべる
			textFileName = file.getAbsolutePath();
			// テキストフィールドに表示
			fName.setText(textFileName);
		}	

			fN=fName.getText();	

		try {
			// 1. ファイルを準備する

			File inFile = new File(fN);
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