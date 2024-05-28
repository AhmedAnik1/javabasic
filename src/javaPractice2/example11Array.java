package javaPractice2;

public class example11Array {

	public static void main(String[] args) {
		
		int myNum[] = { 2, 4, 6, 8, 9, 10};
		
		System.out.println(" Remember Array's index start in 0");
		
		System.out.println(myNum[3]);
		
		System.out.println(myNum.length);
		
		System.out.println("Array in assending order");
		
		for ( int i = 0; i < myNum.length; i++) {
			System.out.println(myNum[i]);
		}
		
System.out.println("Array in desending order");
		
		for ( int i = myNum.length-1 ; i >= 0; i--) {
			System.out.println(myNum[i]);
		}
	
		System.out.println("Github Testing");
	}

}
