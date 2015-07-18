/**
 * Created by Wubin Ouyang on 2015/7/17.
 */
public class test {
    public static void main(String args[])
    {
        chinese chineseone=new chinese(new chineseSpeaking());
        chineseone.showsPatriotic();
        japanese japaneseone=new japanese(new japaneseSpeaking());
        japaneseone.showsPatriotic();
        chinese newchinese=new chinese(new Patriotic() {
            @Override
            public String speaking() {
                return "我是中国人";
            }
        });
        newchinese.showsPatriotic();
        chineseone.setPatriotic(new japaneseSpeaking());
        chineseone.showsPatriotic();
    }
}
