public class Question4{
    public static void main(String[] args){
        int num= 1;
        int sum = 1;
        for(;num<Integer.MAX_VALUE;num++)
            {
            if(sum==num*num){
                System.out.println("Ans: " +num);
            }
            sum+=num;
        }
    }
}