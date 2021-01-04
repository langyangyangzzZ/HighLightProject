package demo.ht.com.heightproject.seven_principles.quarantine;

/**
 * @ClassName Iquarantine
 * 作者: szj
 * 时间: 2021/1/4 15:29
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 *
 * 接口隔离原则
 */
interface IquarantineA {
    void  method1();
    void  method5();
}

interface IquarantineB {
    void  method4();
}

 interface IquarantineC {
    void  method2();
    void  method3();
}
