package GaussPasswordThread;

import java.util.List;

public class PasswordThread extends Thread {
	private boolean found=false;
	private String password;
	private List<String> passwords;
	public PasswordThread(List<String> passwords,String password){
		this.password=password;
		this.passwords=passwords;
	}
	public void run(){
		char[] guessword=new char[password.length()];
		generatePassword(guessword,password);
	}
	public void generatePassword(char[] guessword,String password){
		generatePassword(guessword,0,password);
	}
	
	public void generatePassword(char[] guessword,int index,String password){
		if(found){
			return;
		}
		for(short i='0';i<='z';i++){
			char c=(char)i;
			if(!Character.isLetterOrDigit(c)){
				continue;
			}
			guessword[index]=c;
			if((index+1)!=password.length()){
				generatePassword(guessword,index+1,password);
			}else{
				String guess=new String(guessword);
				passwords.add(guess);
				if(guess.equals(password)){
					System.out.println("ÕÒµ½ÁË£¬ÃÜÂëÊÇ"+guess);
					found=true;
					return;
				}
				
			}
		}
	}
	
}
