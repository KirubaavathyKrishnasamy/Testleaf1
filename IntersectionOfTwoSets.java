package week1.day2;

public class IntersectionOfTwoSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] inter1 = {1,4,5,7,9};
int [] inter2= {1,3,5,8,6};
 
for(int i=0; i<=inter1.length-1; i++)
{
	
for (int j=0; j<=inter2.length-1; j++)
{
	if(inter1[i]==inter2[j])
	{
		System.out.println(inter1[i]);
	}

}
}
}
}
