package demo.ht.com.heightproject.seven_principles.open;

import android.util.Log;

/**
 * @ClassName OpenBean
 * 作者: szj
 * 时间: 2021/1/5 17:42
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class OpenManager {
    public void showShape(Shape shape){
        ///未遵守开闭原则
       /*
           if (shape .type == 1) {
                drawCircular(shape);
            }else if (shape.type == 2){
                drawRectangle();
            }else if(shape.type == 3){
                drawTriangle();
            }
        */

        //遵守开闭原则
        shape.showShape();
    }

    private void drawTriangle() {
        Log.i("Open","创建三角形 ");
    }

    private void drawRectangle() {
        Log.i("Open","创建矩形 ");
    }

    private void drawCircular(Shape shape) {
        Log.i("Open","创建圆形 ");
    }
}
