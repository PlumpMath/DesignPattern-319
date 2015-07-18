/**
 * Created by Wubin Ouyang on 2015/7/17.
 */
public class observerWubin extends absObserver{
    @Override
    public void update(String state) {
        System.out.print(state+" "+"Wubin received");
    }
}
