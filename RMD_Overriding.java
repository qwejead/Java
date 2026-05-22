class BASE
{
    public int i,j;

    public void fun()
    {
        System.out.println("Inside Base fun");
    }

    public void gun()
    {
        System.out.println("Inside Base gun");
    }

    public void sun()
    {
        System.out.println("Inside Base sun");
    }

}

class DERIVED extends BASE
{
    public int x,y;

    public void gun()
    {
        System.out.println("Inside derived gun");
    }

    public void sun()
    {
        System.out.println("Inside derived sun");
    }

    public void run()
    {
        System.out.println("Inside derived run");
    }

}

class RMD_Overriding
{
    public static void main(String A[])
    {
        BASE bobj =new DERIVED();        //up casting

        bobj.fun();                      //Base fun   
        bobj.gun();                      //Derived gun
        bobj.sun();                      //Derived sun
        bobj.run();                      //

    }
}