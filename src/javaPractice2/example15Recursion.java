package javaPractice2;

public class example15Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = sum (3 ,10);
		
		System.out.println(result);
	 }
	
	public static int sum (int start, int end) {
		
		if ( end > start) {
			
			return end + sum ( start, end -1);
		} else 
		{
			return end;
		}
	}

}
