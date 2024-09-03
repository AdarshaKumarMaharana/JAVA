import java.util.Scanner;

public class Fascinating_Number
{
    public static void main(String args[])
    {
        System.out.print("Enter a number ::");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int prod2=0,prod3=0;
        String str;
        if(digitsCount(num))
        {
            prod2 = num * 2;
            prod3 = num * 3;
            str = num + "" + prod2 + prod3;
            if(digitsCheck(str))
            {
                System.out.println(num+" is a Fascinating Number");
            }
            else
            {
                System.out.println(num+" is Not a Fascinating Number");
            }
        }
        else
        {
            System.out.println(num+" is Not a Fascinating Number");
        }
    }

    static boolean digitsCheck(String str)
    {

        for(char c = '1'; c <= '9'; c++)
        {
            int count = 0;

            for(int i = 0; i<str.length(); i++)
            {
                char ch = str.charAt(i);
                if(ch == c)
                    count++;
            }
            if(count>1||count==0)
                return false;
        }
        return true;

    }

    static boolean digitsCount(int num)
    {
        int digits = 0;
        while(num>0)
        {
            num/=10;
            digits++;
        }

        if(digits>=3)
            return true;
        else
            return false;
    }
}
