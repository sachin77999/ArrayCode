import java.io.*;
public class BetweenRangeNeonNumber {
    
    public static void main(String args[])
    {
        for(int i =0;i<= 10000;i++)
        if(isNeon(i))
        System.out.println(i+" is a neon number");
        
    }
    static boolean isNeon(int number)
    {
        int square = number*number;
        int sum = 0;
        int remainder;
        while(square !=0)
        {
            remainder = square%10;
            sum = sum + remainder;
            square = square/10;
        }
        return (sum == number);
    }
}
