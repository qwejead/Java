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


class FinalizeDemo
{
    public static void main(String A[])
    {
        Marvellous mobj=new Marvellous();

        mobj=null;
        System.gc();

        System.out.println("End of main");
    }
}