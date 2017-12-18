package apption;

public class Test {
	public static void main(String []args){
		SQLserver ss=new SQLserver();
		ss.ConnectSQL();
		ss.SQLverify("12","1234");
	}
}
