package hyunhee_project.structure;

public class Palindrome {
	public static void main(String[] args) {
		int a = 10001;
		System.out.println(isPalindrome(a));
	}
	
	public static boolean isPalindrome(int a) {
		int num = a;
		int reverseNum = 0;
		
		while(num>0) {
			reverseNum = (reverseNum*10)+num%10;
			num = num/10;
		}
		
		if(a == reverseNum) {
			
			return true;
		}
		
		return false;
	}
	
}
