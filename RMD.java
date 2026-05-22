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

class RMD
{
    public static void main(String A[])
    {
        BASE bobj =new BASE();           //no casting
        BASE bobj =new DERIVED();        //up casting
        DERIVED dobj =new DERIVED();     //no casting
        DERIVED dobj =new BASE();        //down casting

    }
}