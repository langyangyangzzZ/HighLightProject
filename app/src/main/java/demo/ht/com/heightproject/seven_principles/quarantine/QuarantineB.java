package demo.ht.com.heightproject.seven_principles.quarantine;

import android.util.Log;

/**
 * @ClassName QuarantineA
 * 作者: szj
 * 时间: 2021/1/4 15:30
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class QuarantineB implements IquarantineA,IquarantineB{
    @Override
    public void method1() {
        Log.i("Quarantine","QuarantineB类 method1()实现");
    }

    @Override
    public void method4() {
        Log.i("Quarantine","QuarantineB类 method4()实现");
    }

    @Override
    public void method5() {
        Log.i("Quarantine","QuarantineB类 method5()实现");
    }
}
