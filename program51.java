//Type 3
import java.util.*;

class NumberX
{
    public boolean CheckPerfect(int iNo)
    {
        Scanner bobj = new Scanner(System.in);
        int iCnt=0;
        int iSum=0;

        for(iCnt=1;iCnt<iNo;iCnt++)
        {
            if(iNo%iCnt==0)
            {
                iSum=iSum+iCnt;
            }

            if(iSum > iNo)
            {
                break;
            }
        }

        

        if(iSum==iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class program51
{
    public static void main(String A[])
    {
        int iValue=0;
        boolean bRet=false;
       
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value :");
        iValue=sobj.nextInt();

        NumberX nobj = new NumberX();

        bRet=nobj.CheckPerfect(iValue);
        
        if(bRet==true)
        {
            System.out.println(iValue+" is perfect number");
        }
        else
        {
            System.out.println(iValue+" is not perfect number");
        }
        
    } 
    }