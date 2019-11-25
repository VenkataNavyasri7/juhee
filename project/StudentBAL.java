package com.hcl.project;

import java.util.List;

public class StudentBAL {
	static StringBuilder sb=new StringBuilder();
	public void writeStudentFileBal() {
		new StudentDAO().writeStudentFileDao();
	}
	
	public void readStudentFileBal() {
		new StudentDAO().readStudentFileDao();
	}
	public boolean addStudentBal(Student objStudent) throws StudentException{
		boolean isAdded=true;
		if(objStudent.getSno()<=0){
			sb.append("Student number cannot be negative or zero\r \n");
			isAdded=false;
		}
		if(objStudent.getName().length()<=3){
			sb.append("name should be morethan 3 characters\r\n");
			isAdded=false;
		}
		if(objStudent.getCity().length()<=3){
			sb.append("city morethan 3 characters \r\n");
			isAdded=false;
		}
		if(objStudent.getCgp()<0){
			sb.append("Cgp non negative\r\n");
			isAdded=false;
		}
		if(isAdded==false){
			throw new StudentException(sb.toString());
			
		}else{
			new StudentDAO().addStudentDao(objStudent);
		}
		return isAdded;
		
	}
	public List<Student> showStudentBal(){
		return new StudentDAO().showStudentDao();
	}
	public Student searchStudentsBal(int sno){
		return new StudentDAO().searchStudentDao(sno);
	}
	public String updateStudentsBal(Student objStudent){
		return new StudentDAO().updateStudentDao(objStudent);
	}
	public String deleteStudentsBal(int sno){
		return new StudentDAO().deleteStudentDao(sno);
	}
	
	

}
