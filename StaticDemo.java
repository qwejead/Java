class Demo
{
    public int i;
    public int j;
    public static int k;

    static
    {
        System.out.println("inside static block");
        k=51;
    }

    public Demo()
    {
        System.out.println("inside constructor");
        this.i=11;
        this.j=21;
    }

    public void fun()
    {
        System.out.println("inside fun method");
        System.out.println(this.i);
        System.out.println(this.j);
        System.out.println(Demo.k);
    }
    
    public static void gun()
    {
        System.out.println("inside gun");
        System.out.println(Demo.k);
    }

}

class StaticDemo
{
    public static void main(String A[])
    {
        System.out.println("inside main");

        System.out.println("value of k:"+Demo.k);
        Demo.gun();

        Demo dobj1 =new Demo();
        Demo dobj2 =new Demo();

        dobj1.fun();
        dobj2.fun();

    }
}