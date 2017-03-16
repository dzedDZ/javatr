package by.rdcentre.javatr.main;

public class Circle{
	public static void main(String[] args){
		double r; // радиус 
		
		double l; // длина окружности
		double s; // площадь круга
		
		r = 14;
		
		s = Math.PI * r * r;
		l = 2 * Math.PI * r;		
		
		System.out.println("Perimeter of circle =" + l + ", Area = "+ s);
	}
	
}