class Marvellous
{
    public Marvellous()
    {
        System.out.println("Inside Constructor");
    }

    protected void finalize()
    {
        System.out.println("Inside Finalize Method");
    }
}

class Hello
{

}


class FinalizeDemoX
{
    public static void main(String A[])
    {
        Marvellous mobj=new Marvellous();
        Marvellous mobj2 = mobj;

        mobj=null;
        System.gc();

        System.out.println("End of main");
    }
}