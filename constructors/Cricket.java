package com.hcl.day5;

public class Cricket {
	static int score;
	public void incr(int x){
		score+=x;
		
	}
	public static void main(String[] args){
		Cricket fb=new Cricket();
		Cricket Sb=new Cricket();
		Cricket ext=new Cricket();
		
		fb.incr(12);
		Sb.incr(6);
		ext.incr(7);
		System.out.println("Score "+Cricket.score);
	}
}
