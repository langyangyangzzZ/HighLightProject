package demo.ht.com.heightproject.seven_principles.inversion;

/**
 * @ClassName Information
 * 作者: szj
 * 时间: 2021/1/5 14:54
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class Information {

    private Iinversion mIinversion;

    public void showInfo(){
        mIinversion.run();
    }
    public void setIinversion(Iinversion iinversion) {
         mIinversion =iinversion;
    }
}
