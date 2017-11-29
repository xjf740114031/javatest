package FileTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class FT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath="G:\\storefile.txt";
		FileWriter fwriter = null;
		try {
			fwriter=new FileWriter(filepath);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			File path=new File("D:\\");
			String [] list;
			list=path.list();
			List<File> isfile =new ArrayList<File>();
			List<File> isdir =new ArrayList<File>();
			for (int i = 0; i < list.length; i++) {
				String newpath="D:\\"+list[i];
				
				File file= new File(newpath);
				if(file.isDirectory()){
					//Date data=new Date(file.lastModified());
					//System.out.println("filename:"+list[i]+"  "+"data:"+data);
					isdir.add(file);
				}
				else{
					//Date data=new Date(file.lastModified());
					//System.out.println("filename:"+list[i]+"  "+"data:"+data+"  "+"length:"+file.length());
					isfile.add(file);
				}
			}
			Collections.sort(isdir);
			Collections.sort(isfile);
			String string ;
			for (int i = 0; i <isdir.size(); i++) {
				File file=isdir.get(i);
				Date data=new Date(file.lastModified());
				string="directoryname:"+file.getName()+"  "+"data:"+data+"\r\n";
				System.out.println(string);
				try {
					fwriter.write(string);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				System.out.println("directoryname:"+file.getName()+"  "+"data:"+data);
			}
			for (int i = 0; i <isfile.size(); i++) {
				File file=isfile.get(i);
				Date data=new Date(file.lastModified());
				string="filename:"+file.getName()+"  "+"data:"+data+"  "+"length:"+file.length()+"\r\n";
				System.out.println(string);
				try {
					fwriter.write(string);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				System.out.println("filename:"+file.getName()+"  "+"data:"+data+"  "+"length:"+file.length());
			}
		try {
			fwriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
