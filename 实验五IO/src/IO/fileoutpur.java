package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class fileoutpur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File infile=new File("G:\\dest.txt");
		try {
			FileInputStream fins=new FileInputStream(infile);
			InputStreamReader isr=new InputStreamReader(fins);

			int c;
			while((c=isr.read())!=-1){
				System.out.print((char)c);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
