package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		String text ="We learn java basics as a part of java sessions week1 in";
		System.out.println(text);
		String[] txtarray = text.split("\\s");
		for(int i =0; i<txtarray.length; i++)
		{
			for(int j=0; j<txtarray.length; j++)
			{
				if(txtarray[i].equals(txtarray[j]))
				{
					count++;
				}
				if(count>1)
				{
					text = text.replace(txtarray[i], "");
				}
			}count =0;
		}
		System.out.println(text);
}
}
			
			
			
	
	      
	



		