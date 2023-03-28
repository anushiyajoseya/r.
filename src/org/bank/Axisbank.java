package org.bank;



public class Axisbank extends BanknIfo {
	
public void deposite() {
System.out.println(" deposite amount 50%");
}
public static void main(String[] args) {
	
	Axisbank r= new Axisbank();
	r.saving();
	r.fixed();
	r.deposite();
}
}
