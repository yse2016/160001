public class aloha{
	public static void main(String[] args) {
		Alohaman am = new Alohaman();
    int c=1;
    int t=1;

    int n =args.length;
    if(n==0){
      am.sayAloha(1,1);
    }else if(n== 1){
      c =Integer.parseInt(args[0]);
      am.sayAloha(c,1);  
    }else if (n== 2) {
    c =Integer.parseInt(args[0]);
    t =Integer.parseInt(args[1]);
      am.sayAloha(c,t);  
    }else{
      System.out.println("データは二個までです。");
    }
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
  public void sayAloha(int n,int x){
    for (int i=0; i<n;i++ ) {
      if(i%x==0){
        System.out.println(i+":"+this.msg2);
      }else{ 
        System.out.println(i+":"+this.msg);
      }
    }
  }
}