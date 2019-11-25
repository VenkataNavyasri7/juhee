package com.hcl.day3;

public class CircleDemo {

	/**
	 * Program Simple Hello World.
	 * @author BLTuser
	 *
	 */
		public void Calc(double radius){
			double area,circ;
			area=Math.PI*Math.pow(radius,2);
			circ=2*Math.PI*radius;
			System.out.println("Area of Circle : "+area);
			System.out.println("Circ of circle :"+circ);
		}

		public static void main(String[] args) {
			
			CircleDemo obj=new CircleDemo();
			obj.Calc(12.5);
		
		
		}
	}

