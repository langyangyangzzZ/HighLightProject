package demo.ht.com.heightproject.seven_principles.li_replace;

/**
 * @ClassName replaceB
 * 作者: szj
 * 时间: 2021/1/5 15:45
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class ReplaceB extends BaseReplace{
    ReplaceA replaceA = new ReplaceA();
    public int show(int a, int b){
        return  a-b;
    }

    public int useAshow(int a,int b ){
       return replaceA.show(a,b);
    }
}
