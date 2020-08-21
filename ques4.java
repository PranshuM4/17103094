import java.util.Scanner;
public class ques4{
	static boolean Anagram(String s1, String s2) {
		if (s1.length()!=s2.length()) {
			return false;
		}
		int v=0;
		for (int i=0;i<s1.length();i++) {
			v=v^(int)s1.charAt(i);
			v=v^(int)s2.charAt(i);
			}
		return v==0;	
	}
	public static void main(String[] args) {
		String d1,d2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter string 1:");
		d1=scan.nextLine();
		System.out.println("Please Enter string 2:");
		d2=scan.nextLine();
		boolean Sol=Anagram(d1,d2);
		if(Sol==true)
			System.out.println("The Strings entered are anagrams");
		else
			System.out.println("The Strings entered are not anagrams");
	}
}
