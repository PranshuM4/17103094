import java.util.Scanner;
public class Question1{
    
    
    
    
       public static int length(String s)
       {
        char ca[] = s.toCharArray();
        int i = 0;
        for(char c:ca) i++;
        return i;
       
       }
    

    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two strings (line-seperated): ");
        String strg1;
        strg1 = scan.nextLine();
        String strg2;
        strg2 = scan.nextLine();

        boolean same = true;
        int l1 = length(strg1);
        int l2 = length(strg2);
        int l;
        if(l1<l2){
            l = l1;
        }
        else{
            l = l2;
        }
        
        for(int y=0;y<l;y++)
        {

            int one = strg1.charAt(y), two = strg2.charAt(y);
//             // case when both chars from strings are in abc lower or uppercase
//             if(((65<=one && one<=90) || (97<=one && one<=120)) && ((65<=two && two<=90) || (97<=two && two<=120))){
//                 if(one-two==32 || two-one==32 || one==two){
//                    i+=1;
//                    continue;
//                 }
//                 else if(one-two<32 || two-one>32){
//                     equal = false;
//                     System.out.println("Smaller string: "+s1);
//                     System.out.println("Larger string: "+s2);
//                     break;
//                 }
//                 else{
//                 equal = false;
//                 System.out.println("Smaller string: "+s2);
//                 System.out.println("Larger string: "+s1);
//                 break;
//                 }
//             }
//
//             else
            if(one<two){
                same = false;
                System.out.println("Smaller string: "+strg1);
                System.out.println("Larger string: "+strg2);
                break;
            }

            else if(two<one){
                same = false;
                System.out.println("Smaller string: "+strg2);
                System.out.println("Larger string: "+strg1);
                break;
            }
        }

    while(same)
         {
        if(l1>l){
                System.out.println("Smaller string: "+strg2);
                System.out.println("Larger string: "+strg1);
                break;
            }
            else if(l2>l){
                System.out.println("Smaller string: "+strg1);
                System.out.println("Larger string: "+strg2);
                break;
            }
            else{
                System.out.println(strg1 +" and "+ strg2 +" are equal");
                break;
            }
        }
        
    }
}

