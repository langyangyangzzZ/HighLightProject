package demo.ht.com.heightproject.seven_principles.dimiter;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StudentManager
 * 作者: szj
 * 时间: 2021/1/6 9:23
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class StudentManager {

    public void getStudentNumber(Student student) {

        ///未遵守迪米特原则
//        ArrayList<String> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(student.name+i);
//            Log.i("dimiter:","现在是第 "+i+"个学生,名字为: "+list.get(i));
//        }

        /// 遵守迪米特原则
        List<String> list = student.newStudentName();
        Log.i("dimiter:", "总共有 " + list.size() + "个学生 ");

    }
}
