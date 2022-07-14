package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "level";
		String str2 = "";
		
		for (int i=str1.length()-1;i>=0; i--)
		{
			 str2 = str2+ str1.charAt(i);
			
		}
		if(str1.equals(str2))
		{
			System.out.println("Its a palindrome");
		}
		else
		{
			System.out.println("Its a not palindrome");
		}
		
	}
}

		