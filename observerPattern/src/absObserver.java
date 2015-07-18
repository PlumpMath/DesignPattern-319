import java.util.ArrayList;

/**
 * Created by Wubin Ouyang on 2015/7/17.
 */
public abstract class absObserver implements myObserver{

    private ArrayList<Subject> mySubject=new ArrayList<Subject>();
    @Override
    public abstract void update(String state);

    @Override
    public void register(Subject subject) {
        if(mySubject.contains(subject)==false)
        {
            mySubject.add(subject);
            subject.add(this);

        }else return;

    }

    @Override
    public void unregister(Subject subject) {
        if(mySubject.contains(subject)==true)
        {
            mySubject.remove(subject);
            subject.detatch(this);
        }
        else return;

    }
}
