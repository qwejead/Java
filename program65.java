//Type 3
import java.util.*;

class NumberX
{
    public boolean CheckPrime(int iNo)
    {
        Scanner bobj = new Scanner(System.in);
        int iCnt=0;

        for(iCnt=2;iCnt<(iNo/2);iCnt++)
        {
            if(iNo%iCnt==0)
            {
                break;
            }
        }

        if(iCnt<=(iNo/2)+1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class program65
{
    public static void main(String A[])
    {
        int iValue=0;
        boolean bRet=false;
       
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value :");
        iValue=sobj.nextInt();

        NumberX nobj = new NumberX();

        bRet=nobj.CheckPrime(iValue);
        
        if(bRet==true)
        {
            System.out.println(iValue+" is prime number");
        }
        else
        {
            System.out.println(iValue+" is not prime number");
        }
        
    } 
    }