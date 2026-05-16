class Base
{
    public int i;
    public int j;

    public Base()
    {
        System.out.println("Inside Base constructor");
        this.i=0;
        this.j=1;
    }


    public void Fun()
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

        public void Gun()
        {
            System.out.println("Inside Gun of Derived ");
        }
    }
}

class ThisSuper
{
    public static void main(String A[])
    {
      
    }
}