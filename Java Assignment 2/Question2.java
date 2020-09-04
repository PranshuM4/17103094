import java.util.Scanner;
public class Question2{
   
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();
        int one = 1;
        int zero =0;
        int[] array = new int[size];
        System.out.println("Enter array elements (in range 0-20): ");
        int[][] fq = new int[1][21];
        int i=0;
        while(i<size)
        {
            array[i] = scan.nextInt();
            if(array[i]<0 || array[i]>20){
                fq[0][0]++;
                i++;
            }
            else{
                fq[0][array[i]]++;
                i++;
            }
        }

        int j=0;
        i=0;
        while(i<21)
        {
            for(int k=0;k<fq[0][i];k++)
            {
                array[j] = i;
                j++;
            }
            i++;
        }
        System.out.print("Sorted array: ");
        for(i=0;i<size;i++){
            System.out.print(array[i]*one + zero +" ");
        }
    }
}