//Type 3
import java.util.*;

class NumberX
{
    public void SumFactors(int iNo)
    {
        Scanner bobj = new Scanner(System.in);
        int iCnt=0;
        int iSum=0;

        for(iCnt=1;iCnt<=(iNo/2);iCnt++)
        {
            if(iNo%iCnt==0)
            {
                iSum=iSum+iCnt;
            }
        }
        System.out.println("Sum of factors is :"+iSum);
    }
   
}
class program48
{
    public static void main(String A[])
    {
        int iValue=0;
       

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value :");
        iValue=sobj.nextInt();

        NumberX nobj = new NumberX();

        nobj.SumFactors(iValue);
        
    } 
    }

    
    //Time Complexity : O(N/2) where N is the input number
    //Where N>=0