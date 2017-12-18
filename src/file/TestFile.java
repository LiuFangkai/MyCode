package file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*首先 File 类是对文件系统的映射 并不是硬盘上真实的文件
所以 new File("xxx.xxx")  只是在内存中创建File文件映射对象,而并不会在硬盘中创建文件
 
如果需要创建文件需要以下操作:
判断映射的文件是否真实存在     file.exists()  //true存在  false不存在
如果存在即可直接操作,  否则需要调用  file.createNewFile() 创建真实文件

但是以上方式只会适用创建文件本身,不包括父文件的创建(如果父文件不存在)
所以一般需要对父文件存在与否作判断  
File parent = file.getParentFile()  // 获取父文件
if( !parent.exists() )  parent.mkdirs();  //创建所有父文件夹
 * */
public class TestFile {
	public static void main(String []args){
		//绝对路径
		File f1=new File("e:/LoLFolder");
		System.out.println("f1的绝对路径:"+f1.getAbsolutePath());
		//相对路径，相对于工作目录，如果在Myeclipse中，就是项目目录
		File f2=new File("LoL.exe");
		System.out.println("f2的绝对路径:"+f2.getAbsolutePath());
		//把f1作为父目录创建文件对象
		File f3=new File(f1,"LoL.exe");
		System.out.println("f3的绝对路径:"+f3.getAbsolutePath());
		
		
		//注意： 需要在D:\\LOLFolder确实存在一个LOL.exe,\r\n才可以看到对应的文件长度、修改时间等信息
		System.out.println();
		File f=new File("d:/LoLFolder/LoL.exe/skin/garen.ski");
		System.out.println("当前文件是:"+f);
		System.out.println("判断是否存在:"+f.exists());
		
		System.out.println("判断是否是文件夹:"+f.isDirectory());
		
		System.out.println("判断是否是文件:"+f.isFile());
		
		System.out.println("获取文件的长度:"+f.length());
	
		long time =f.lastModified();
		Date d=new Date(time);
		System.out.println("最后修改的时间:"+d);
		f.setLastModified(0);
		
		File f4=new File("d:/LoLFolder/DOTA.exe");
		f.renameTo(f4);
		System.out.println("现在f的文件名为"+f);
		
		//文件常用方法2
		f.list();	//以字符串数组形式，返回当前文件夹下的所有文件（不包括子文件及子文件夹）
		
		File[] fs=f.listFiles();	//以字符数组组形式，返回当前文件夹下的所有文件（不包括子文件及子文件夹）
		
		f.getParent();	//以字符串形式返回获取所在文件夹
		
		f.getParentFile();	//以文件形式返回获取所在文件夹
		
		f.mkdir();	//创建文件夹，如果父文件夹skin不存在，创建就无效
		
		f.mkdirs();	//创建文件夹，如果父文件夹skin不存在，就会创建父文件夹
		
		try {
			f.createNewFile();	//创建一个空文件夹，如果父文件夹skin不存在，就会抛出异常
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		f.getParentFile().mkdirs();	//所以创建一个空文件之前，通常会创建父目录
		
		f.listRoots();	//列出所有的盘符
		
		f.delete();	//删除文件
		
		f.deleteOnExit();	//JVM结束的时候，删除文件，常用于临时文件的删除
		
		
	}		
}
