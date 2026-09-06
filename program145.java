class program145
{
    public static void Update(int Arr[],int iSize)
    {
        int iCnt=0;

        for(iCnt=0;iCnt<iSize;iCnt++)
        {
            Arr[iCnt]++;
        }
    }

    public static void main(String A[])
    {
        int iCnt=0;
        int Brr[]={10,20,30,40,50};

        System.out.println("Array elements before function :");

        for(iCnt=0;iCnt<5;iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }

        Update(Brr,5);

        System.out.println("Array elements After function :");

        for(iCnt=0;iCnt<5;iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }

    }
}