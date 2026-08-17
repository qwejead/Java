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
class program50
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

    
    //Time Complexity : O(N/2) where N is the input number
    //Where N>=0