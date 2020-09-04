import java.util.Scanner;
public class Question6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        
        

        System.out.println("Hailstone sequence: " + num);
        int steps = 0;
        for(;steps<Integer.MAX_VALUE && num<Integer.MAX_VALUE; steps++)
        
        {
            if (num==1)
            break;
    
            switch(num%2)
            {
            
            case 1:
                            num=num*3;
                            num+=1;
                            break;
        
            case 0:
                            num/=2;
                            break;

            }
            
            System.out.println(num);
    
        }
        switch(num)
        {
        case (1):
        
                    System.out.println("No of steps: " + steps);
                    break;
                    
        case (Integer.MAX_VALUE):
                    System.out.println("Integer overflow reached");
                    break;
        default:
            System.out.println("steps maxed out.");
        }
    }
}