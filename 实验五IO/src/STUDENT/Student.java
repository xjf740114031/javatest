package STUDENT;

import java.io.Serializable;

public class Student implements Comparable<Student>,Serializable {
	private static final long serialVersionUID = 1L;
	private long studentId;
	private String name;
	private String sex;
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int compareTo(Student o) {
		int c = studentId > o.studentId ? 1 : (studentId == o.studentId ? 0 : -1);
		return c;
	}
	
	
}
