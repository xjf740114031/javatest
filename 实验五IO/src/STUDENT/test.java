package STUDENT;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Scanner scanner=new Scanner(new FileInputStream("list.txt"));
			long id;
			String name;
			String sex;
			Student student=new Student();
			FileOutputStream fos = new FileOutputStream("student.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			FileInputStream fis = new FileInputStream("student.bin");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj=null;
			List sList=new ArrayList();
			while(scanner.hasNext())
			{
				id=scanner.nextLong();
				name=scanner.next();
				sex=scanner.next();
				student=new Student();
				student.setStudentId(id);
				student.setName(name);
				student.setSex(sex);
				sList.add(student);
//				System.out.println(student);
//				oos.writeObject(student);
			}
			Collections.sort(sList);
			 Iterator iterator=sList.iterator();
		        while(iterator.hasNext()){
		        	student=new Student(); 
		            student=(Student)iterator.next();
//		            System.out.println(s.getName()+" "+s.getSex());
		            oos.writeObject(student);
		        }
//			student.setStudentId(123);
//			student.setName("aaa");
//			student.setSex("q");
//			oos.writeObject(student);
//			System.out.println(student);
//			student=new Student();
//			student.setStudentId(456);
//			student.setName("bbb");
//			student.setSex("w");
//			oos.writeObject(student);
//			System.out.println(student);
		    System.out.println("------按学号排序-------");
			while((obj=ois.readObject())!=null){
				student=(Student) obj;
				id=student.getStudentId();
				name=student.getName();
				sex=student.getSex();
				System.out.println(id+" "+name+" "+sex);
//				System.out.println(ois.readObject());

			}
//			while(true){  
//	            try{  
//	            Student dbn = (Student) ois.readObject();  
//	            System.out.println(dbn.getName()+" -- "+dbn.getSex());  
//	            }catch(EOFException e){  
//	                break;  
//	            }catch(NullPointerException ee){  
//	                continue;  
//	            }  
//	        }  
	        ois.close();  
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		try {
//			FileInputStream fS=new FileInputStream("list.txt");
//			ObjectInputStream obs=null;
//			obs=new ObjectInputStream(fS);
//			
////			long id;
////			id=objectInputStream.readLong();
////			System.out.println(id);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
