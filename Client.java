//user defined package

import PPA.Marvellous;
import PPA.Infosystem;
import PPA.LB.Pune;

class Client
{
    public static void main(String A[])
    {
        Marvellous mobj=new Marvellous();
        Infosystem iobj=new Infosystem();
        Pune pobj = new Pune();

        System.out.println("Inside main of Client");

        mobj.fun();
        iobj.gun();
        pobj.sun();

    }
}