 import java.util.*;

 class DigitX
 {
    public void DisplayDigits(int iNo)
    {
        int iDigit=0;

        if(iNo<0)
        {
            iNo=-iNo;
        }

            for(iNo!=0;)
            {
                iDigit=iNo%10;
                System.out.println(iDigit);
                iNo=(iNo/10);
            }

    }
 }

public class program81 {

    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue=0;

        System.out.println("Enter the Number :");
        iValue =sobj.nextInt();

        dobj.DisplayDigits(iValue);
        
    }
}

