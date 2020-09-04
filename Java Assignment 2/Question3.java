import java.util.Scanner;

public class Question3{

    public static int String_Len(String x)
    {
        char ch[] = x.toCharArray();
        int i = 0;
        for(char c:ch)i++;
        return i;
    }
    

    public static void main (String[]args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string you want to sort(without spaces)");
        
        String s = scan.nextLine();

        
        System.out.println("String before sorting");
        System.out.println(s);

        int size = String_Len(s);
      
        char ch[] = s.toCharArray();
        int i=0,j=0;
        while(i < size-1) 
        {
            while(j < size-i-1) 
            {
                
                if (ch[j] > ch[j+1]) 
                {
                    char temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                
                }
            
                j++;
            }
            
            i++;
            j=0;
            
        }
    
        String sort = new String(ch);
        

        System.out.println("String after sorting");
        System.out.println(sort);
    }
}