/**
 * Created by Wubin Ouyang on 2015/7/17.
 */
public class TEST {
    public static void main(String args[])
    {
        observerOuyang observerOuyang=new observerOuyang();
        observerWubin observerWubin=new observerWubin();
        Subject BBC = new Subject();
        Subject VOA = new Subject();
        Subject CNN = new Subject();
        BBC.add(observerOuyang);
        observerOuyang.register(VOA);
        BBC.changeState("Britain has declared war on China!");
        VOA.changeState("Obama has outlaw Britain and is gonna declare war on Britain soon");
        CNN.add(observerWubin);
        VOA.add(observerWubin);
        VOA.changeState("we are waiting for new updates");
        VOA.detatch(observerOuyang);
        VOA.changeState("FALSE NEWS!");


    }
}
