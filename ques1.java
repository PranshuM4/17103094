import java.util.Scanner;
public class ques1
{
	public static void main(String[] args)
	{
		System.out.println("Please Enter string 1:");
		Scanner scan= new Scanner(System.in);
		String f1,f2;
		f1=scan.nextLine();
		
		System.out.println("Please Enter string 2:");
		f2=scan.next();
		int m1=f1.length();
		int m2=f2.length();
		int t=0,sol=0;
		if(m1<m2)
		System.out.println("0");
		else {
			int [] array1;
			int [] array2;
			array1= new int[500];
			array2=new int[500];
			for (int i=0;i<m2;i++)
				 array2[(int)f2.charAt(i)]++;
			for(int i=0;i<m2;i++){

		          int r=(int)f1.charAt(i);
		          if(array1[r]<array2[r])
		            t++;
		          array1[r]++;

		          if(t==m2)
		            sol++;}

		          for(int i=m2;i<m1;i++){

		          int r=(int)f1.charAt(i);
		        int e=(int)f1.charAt(i-m2);

		        if(array1[e]<=array2[e])
		        t--;

		        array1[e]--;

		        if(array1[r]<array2[r])
		        t++;

		        array1[r]++;

		        if(t==m2)
		        sol++;}

		        System.out.println(sol);		
		}
			
	}
}
