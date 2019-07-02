package copyREversePalindromeCheck;

public class ArraySwapping { 
	
	public static void main(String[] args) {
		 
		int [] a = {1,3,2,4,5};  
		System.out.println("before swapping");
		for (int i = 0; i < a.length; i++) {
			System.out.print( a[i]);
		} 
		System.out.println("after swapping");
		int temp;  
		temp=a[2];
		a[2]=a[1];
		a[1]=temp;
		 
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
