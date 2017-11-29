package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

public class KeyInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filepath="G:\\src2.txt";
		File file=new File(filepath);
		int b;
		try {
			FileOutputStream fos=new FileOutputStream(file);
			System.out.println("«Î ‰»Î£∫");
			while( (b= System.in.read())!=-1)
			{
				fos.write(b);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
