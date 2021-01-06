package demo.ht.com.heightproject.seven_principles.open;

import android.util.Log;

/**
 * @ClassName Triangle
 * 作者: szj
 * 时间: 2021/1/6 10:23
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class Triangle  extends Shape{
    public Triangle() {
        type = 3;
    }

    @Override
    public void showShape() {
        Log.i("Open","创建三角形 ");
    }
}
