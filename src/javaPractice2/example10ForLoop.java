package javaPractice2;

public class example10ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10; i++) {
		      if (i == 4) {
		        break;
		      }
		      System.out.println(i); 
		      
		}
		
		System.out.println("J starts here");
	     
		for (int j = 1; j < 10; j = j+2) {
			
			if (j == 5) {
		        continue;
		      }
			System.out.println(j);
		      
		}
		
		
		

	}

}
