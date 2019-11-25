package com.hcl.ex;

public class DivEx {

	public static void main(String[] args){
		int a,b,c;
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("Division is"+c);
		} catch (ArithmeticException e) {
		System.out.println("Division by zero is undefined ");
		}
		catch (NumberFormatException e){
			System.out.println("String cannot be converted int integer");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("args not found");
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
				System.out.println("program completed");
			}
		}
	}

