package com.hcl.day4;

public class Demo1 {

  public void show(int x) {
    System.out.println("show w.r.t Integer " + x);
  }
  
  public void show(double x) {
    System.out.println("show w.r.t Double " + x);
  }
  
  public void show(String x) {
    System.out.println("show w.r.t String " + x);
  }
  
  public void show(boolean x) {
    System.out.println("show w.r.t Boolean " + x);
  }
  
  /**
   * @raju
   * @param args
   */
  
  public static void main(String[] args) {
    Demo1 obj = new Demo1();
    obj.show(12);
    obj.show(12.67);
    obj.show("HCL");
    obj.show(true);
  }
}
