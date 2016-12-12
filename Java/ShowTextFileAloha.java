import java.io.*;

public class ShowTextFileAloha{
	public static void main(String[] args) {	
		try{
	      File 		 localF  = new File("Aloha.java");
	      FileReader localFR = new FileReader(localF);
	      int data;

	      while ((data = localFR.read()) != -1){
	        System.out.print((char)data);
	      }
	    
	      localFR.close();
    	
    	}catch (IOException localIOException){
      		System.out.println("error");
    	}		
	}
}
