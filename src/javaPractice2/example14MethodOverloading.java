package javaPractice2;

public class example14MethodOverloading {
	
	// Methods can have same name, but different parameters
	
	
	static int mathMethod(int x, int y, int z) {
		
		return x + y + z;
	}
	
static double mathMethod(double x, double y, double z) {
		
		return  x *y * z;
	}
	

	public static void main(String[] args) {
		
		int number1 = mathMethod(8,3, 2);
		
		double number2 = mathMethod(2.0, 3.0, 4.0);
		
		System.out.println("int: " + number1);
		  System.out.println("double: " + number2);
		
		
	
		// TODO Auto-generated method stub

	}

}
