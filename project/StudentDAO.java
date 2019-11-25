package com.hcl.project;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class StudentDAO {
	static List<Student> LstStudent=null;
	static ResourceBundle rb=null;
	static{
		LstStudent=new ArrayList<Student>();
		rb=ResourceBundle.getBundle("student");
	}
	public String addStudentDao(Student student){
		LstStudent.add(student);
		return rb.getString("add");
	}
	public List<Student> showStudentDao(){
		return LstStudent;
		
	}
	public Student searchStudentDao(int sno){
		Student objStudent=null;
		for (Student student : LstStudent) {
			if(student.getSno()==sno){
				objStudent=student;
			}
			
		}
		return objStudent;
	}
	public String deleteStudentDao(int sno){
		String result="";
		Student student=searchStudentDao(sno);
		if(student!=null){
			LstStudent.remove(student);
			return rb.getString("delete");
			
		}else{
			result ="student record not found...!";
		}
		return result;
		
	}
	
	public String updateStudentDao(Student objStudent){
		Student student=searchStudentDao(objStudent.getSno());
		String result="";
		if(student!=null){
			for (Student s : LstStudent) {
				if(s.getSno()==objStudent.getSno()) {
				s.setName(objStudent.getName());
				s.setCity(objStudent.getCity());
				s.setCgp(objStudent.getCgp());	
			}
		}
			return rb.getString("upd");
	}
	else
	{
		result = rb.getString("not found");
	}
	return result;

}
	public void writeStudentFileDao() {
		try {
			FileOutputStream fout=new FileOutputStream("c:/files/student.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			objout.writeObject(LstStudent);
			objout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readStudentFileDao() {
		try {
			FileInputStream fin=new FileInputStream("c:/files/student.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
			LstStudent =(List<Student>)objin.readObject();
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

