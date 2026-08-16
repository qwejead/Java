//Type 2
import java.util.*;

class program43
{

    public static boolean CheckDivisible(int iNo)
    {
        if((iNo%3==0) && (iNo%5==0))     // && is logical operator which is used to check both conditions are true
                                               //must put bracket in conditions as above
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String A[])
    {
        int iValue=0;
        boolean bRet=false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value :");
        iValue=sobj.nextInt();

        bRet=CheckDivisible(iValue);  

        if(bRet==true)
        {
            System.out.println(iValue+" Divisible by 3 and 5");
        }
        else
        {
            System.out.println(iValue+" Not Divisible by 3 and 5");
        }

    } 
    }