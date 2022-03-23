package javaPractice2;

public class maxMinArray {
	
	public static void main(String[]args) {
		
		int a[]={4,7,6,4,8,9};
		
		
		int max=a[0];
		
		int min = a[0];
		
		for(int i=1;i<a.length;i++){
			
		if(a[i]>max) {
		
		max=a[i];
		}
		if(a[i]<min) {
			
			min=a[i];
			}
		
		
		}
		
		System.out.println("maximum valie is: " + max);
		System.out.println("minimum valie is: " + min);
		
		}
	}


	

