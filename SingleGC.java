class Base
{
    public int i;
    public int j;

    public Base()
    {
        System.out.println( "Inside Base constructor");
        this.i=0;
        this.j=1;
    }

    protected void finalize()
    {
        System.our.println("Inside Finalize method of Base");
    }

    public void fun()
    {
        System.out.println("Inside Base Fun ");
    }
}

class Derived extends Base
{
    public int x;

    public Derived()
    {
        System.out.println("Inside Derived constructor");
        this.x=2;

        protected void finalize()
        {
        System.our.println("Inside Finalize method of Base");
        }

        public void gun()
        {
            System.out.println("Inside Gun of Derived ");
        }
    }
}

class SingleGC
{
    public static void main(String A[])
    {
        System.out.println("Inside main");

        Derived dobj=new Derived();

        System.out.println(dobj.i);
        System.out.println(dobj.j);
        System.out.println(dobj.x);

        dobj.fun();
        dobj.gun();

        dobj = null;

        System.gc();

        System.out.println("End of main");
    }
}