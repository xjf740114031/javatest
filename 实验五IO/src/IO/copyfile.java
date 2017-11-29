package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class copyfile {
	public static void main(String[] args) {
		File infile=new File("G:\\src2.txt");
		File outfile=new File("G:\\dest.txt");
		try {
			FileInputStream fins=new FileInputStream(infile);
			FileOutputStream fouts=new FileOutputStream(outfile);
			int c;
			while((c=fins.read())!=-1){
				fouts.write(c);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
