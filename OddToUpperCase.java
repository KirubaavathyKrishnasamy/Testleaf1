package week1.day2;

public class OddToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String str1 = "helloo";
						
				char[] chars = str1.toCharArray();
				
						for(int i=0; i<=chars.length-1; i++)
						{
						if(i%2!=0) {
							char a = str1.charAt(i);
							  str1=str1.toUpperCase();				
							System.out.println(a);
							
						}
			}

		}
		

	}


