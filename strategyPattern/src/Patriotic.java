/**
 * Created by Wubin Ouyang on 2015/7/17.
 */
public interface Patriotic {

    public String speaking();
}
class chineseSpeaking implements Patriotic{
    @Override
    public String speaking() {
       return "I am a chinese!";

    }
}
class englishSpeaking implements Patriotic{
    @Override
    public String speaking() {
        return "Ok,anyway. I am a Canada";
    }
}
class japaneseSpeaking implements Patriotic{
    @Override
    public String speaking() {
        return "武运长久";
    }
}
