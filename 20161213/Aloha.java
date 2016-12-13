import java.util.*;
public class Aloha{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String msg = sc.nextLine();
			System.out.println(msg);
			if(msg.equals(".")){
				break;
			}
		}
	}
}