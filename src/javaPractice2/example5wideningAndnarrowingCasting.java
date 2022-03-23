package javaPractice2;

public class example5wideningAndnarrowingCasting {
	
	public static void main(String[] args) {
		
		//Widening Casting
		
		int myInt = 9;
		double myDouble = myInt;
		
		System.out.println(myInt);
		
		System.out.println(myDouble);
		
		
		//Narrowing Casting
		
		double myDoubble = 9.00;
		
		int myIntt = (int) myDoubble;
		
		System.out.println(myDoubble);
		
		System.out.println(myIntt);
	}

}
