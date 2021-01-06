package demo.ht.com.heightproject.seven_principles.open;

import android.util.Log;

/**
 * @ClassName Rectangle
 * 作者: szj
 * 时间: 2021/1/5 17:43
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = 2;
    }
    @Override
    public void showShape() {
        Log.i("Open","创建矩形 ");
    }
}
