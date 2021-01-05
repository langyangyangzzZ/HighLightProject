package demo.ht.com.heightproject.seven_principles.inversion;

import android.util.Log;

/**
 * @ClassName QQNews
 * 作者: szj
 * 时间: 2021/1/4 16:59
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class QQNews implements Iinversion {
    @Override
    public void run() {
        Log.i("Inversion", "我是 QQ 发送的消息");
    }
}


