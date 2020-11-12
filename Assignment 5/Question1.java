package com.company;

public class Question1 extends Thread
{
    public static void main(String[] args)
    {
        Question1 c = new Question1();
        c.start();
    }

    public void run()
    {
        int i=0;
        while (i<=100) {
            System.out.println(i+1);
            switch((i+1)%10)
            {
                case (0):
                    System.out.println("10 numbers printed");
                    break;
            }
            try
            {
                Thread.sleep(1000);
            }catch(Exception e){}
            i++;
        }
    }

}