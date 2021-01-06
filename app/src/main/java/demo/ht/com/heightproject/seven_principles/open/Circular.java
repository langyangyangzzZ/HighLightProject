package demo.ht.com.heightproject.seven_principles.open;

import android.util.Log;

/**
 * @ClassName Circular
 * 作者: szj
 * 时间: 2021/1/5 17:43
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class Circular extends Shape {
    public Circular() {
        type = 1;
    }

    @Override
    public void showShape() {
        Log.i("Open","创建圆形 ");
    }
}
