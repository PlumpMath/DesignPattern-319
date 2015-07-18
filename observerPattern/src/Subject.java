import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * Created by Wubin Ouyang on 2015/7/17.
 */
public  class Subject {

    private String state=new String();
    private ArrayList<myObserver> obsList=new ArrayList<myObserver>() ;
    public void add(myObserver myObserver)
    {
        if(obsList.contains(myObserver)==false){
            obsList.add(myObserver);
            myObserver.register(this);
        }
    }
    public void detatch(myObserver myObserver){
        if(obsList.contains(myObserver)==true){
            obsList.remove(myObserver);
            myObserver.unregister(this);

        }

    }
    public void notiObserv()
    {
        for(myObserver i :obsList)
        {
            i.update(state);
        }
    }
    public void changeState(String state)
    {
        this.state=state;
        notiObserv();
    }


}
