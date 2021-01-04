package demo.ht.com.heightproject.seven_principles.quarantine;

import android.util.Log;

/**
 * @ClassName QuarantineA
 * 作者: szj
 * 时间: 2021/1/4 15:30
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class QuarantineD implements IquarantineB,IquarantineC{

    @Override
    public void method2() {
        Log.i("Quarantine","QuarantineD类 method2()实现");
    }

    @Override
    public void method3() {
        Log.i("Quarantine","QuarantineD类 method3()实现");
    }

    @Override
    public void method4() {
        Log.i("Quarantine","QuarantineD类 method4()实现");
    }
}
