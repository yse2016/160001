import java.io.*;

public class ShowText{
	public static void main(String[] args) {	
		try{
	      File 		 	f  = new File("data.txt");
	      FileReader 	fr = new FileReader(f);
	      BufferedReader br = new BufferedReader(fr);
	      String line;
	      while ((line = br.readLine()) != null){
	        	System.out.println(line);
	      }
	    
	      br.close();
    	
    	}catch (IOException localIOException){
      		System.out.println("error");
    	}		
	}
}
