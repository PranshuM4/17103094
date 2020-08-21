import java.util.Scanner;
public class ques2{
	public static void main(String[] args) {
		System.out.println("Please enter the string:");
		Scanner scan=new Scanner(System.in);
		String t;
		t=scan.nextLine();
		System.out.println("Please enter the size of replacement vector:");
		int n=scan.nextInt();
		int x=0;
		String[] s=new String[500];
		String[] s1=new String[n];
		String[] s2=new String[n];
		String temp="";
		java.util.HashMap<String, Integer> mark = new java.util.HashMap<String, Integer>();
		for(int q=0;q<n;q++){
	        System.out.println("Enter the words to be replaced: ");
	        s1[q]=scan.next();
	        s2[q]=String.valueOf(s1[q].charAt(0)); 
	        for(int r=0;r<s1[q].length()-1; r++) {
	        	s2[q]=s2[q]+'*';
	        }
	        mark.put(s1[q],q+1);}

	        int w=t.length();

	        for(int q=0;q<w;q++){
	        int j=q;
	        temp="";

	        while((j<w)&&(t.charAt(j)!=' ')){
	        temp=temp+t.charAt(j);
	        j++;}

	        if(temp!=" ")
	        q=j;

	        s[x]=temp;
	        x++;}

	        for(int q=0;q<x;q++){

	        if(mark.containsKey(s[q])){
	        int z=mark.get(s[q]);
	        s[q]=s2[z-1];}}

	        for(int q=0;q<x;q++)
	        System.out.print(s[q]+" ");

	        System.out.print("\n");
		
		
	}
}