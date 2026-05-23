class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run of :"+Thread.currentThread().getName());
    }

}

class MultiThreadingName
{
    public static void main(String A[])
    {
        System.out.println("main thread is running");

        Demo dobj1=new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("FIRST");
        dobj2.setName("SECOND");

        dobj1.start();
        dobj2.start();
    }
}