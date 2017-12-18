package file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*���� File ���Ƕ��ļ�ϵͳ��ӳ�� ������Ӳ������ʵ���ļ�
���� new File("xxx.xxx")  ֻ�����ڴ��д���File�ļ�ӳ�����,����������Ӳ���д����ļ�
 
�����Ҫ�����ļ���Ҫ���²���:
�ж�ӳ����ļ��Ƿ���ʵ����     file.exists()  //true����  false������
������ڼ���ֱ�Ӳ���,  ������Ҫ����  file.createNewFile() ������ʵ�ļ�

�������Ϸ�ʽֻ�����ô����ļ�����,���������ļ��Ĵ���(������ļ�������)
����һ����Ҫ�Ը��ļ�����������ж�  
File parent = file.getParentFile()  // ��ȡ���ļ�
if( !parent.exists() )  parent.mkdirs();  //�������и��ļ���
 * */
public class TestFile {
	public static void main(String []args){
		//����·��
		File f1=new File("e:/LoLFolder");
		System.out.println("f1�ľ���·��:"+f1.getAbsolutePath());
		//���·��������ڹ���Ŀ¼�������Myeclipse�У�������ĿĿ¼
		File f2=new File("LoL.exe");
		System.out.println("f2�ľ���·��:"+f2.getAbsolutePath());
		//��f1��Ϊ��Ŀ¼�����ļ�����
		File f3=new File(f1,"LoL.exe");
		System.out.println("f3�ľ���·��:"+f3.getAbsolutePath());
		
		
		//ע�⣺ ��Ҫ��D:\\LOLFolderȷʵ����һ��LOL.exe,\r\n�ſ��Կ�����Ӧ���ļ����ȡ��޸�ʱ�����Ϣ
		System.out.println();
		File f=new File("d:/LoLFolder/LoL.exe/skin/garen.ski");
		System.out.println("��ǰ�ļ���:"+f);
		System.out.println("�ж��Ƿ����:"+f.exists());
		
		System.out.println("�ж��Ƿ����ļ���:"+f.isDirectory());
		
		System.out.println("�ж��Ƿ����ļ�:"+f.isFile());
		
		System.out.println("��ȡ�ļ��ĳ���:"+f.length());
	
		long time =f.lastModified();
		Date d=new Date(time);
		System.out.println("����޸ĵ�ʱ��:"+d);
		f.setLastModified(0);
		
		File f4=new File("d:/LoLFolder/DOTA.exe");
		f.renameTo(f4);
		System.out.println("����f���ļ���Ϊ"+f);
		
		//�ļ����÷���2
		f.list();	//���ַ���������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
		
		File[] fs=f.listFiles();	//���ַ���������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
		
		f.getParent();	//���ַ�����ʽ���ػ�ȡ�����ļ���
		
		f.getParentFile();	//���ļ���ʽ���ػ�ȡ�����ļ���
		
		f.mkdir();	//�����ļ��У�������ļ���skin�����ڣ���������Ч
		
		f.mkdirs();	//�����ļ��У�������ļ���skin�����ڣ��ͻᴴ�����ļ���
		
		try {
			f.createNewFile();	//����һ�����ļ��У�������ļ���skin�����ڣ��ͻ��׳��쳣
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		f.getParentFile().mkdirs();	//���Դ���һ�����ļ�֮ǰ��ͨ���ᴴ����Ŀ¼
		
		f.listRoots();	//�г����е��̷�
		
		f.delete();	//ɾ���ļ�
		
		f.deleteOnExit();	//JVM������ʱ��ɾ���ļ�����������ʱ�ļ���ɾ��
		
		
	}		
}
