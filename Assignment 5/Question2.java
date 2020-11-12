package com.company;

public class Question2 extends Thread
{
    static int MaximumDiv = 0, number = 0;
    int begin;
    public Question2(int begin)
    {
        this.begin = begin;
    }

    public void run()
    {
        int divisor;
        int i=begin;
        while (i<this.begin+10000)
        {
            divisor=0;
            int j=1;
            while (j<=i)
            {
                switch (i % j) {
                    case (0) -> divisor += 1;
                }
                j++;
            }
            if(divisor>MaximumDiv)
            {
                synchronized(this)
                {
                    MaximumDiv = divisor;
                    number = i;
                }
            }
            i++;
        }
    }

    public static void main(String[] args)
    {
        Question2 d1 = new Question2(1), d2 = new Question2(10001), d3 = new Question2(20001), d4 = new Question2(30001);
        Question2 d5 = new Question2(40001), d6 = new Question2(50001), d7 = new Question2(60001),d8 = new Question2(70001);
        Question2 d9 = new Question2(80001), d10 = new Question2(90001);
        long begin = System.currentTimeMillis();
        d1.start();
        d2.start();
        d3.start();
        d4.start();
        d5.start();
        d6.start();
        d7.start();
        d8.start();
        d9.start();
        d10.start();
        try{
            d1.join();
            d2.join();
            d3.join();
            d4.join();
            d5.join();
            d6.join();
            d7.join();
            d8.join();
            d9.join();
            d10.join();
        }catch(Exception e){}
        long finish = System.currentTimeMillis();
        System.out.println("The Number "+ number + " has the maximum " + MaximumDiv + " no of divisors.");
        System.out.println("Total time taken: " + (finish-begin));
    }


}