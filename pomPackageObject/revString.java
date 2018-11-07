package pomPackageObject;



public class revString {
	public static void main(String[] args)
	{
	  String s1="hello World Meghana";
	  String[] s2 =s1.split(" ");
	  for(int i=0;i<s2.length;i++)
	  {
		  
	  String str =s2[i];
	  char[] a=str.toCharArray();
	 int l = str.length();
	 for(int j=l-1;j>=0;j--)
	 {
		 System.out.print(a[j]);
	 }
	 System.out.print(" ");
	  } 
	}
}
