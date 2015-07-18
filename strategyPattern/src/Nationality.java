/**
 * Created by Wubin Ouyang on 2015/7/17.
 */
public class Nationality {

    private Patriotic patriotic;
    public void showsPatriotic()
    {
        System.out.println(patriotic.speaking());
    }
    public void setPatriotic(Patriotic patriotic)
    {
        this.patriotic=patriotic;
    }

}

