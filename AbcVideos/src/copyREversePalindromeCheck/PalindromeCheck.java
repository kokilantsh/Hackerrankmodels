package copyREversePalindromeCheck;

public class PalindromeCheck {

	public static void main(String[] args) {
		 String s ="MadaM";
		 char[] c = s.toCharArray(); 
		 System.out.println(c.length); 
		 int n = c.length; 
		 char[] d = new char[n]; 
		 int i =0;
		 while(i!=n) {
			 d[n-1-i]=c[i];
			 ++i; 
			 
		 } 
		i=0;
		while(i!=n) {
			if(c[i]!=d[i]) {
				System.out.println("not palindrome"); 
				System.exit(0);
			} 
			else {
				++i;
				continue;
			} 
			
		}
		 
		System.out.println("palindrome");
	}

}
