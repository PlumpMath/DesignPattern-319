/**
 * Created by Wubin Ouyang on 2015/7/17.
 */
public class observerOuyang extends absObserver {
    @Override
    public void update(String state) {
        System.out.println(state+" Ouyang received");
    }
}
