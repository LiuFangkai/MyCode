package file;

import java.io.File;

public class SearchFile {
	public static void main(String []args){
		File f=new File("C:/WINDOWS");
		File[] fs=f.listFiles();
		File min=null;
		File max=fs[0];
		
		//�ҳ���С���ļ�
		for(int i=0;i<fs.length-1;i++){
			min=fs[i];
			if(min.length()>fs[i+1].length()&&min.length()!=0){
				File temp=min;
				min=fs[i];
				fs[i]=temp;
			}
		}
		
		//�ҳ������ļ�
		for(int i=0;i<fs.length;i++){
			if(max.length()<fs[i].length()){
				File temp=max;
				max=fs[i];
				fs[i]=temp;
			}
		}
		
		System.out.printf("�����ļ���:%s,���С��%d�ֽ�",max.getAbsolutePath(),max.length());
		System.out.println();
		System.out.printf("��С���ļ���:%s,���С��%d�ֽ�",min.getAbsolutePath(),min.length());
	}
}
