package Buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

public class BufferIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Writer nobuffwrite=new FileWriter("G:\\newnobuff.txt");
			Reader read= new FileReader("G:\\src.txt");
			char[] s = new char[5];
			long begintime=System.currentTimeMillis();
			while(read.read(s)!=-1)
			{
//				System.out.println(s);
				nobuffwrite.write(s);
			}
			nobuffwrite.flush();
			long endtime=System.currentTimeMillis(); 
			System.out.println("不带缓冲用时："+(endtime-begintime));
			
			Writer fw = new FileWriter("G:\\newbuff.txt");
			BufferedWriter bufw = new BufferedWriter(fw); 
			read= new FileReader("G:\\src.txt");
			BufferedReader bufr=new BufferedReader(read);
			long begintime2=System.currentTimeMillis();
			while(bufr.read(s)!=-1)
			{
//				System.out.println(s);
				bufw.write(s);
			}
			bufw.flush();
			long endtime2=System.currentTimeMillis(); 
			System.out.println("带缓冲用时："+(endtime2-begintime2));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
