//Type 1
import java.util.*;

class program39
{
    public static void main(String A[])
    {
        int iValue=0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value :");
        iValue=sobj.nextInt();

        if((iValue%3==0) && (iValue%5==0))     // && is logical operator which is used to check both conditions are true
                                               //must put bracket in conditions as above
        {
            System.out.println(iValue+" Divisible by 3 and 5");
        }
        else
        {
            System.out.println(iValue+" Not Divisible by 3 and 5");
        }

    }
}