package chap06;

class Rectangle{
	
	double width;
	double height;
	
	double rectangleArea(double width) {
		this.width = width;
		double result = width * width;
		return result;
	}
	
	double rectangleArea(double width, double height) {
		this.width = width;
		this.height = height;
		double result = width * height;
		return result;
	}
	
}

public class RectangleExample {

	public static void main(String[] args) {

		Rectangle rec = new Rectangle();
		
		double width1 = 2;
		
		double Area1 = rec.rectangleArea(width1);
		System.out.println("rec.rectangleArea(width1): " + Area1);
		
		double width2 = 3;
		double height = 4;
		
		double Area2 = rec.rectangleArea(width2, height);
		System.out.println("rec.rectangleArea(width2,height): " + Area2);
		
	}

}
