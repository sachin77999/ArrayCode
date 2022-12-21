import java.util.*;
public class NeonNumber {
    
    public static void main(String args[])
    {
        int number,remainder,sum=0;
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        int square = number*number;
        while(square != 0)
        {
            remainder = square % 10;
            sum = sum + remainder;
            square = square/10;
        }
        if(sum == number)
        System.out.println(number+" is a neon number");
        else
        System.out.println(number+"is not a neon number");
    }
}
