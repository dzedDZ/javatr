package by.rdcentre.javatr.main;

public class FourDigits{
	public static void main(String[] args){
		int t; // четырехзначное число 
		
		int m; // произведение 2
		
		t = 4367;
		m = (t / 1000) * ((t % 1000) / 100) * ((t % 100) / 10) * (t % 10);
		
		System.out.println(" Multiplication of four digits number 4367 =" + m);
		
		//System.out.println(t / 1000);
		//System.out.println((t % 1000)/100);
		//System.out.println((t % 100)/10);
		//System.out.println(t % 10);
	}
	
}