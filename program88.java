import java.util.*;


 class DigitX
 {
    public void CountEvenOddDigits(int iNo)      //72727
    {

        if(iNo<0)
        {
            iNo=-iNo;
        }
        
        int iDigit=0;
        int iCountEven=0 , iCountOdd=0 ;
        
            while(iNo!=0)
        {
            iDigit=iNo%10;

            if(iNo%2!=0)
            {
                iCountOdd++;
            }
            else
            {
                iCountEven++;
            }
            iNo=iNo/10;
        }
            System.out.println("Number of Odd Digits Are :"+iCountOdd);
            System.out.println("Number of Even Digits Are :"+iCountEven);
    }
 }

public class program88 {

    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue=0;

        System.out.println("Enter the Number :");
        iValue =sobj.nextInt();
        
        dobj.CountEvenOddDigits(iValue);
        
    }
}

