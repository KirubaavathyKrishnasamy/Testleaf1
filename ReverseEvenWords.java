package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "I Am a software tester";
		String[] str= text.split("");
		for(int i=0;i<text.length();i++)
		{
			if(i%2!=0)
           System.out.println(str[i]+"");
		}		
		String rev="";
		for(int j=text.length();j>0;--j)
		{
		if(j%2==0)
			rev=rev+(text.charAt(j-1)); 
		}
		System.out.println(rev);
	     }
			
		
}






