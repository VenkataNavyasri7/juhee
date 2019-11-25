package com.hcl.day3;

public class Student {
  int sno;
  String name;
  double cgpa;
  
  @Override
    public String toString() {
    return "Student [sno=" + sno + ", name=" + name + ", cgpa=" + cgpa + "]";
  }
  /**
   * Program Simple Switch case.
   * @author BLTuser
   *
   */
  
  public static void showDetails() {
    Student s1 = new Student();
    s1.sno = 1;
    s1.name = "haritha";
    s1.cgpa = 5.4;
    Student s2 = new Student();
    s2.sno = 2;
    s2.name = "ajju";
    s2.cgpa = 10.4;
    Student s3 = new Student();
    s3.sno = 3;
    s3.name = "babu";
    s3.cgpa = 8.4;
    Student[] arr = {s1,s2,s3};
    for (Student student :arr) {
      System.out.println(student);
    }
  }
 
  public static void main(String[] args) {
    showDetails();
  }

}
