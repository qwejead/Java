//Type 2
import java.util.*;

class program41
{

    static void CheckDivisible(int iNo)
    {
        if((iNo%3==0) && (iNo%5==0))     // && is logical operator which is used to check both conditions are true
                                               //must put bracket in conditions as above
        {
            System.out.println(iNo+" Divisible by 3 and 5");
        }
        else
        {
            System.out.println(iNo+" Not Divisible by 3 and 5");
        }
    }
    public static void main(String A[])
    {
        int iValue=0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value :");
        iValue=sobj.nextInt();

        CheckDivisible(iValue);    //ERROR: non-static method CheckDivisible(int) cannot be referenced from a static context
    }
}