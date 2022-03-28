package com.Framework.masterCard;

public class PracOOPS implements Chimney,Micro{
	
	public void unit () {
		System.out.println(" Bahut bijlee khata h chimney ");
	}
	public void watt () {
		System.out.println(" Bahut watt khata h MICROOVen ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee em = new Employee();
       em.emp();
       Swtch swt = new Fan ();
       swt.fan();
       Chimney cmn = new PracOOPS();
       cmn.unit();
       Micro mc = new PracOOPS();
       mc.watt();
	}
}
	
	
	
	class Factory {
		String name = " XTYX";
		Factory (){
			System.out.println("I'm Parent constructor !!");
		}
		public void owners() {
			System.out.println("Hi I'm owner ! ");	}
	}
	
	
	class Employee extends Factory {
		
		public void emp() {
			System.out.println("Hi I'm employee  of  ! " +name);	}
	}
	
	
	abstract class Swtch {
		Swtch (){
			System.out.println("Mai abstarct ka constructor hu !!");
		}
		abstract void fan();
	}
	
	class Fan extends Swtch {
		Fan (){
			System.out.println("Mai pankha ka constructor hu !!");
		}
		public void fan() {
			System.out.println("Mai pankha hu bhai !!");
		}
	}
	
	interface Chimney {
	
	public void unit();
	}
	interface Micro{
		public void watt();
	}


