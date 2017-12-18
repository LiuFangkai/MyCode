package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream {
	public static void main(String []args){
		try {
			File f=new File("e:/test.txt");
			byte data[]={65,66};
			
			FileInputStream fis=new FileInputStream(f);	//������
			
			FileOutputStream fos=new FileOutputStream(f); //�����
			fos.write(data);
			
			byte[] r=new byte[(int)f.length()];
			fis.read(r);	//���ı����ݶ��뵽r��
			for(byte b:r)
				System.out.println(b);
			fis.close();
			fos.close();		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
