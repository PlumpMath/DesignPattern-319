import java.util.ArrayList;

/**
 * Created by Wubin Ouyang on 2015/7/17.
 */
public interface myObserver {
    public void update(String state);
    public void register(Subject subject);
    public void unregister(Subject subject);
}

