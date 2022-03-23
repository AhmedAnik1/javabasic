package javaPractice2;

public class example13ParametersMethod {
	
	// Static void with no return 	
	static void parameterMethod(String firstName) {
			
			System.out.println(firstName + " Anik");
		}
	
	// Static void with no return 
static void parameterMethod2(String firstName, int jersey) {
			
			System.out.println(firstName + " Anik's Jersey Number " + jersey );
		}
	// void with if else statement

static void currentNumber(int jerseynum ) {
	if(jerseynum >= 63) {
		
		System.out.println(" it's Ahmed Anik's Jersey");
	} else {
		
		System.out.println(" it's Hossain Anik's Jersey");
	}
	
}


//Static  with  return 

static int addMethod(int x) {
	return  x + 5;
	
}


static int add2Method(int x, int y) {
	
	return x+ y;
	
}

static int addVariable(int a, int b) {
	
	return a + b;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		currentNumber(56);
		parameterMethod("Ahmed");
		parameterMethod("Hossain");
		
		parameterMethod2("Hossain", 56);
		parameterMethod2("Ahmed", 63);
		
		System.out.println(" total is : " + addMethod(3));
		System.out.println(" x and y together : " + add2Method(5,7));
		
		int c = addVariable(8, 9);
		System.out.println(" a and b and the sum c ; " + c);
		
		
	}

}
