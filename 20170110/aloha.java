public class aloha{
	public static void main(String[] args) {
		Alohaman am = new Alohaman();

		am.sayAloha(11);
	}	
}

class Alohaman{
	//field
	private String msg;
 	private String msg2;
	//method
  	public Alohaman(){
    	// コンストラクタ。インスタンスをつくるとき自動的に実行される。
    	this.msg = "ALOHA!";
    	this.msg2 = "アロハ！";
  	}
  	public void sayAloha() {
    	// "ALOHA!"と出力する。
  		System.out.println(this.msg);
  }
  public void sayAloha(int n) {
    // "ALOHA!"と20回出力する。
    for (int i=0; i<n;i++ ) {
    	  		System.out.println(i+":"+this.msg);
    }
  }
}