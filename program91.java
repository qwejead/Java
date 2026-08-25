import java.util.*;

 class DigitX
 {
    public int SumEvenDigits(int iNo) 
    {

        if(iNo<0)
        {
            iNo=-iNo;
        }
        
        int iDigit=0;
        int iSum=0;

            while(iNo!=0)
        {
            iDigit=iNo%10;
            if(iSum%2==0)
            {
                iSum=iSum+iDigit;
            }
            iNo=iNo/10;   
        }
        return iSum;

    }
 }

public class program91
 {
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue=0;
        int iRet=0;

        System.out.println("Enter the Number :");
        iValue =sobj.nextInt();

        iRet=dobj.SumEvenDigits(iValue);

        System.out.println("Sum of even Digits is :"+iRet);
        
    }
}

