import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class AlohaWindow{
    public static void main(String[] args) {
        AlohaWindowman awm = new AlohaWindowman();
    }
}

class AlohaWindowman implements ActionListener{
    JFrame frame;
    JPanel panel;
    //JLabel label;
    JButton btnOpen;
    JButton btnSave;
    JTextField fName;
	JTextArea textArea;
	JScrollPane scrollPane;
	String fN;

    public AlohaWindowman(){
        frame = new JFrame("あろはうぃんどうまん");
        frame.setBounds(100,100,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        panel = new JPanel();
        //label = new JLabel("あろは");
        
        btnOpen = new JButton("くりっくみー");
        btnOpen.addActionListener(this);
        btnOpen.setActionCommand("open");
        
        btnSave = new JButton("保存");
        btnSave.addActionListener(this);
        btnSave.setActionCommand("save");       
        fName = new JTextField("ALOHA",10);
		textArea = new JTextArea(10, 30);
		scrollPane = new JScrollPane(textArea);








        frame.add(panel);
        panel.add(fName);
        panel.add(btnOpen);
        panel.add(btnSave);
        //panel.add(label);
       	panel.add(textArea);
       	panel.add(scrollPane);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
    	String cmd = ae.getActionCommand();
		if(cmd.equals("open")){
			fN=fName.getText();

		try {
			// 1. ファイルを準備する

			File inFile = new File(fN);
			FileReader fr = new FileReader(inFile);
			BufferedReader br = new BufferedReader(fr);

			// 2. ファイルからデータを読み取って表示する
			String line = br.readLine();
			textArea.append(line);

			// 3. ファイルを閉じる
			br.close();

		} catch (IOException e) {
			System.out.println("ファイル読み取りエラー");
			e.printStackTrace();
		}

    	}else if (cmd.equals("save")) {
    		textArea.setText("SAVE");
    		
    	}

    }
}
